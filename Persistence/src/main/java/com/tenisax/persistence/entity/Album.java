package com.tenisax.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tenisax.persistence.mapper.annotation.MappingId;

@Entity
@Table(name = "albums", schema = "tenisax")
public class Album {
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue
	@MappingId(id="albumsId")
	private Long id;
	
	@Column(name = "name", nullable=false)
	@MappingId(id="albumsName")
	private String name;
	
	@Column(name = "icon")
	@MappingId(id="albumsIcon")
	private String icon;

	@Column(name = "public_date")
	@MappingId(id="albumsPublicDate")
	private Date publicDate;
	
	@Column(name = "user_creator")
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
		Album other = (Album) obj;
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
