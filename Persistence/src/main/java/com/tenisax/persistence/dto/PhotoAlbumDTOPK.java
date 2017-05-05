package com.tenisax.persistence.dto;

import java.io.Serializable;

import com.tenisax.persistence.mapper.annotation.MappingId;

public class PhotoAlbumDTOPK implements Serializable{
	
	private static final long serialVersionUID = 1343031193472356974L;

	@MappingId(id="photoAlbumIdPhoto")
	private String idPhoto;
	
	@MappingId(id="photoAlbumIdAlbum")
	private Long idAlbum;

	public String getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(String idPhoto) {
		this.idPhoto = idPhoto;
	}

	public Long getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Long idAlbum) {
		this.idAlbum = idAlbum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAlbum == null) ? 0 : idAlbum.hashCode());
		result = prime * result + ((idPhoto == null) ? 0 : idPhoto.hashCode());
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
		PhotoAlbumDTOPK other = (PhotoAlbumDTOPK) obj;
		if (idAlbum == null) {
			if (other.idAlbum != null)
				return false;
		} else if (!idAlbum.equals(other.idAlbum))
			return false;
		if (idPhoto == null) {
			if (other.idPhoto != null)
				return false;
		} else if (!idPhoto.equals(other.idPhoto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhotoAlbumPK [idPhoto=" + idPhoto + ", idAlbum=" + idAlbum + "]";
	}

	
	
}
