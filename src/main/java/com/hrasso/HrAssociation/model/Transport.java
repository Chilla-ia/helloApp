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
@Table(name = "transport")
public class Transport implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransport;

	private String transport;

	public Transport() {
	}

	public Transport(Long id, String transport) {
		this.idTransport = id;
		this.transport = transport;
	}

	public Transport(String transport) {
		this.transport = transport;
	}

	/*
	 * public Long getId() { return idTransport; }
	 * 
	 * public void setId(Long id) { this.idTransport = id; }
	 * 
	 * public String getTransport() { return transport; }
	 * 
	 * public void setTransport(String transport) { this.transport = transport; }
	 */

	@Override
	public String toString() {
		return "Transport [id=" + idTransport + ", transport=" + transport + "]";
	}

}
