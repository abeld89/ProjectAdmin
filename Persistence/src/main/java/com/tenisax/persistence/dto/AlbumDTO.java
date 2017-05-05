package com.tenisax.persistence.dto;

import java.util.Date;

import com.tenisax.persistence.mapper.annotation.MappingId;

public class AlbumDTO {
	
	
	@MappingId(id="albumsId")
	private Long id;
	
	@MappingId(id="albumsName")
	private String name;
	
	@MappingId(id="albumsIcon")
	private String icon;

	@MappingId(id="albumsPublicDate")
	private Date publicDate;
	
	@MappingId(id="albumsUserCreator")
	private String userCreator;
	
	
	@Override
	public String toString() {
		return "Album [id=" + id + ", name=" + name + ", icon=" + icon + ", publicDate=" + publicDate + ", userCreator="
				+ userCreator + "]";
	}

	public Date getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}

	public String getUserCreator() {
		return userCreator;
	}

	public void setUserCreator(String userCreator) {
		this.userCreator = userCreator;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((icon == null) ? 0 : icon.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((publicDate == null) ? 0 : publicDate.hashCode());
		result = prime * result + ((userCreator == null) ? 0 : userCreator.hashCode());
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
		AlbumDTO other = (AlbumDTO) obj;
		if (icon == null) {
			if (other.icon != null)
				return false;
		} else if (!icon.equals(other.icon))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publicDate == null) {
			if (other.publicDate != null)
				return false;
		} else if (!publicDate.equals(other.publicDate))
			return false;
		if (userCreator == null) {
			if (other.userCreator != null)
				return false;
		} else if (!userCreator.equals(other.userCreator))
			return false;
		return true;
	}
	
	
}