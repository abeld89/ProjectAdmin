package com.tenisax.persistence.dto;

public class PhotoTagDTO {


	private PhotoTagPKDTO id;

	public PhotoTagPKDTO getId() {
		return id;
	}

	public void setId(PhotoTagPKDTO id) {
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
		PhotoTagDTO other = (PhotoTagDTO) obj;
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
