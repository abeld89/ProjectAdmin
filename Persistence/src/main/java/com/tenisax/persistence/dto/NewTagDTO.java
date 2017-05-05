package com.tenisax.persistence.dto;

public class NewTagDTO {

	private NewTagPKDTO id;

	public NewTagPKDTO getId() {
		return id;
	}

	public void setId(NewTagPKDTO id) {
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
		NewTagDTO other = (NewTagDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NewTag [id=" + id + "]";
	}
	
	
	
}
