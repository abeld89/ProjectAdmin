package com.tenisax.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.tenisax.persistence.mapper.annotation.MappingId;

@Embeddable
public class PhotoTagPK implements Serializable{
	
	private static final long serialVersionUID = 1343031193472356974L;

	@Column(name="id_photo", nullable=false)
	@MappingId(id="photoTagIdPhoto")
	private Long idPhoto;
	
	@Column(name="id_tag", nullable=false)
	@MappingId(id="photoTagIdTag")
	private Long idTag;

	public Long getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(Long idPhoto) {
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
		PhotoTagPK other = (PhotoTagPK) obj;
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
