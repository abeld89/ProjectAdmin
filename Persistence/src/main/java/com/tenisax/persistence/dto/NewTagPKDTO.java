package com.tenisax.persistence.dto;

import java.io.Serializable;

import com.tenisax.persistence.mapper.annotation.MappingId;

public class NewTagPKDTO implements Serializable{
	
	private static final long serialVersionUID = 1343031193472356974L;

	@MappingId(id="newsTagIdNews")
	private String idNews;
	
	@MappingId(id="newsTagIdTag")
	private Long idTag;

	public String getIdNews() {
		return idNews;
	}

	public void setIdNews(String idNews) {
		this.idNews = idNews;
	}

	public Long getIdTag() {
		return idTag;
	}

	public void setIdTag(Long idTag) {
		this.idTag = idTag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idNews == null) ? 0 : idNews.hashCode());
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
		NewTagPKDTO other = (NewTagPKDTO) obj;
		if (idNews == null) {
			if (other.idNews != null)
				return false;
		} else if (!idNews.equals(other.idNews))
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
		return "NewTagPK [idNews=" + idNews + ", idTag=" + idTag + "]";
	}
	
	
}
