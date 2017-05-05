package com.tenisax.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tenisax.persistence.mapper.annotation.InspectInside;

@Entity
@Table(name = "photos_tags", schema = "tenisax")
public class PhotoTag {

	@EmbeddedId
	@InspectInside
	private PhotoTagPK id;

	public PhotoTagPK getId() {
		return id;
	}

	public void setId(PhotoTagPK id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PhotoTag other = (PhotoTag) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhotoTag [id=" + id + "]";
	}

	
	
}
