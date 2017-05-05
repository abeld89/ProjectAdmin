package com.tenisax.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.tenisax.persistence.mapper.annotation.MappingId;

@Embeddable
public class NewTagPK implements Serializable{
	
	private static final long serialVersionUID = 1343031193472356974L;

	@Column(name="id_news", nullable=false)
	@MappingId(id="newsTagIdNews")
	private Long idNews;
	
	@Column(name="id_tag", nullable=false)
	@MappingId(id="newsTagIdTag")
	private Long idTag;

	public Long getIdNews() {
		return idNews;
	}

	public void setIdNews(Long idNews) {
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
		NewTagPK other = (NewTagPK) obj;
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
