package com.tenisax.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tenisax.persistence.mapper.annotation.MappingId;

@Entity
@Table(name = "persistence_login", schema = "tenisax")
public class PersistenceLogin {

	@Id
	@Column(name="user_id", nullable=false)
	@MappingId(id="persistenceLoginId")
	private Long idUser;
	
	@Column(name="token", nullable=false)
	@MappingId(id="persistenceLoginToken")
	private String token;
	
	@Column(name="last_logged", nullable=false)
	@MappingId(id="persistenceLoginLastLogged")
	private Date lastLogged;
	
	@Column(name="text_aux")
	@MappingId(id="persistenceLoginTextAux")
	private String auxText;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLastLogged() {
		return lastLogged;
	}

	public void setLastLogged(Date lastLogged) {
		this.lastLogged = lastLogged;
	}

	public String getAuxText() {
		return auxText;
	}

	public void setAuxText(String auxText) {
		this.auxText = auxText;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auxText == null) ? 0 : auxText.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result + ((lastLogged == null) ? 0 : lastLogged.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
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
		PersistenceLogin other = (PersistenceLogin) obj;
		if (auxText == null) {
			if (other.auxText != null)
				return false;
		} else if (!auxText.equals(other.auxText))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		if (lastLogged == null) {
			if (other.lastLogged != null)
				return false;
		} else if (!lastLogged.equals(other.lastLogged))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}
	
	
}
