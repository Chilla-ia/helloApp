package com.hrasso.HrAssociation.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sexe")
public class Sexe implements Serializable {

	// TODO : Comprendre à quoi sert cette ligne !
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSexe;

	private String sexe;

	public Sexe() {
	}

	public Sexe(Long id, String sexe) {
		this.idSexe = id;
		this.sexe = sexe;
	}

	public Sexe(String sexe) {
		this.sexe = sexe;
	}

	/*
	 * public Long getId() { return idSexe; }
	 * 
	 * public void setId(Long id) { this.idSexe = id; }
	 * 
	 * public String getSexe() { return sexe; }
	 * 
	 * public void setSexe(String sexe) { this.sexe = sexe; }
	 */

	@Override
	public String toString() {
		return "Sexe [id=" + idSexe + ", sexe=" + sexe + "]";
	}

}
