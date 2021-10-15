package com.hrasso.HrAssociation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "guest")
public class Guest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGuest", updatable = false, nullable = false)
	private Long idGuest;

	@Column(name = "name", insertable = true, updatable = true, nullable = false)
	private String name;

	// Pas besoin de mettre de @Column quand le nom du champ est identique à celui
	// de la colonne de la bdd
	private String lastName;

	private String email;

	private String comment;

	@ManyToOne
	private Sexe sexes;

	@ManyToOne
	private Transport transports;

	@ManyToOne
	private Event events;

	public Guest() {
	}

	public Guest(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public Guest(Long id, String name, String lastName) {
		this.idGuest = id;
		this.name = name;
		this.lastName = lastName;
	}

	public Guest(String name, String lastName, String email) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
	}

	public Guest(String name, String lastName, String email, String comment) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.comment = comment;
	}

// Pas besoin des getteurs et des Setteurs car on utilise Lombak qui le fait automatiquement (@Data)	
	/*
	 * public Long getId() { return idGuest; }
	 * 
	 * public void setId(Long id) { this.idGuest = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getLastName() { return lastName; }
	 * 
	 * public void setPassword(String lastName) { this.lastName = lastName; }
	 * 
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 * 
	 * public String getComment() { return comment; }
	 * 
	 * public void setComment(String comment) { this.comment = comment; }
	 * 
	 * public Sexe getSexes() { return sexes; }
	 * 
	 * public void setSexes(Sexe sexes) { this.sexes = sexes; }
	 * 
	 * public Transport getTransports() { return transports; }
	 * 
	 * public void setTransports(Transport transports) { this.transports =
	 * transports; }
	 * 
	 * public Event getEvents() { return events; }
	 * 
	 * public void setEvents(Event events) { this.events = events; }
	 */

	@Override
	public String toString() {
		return "User [id=" + idGuest + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", comment="
				+ comment + ", sexe=" + sexes + ", transport=" + transports + ", event=" + events + "]";
	}

}
