package com.hrasso.HrAssociation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "event")
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvent;

	private String nom;

	private Date date;

	private String lieu;

	private String description;

	public Event() {
	}

	public Event(Long id, String nom) {
		this.idEvent = id;
		this.nom = nom;
	}

	public Event(String nom) {
		this.nom = nom;
	}

	public Event(String nom, Date date, String lieu) {
		this.nom = nom;
		this.date = date;
		this.lieu = lieu;
	}

	public Event(Long id, String nom, Date date, String lieu, String description) {
		this.idEvent = id;
		this.nom = nom;
		this.date = date;
		this.lieu = lieu;
		this.description = description;
	}

	/*
	 * public Long getId() { return idEvent; }
	 * 
	 * public void setId(Long id) { this.idEvent = id; }
	 * 
	 * public String getNom() { return nom; }
	 * 
	 * public void setNom(String nom) { this.nom = nom; }
	 * 
	 * public Date getDate() { return date; }
	 * 
	 * public void setDate(Date date) { this.date = date; }
	 * 
	 * public String getLieu() { return lieu; }
	 * 
	 * public void setLieu(String lieu) { this.lieu = lieu; }
	 * 
	 * public String getDescription() { return description; }
	 * 
	 * public void setDescription(String description) { this.description =
	 * description; }
	 */

	@Override
	public String toString() {
		return "Event [id=" + idEvent + ", nom=" + nom + ", date=" + date + ", lieu=" + lieu + ", description="
				+ description + "]";
	}

}
