package com.tenisax.persistence.dto;

import java.util.Date;

import com.tenisax.persistence.mapper.annotation.MappingId;

public class EventDTO {

	@MappingId(id="eventsId")
	private Long id;
	
	@MappingId(id="eventsTitle")
	private String titleEvent;
	
	@MappingId(id="eventsDateInit")
	private Date dateInit;
	
	@MappingId(id="eventsDateEnd")
	private Date dateEnd;
	
	@MappingId(id="eventsTextEvent")
	private String description;
	
	@MappingId(id="eventsUserCreator")
	private Long userCreatorId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitleEvent() {
		return titleEvent;
	}

	public void setTitleEvent(String titleEvent) {
		this.titleEvent = titleEvent;
	}

	public Date getDateInit() {
		return dateInit;
	}

	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
		result = prime * result + ((dateInit == null) ? 0 : dateInit.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titleEvent == null) ? 0 : titleEvent.hashCode());
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
		EventDTO other = (EventDTO) obj;
		if (dateEnd == null) {
			if (other.dateEnd != null)
				return false;
		} else if (!dateEnd.equals(other.dateEnd))
			return false;
		if (dateInit == null) {
			if (other.dateInit != null)
				return false;
		} else if (!dateInit.equals(other.dateInit))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titleEvent == null) {
			if (other.titleEvent != null)
				return false;
		} else if (!titleEvent.equals(other.titleEvent))
			return false;
		if (userCreatorId == null) {
			if (other.userCreatorId != null)
				return false;
		} else if (!userCreatorId.equals(other.userCreatorId))
			return false;
		return true;
	}
	
	
	
}
