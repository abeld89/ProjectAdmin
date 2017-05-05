package com.tenisax.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.tenisax.persistence.mapper.annotation.MappingId;

@Embeddable
public class PhotoAlbumPK implements Serializable{
	
	private static final long serialVersionUID = 1343031193472356974L;

	@Column(name="id_photo", nullable=false)
	@MappingId(id="photoAlbumIdPhoto")
	private Long idPhoto;
	
	@Column(name="id_album", nullable=false)
	@MappingId(id="photoAlbumIdAlbum")
	private Long idAlbum;

	public Long getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(Long idPhoto) {
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
		PhotoAlbumPK other = (PhotoAlbumPK) obj;
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
