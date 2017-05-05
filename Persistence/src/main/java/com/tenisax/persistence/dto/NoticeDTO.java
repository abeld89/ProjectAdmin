package com.tenisax.persistence.dto;

import java.util.Date;

import com.tenisax.persistence.mapper.annotation.MappingId;

public class NoticeDTO {

	@MappingId(id="newsId")
	private Long id;
	
	@MappingId(id="newsTitle")
	private String title;
	
	@MappingId(id="newsText")
	private String text;
	
	@MappingId(id="newsPublicDate")
	private Date publicDate;
	
	@MappingId(id="newsFile")
	private String file;
	
	@MappingId(id="newsUserCreator")
	private Long userCreatorId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Long getUserCreatorId() {
		return userCreatorId;
	}

	public void setUserCreatorId(Long userCreatorId) {
		this.userCreatorId = userCreatorId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((publicDate == null) ? 0 : publicDate.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((userCreatorId == null) ? 0 : userCreatorId.hashCode());
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
		NoticeDTO other = (NoticeDTO) obj;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (publicDate == null) {
			if (other.publicDate != null)
				return false;
		} else if (!publicDate.equals(other.publicDate))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userCreatorId == null) {
			if (other.userCreatorId != null)
				return false;
		} else if (!userCreatorId.equals(other.userCreatorId))
			return false;
		return true;
	}
	
	
}
