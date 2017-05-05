package com.tenisax.persistence.mapper;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.tenisax.persistence.mapper.annotation.InspectInside;
import com.tenisax.persistence.mapper.annotation.MappingId;


public class Mapper<T, O> {

	private Class<T> dto;
	private Class<O> entidad;
	public Mapper(Class<T> dto, Class<O> entidad){
		this.dto=dto;
		this.entidad=entidad;
	}
	
	public O mapDTO2Entidad(T dto) throws InstantiationException, IllegalAccessException, IntrospectionException, IllegalArgumentException, InvocationTargetException{
		O resultado=(O) this.entidad.newInstance();
		Map<String,Method> getters = findGetterAndSetters(this.dto,Boolean.TRUE);
		Map<String,Method> setters =findGetterAndSetters(this.entidad,Boolean.FALSE);
		Set<String> mappingIds = getters.keySet();//getter y setter generan el mismo keyset
		for(String id:mappingIds){
			Method getter = getters.get(id);
			Method setter = setters.get(id);
			setter.invoke(resultado, getter.invoke(dto));
		}
		return resultado;
	}
	
	public T mapEntidad2DTO( O entidad) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IntrospectionException{
		T resultado=(T) this.dto.newInstance();
		Map<String,Method> getters = findGetterAndSetters(this.entidad,Boolean.TRUE);
		Map<String,Method> setters =findGetterAndSetters(this.dto,Boolean.FALSE);
		Set<String> mappingIds = getters.keySet();//getter y setter generan el mismo keyset
		for(String id:mappingIds){
			Method getter = getters.get(id);
			Method setter = setters.get(id);
			setter.invoke(resultado, getter.invoke(entidad));
		}
		return resultado;
	}
	
	private Map<String,Method> findGetterAndSetters(Class<?> clase, Boolean getGetter) throws IntrospectionException{
		Map<String,Method> result = new HashMap<>();
		for (Field f: clase.getDeclaredFields()) {
			if(f.isAnnotationPresent(MappingId.class)){
				PropertyDescriptor pd = new PropertyDescriptor(f.getName(), clase);
				if(getGetter){
					result.put(f.getAnnotation(MappingId.class).id(), pd.getReadMethod());
				}else{
					result.put(f.getAnnotation(MappingId.class).id(), pd.getWriteMethod());
				}
				
			}else if(f.isAnnotationPresent(InspectInside.class)){
				result.putAll(findGetterAndSetters(f.getClass(),getGetter));
			}
		}
		return result;
	}
}
