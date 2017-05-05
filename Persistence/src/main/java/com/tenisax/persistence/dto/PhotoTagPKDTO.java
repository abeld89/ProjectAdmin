package com.tenisax.persistence.dto;

import java.io.Serializable;

import com.tenisax.persistence.mapper.annotation.MappingId;

public class PhotoTagPKDTO implements Serializable{
	
	private static final long serialVersionUID = 1343031193472356974L;

	@MappingId(id="photoTagIdPhoto")
	private String idPhoto;
	
	@MappingId(id="photoTagIdTag")
	private Long idTag;

	public String getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(String idPhoto) {
		this.idPhoto = idPhoto;
	}

	public Long getIdTag() {
		return idTag;
	}

	public void setIdTag(Long idTag) {
		this.idTag = idTag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPhoto == null) ? 0 : idPhoto.hashCode());
		result = prime * result + ((idTag == null) ? 0 : idTag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhotoTagPKDTO other = (PhotoTagPKDTO) obj;
		if (idPhoto == null) {
			if (other.idPhoto != null)
				return false;
		} else if (!idPhoto.equals(other.idPhoto))
			return false;
		if (idTag == null) {
			if (other.idTag != null)
				return false;
		} else if (!idTag.equals(other.idTag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhotoTagPK [idPhoto=" + idPhoto + ", idTag=" + idTag + "]";
	}

	
	
}
