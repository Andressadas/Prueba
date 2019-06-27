package com.ibm.prueba.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Clase modelo del Consumo
 * 
 * @author Andressadas
 *
 */
@Entity
@Table(name = "consumo")
public class Consumo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private long idConsumo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaConsumo;

	private int montoConsumo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Tarjeta
	@ManyToOne
	@JoinColumn(name="idTarjeta")
	private Tarjeta tarjeta;

	public Consumo() {
	}

	public long getIdConsumo() {
		return this.idConsumo;
	}

	public void setIdConsumo(long idConsumo) {
		this.idConsumo = idConsumo;
	}

	public Date getFechaConsumo() {
		return this.fechaConsumo;
	}

	public void setFechaConsumo(Date fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}

	public int getMontoConsumo() {
		return this.montoConsumo;
	}

	public void setMontoConsumo(int montoConsumo) {
		this.montoConsumo = montoConsumo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

}
