package com.ibm.prueba.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase modelo del Tarjeta
 * @author Andressadas
 *
 */
@Entity
@Table(name = "tarjeta")
public class Tarjeta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private long idTarjeta;

	private String ccvTarjeta;

	private String numeroTarjeta;

	private String tipoTarjeta;

	//bi-directional many-to-one association to Consumo
	@OneToMany(mappedBy="tarjeta")
	private List<Consumo> consumos;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Asesor
	@ManyToOne
	@JoinColumn(name="idAsesor")
	private Asesor asesor;

	public Tarjeta() {
	}

	public long getIdTarjeta() {
		return this.idTarjeta;
	}

	public void setIdTarjeta(long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getCcvTarjeta() {
		return this.ccvTarjeta;
	}

	public void setCcvTarjeta(String ccvTarjeta) {
		this.ccvTarjeta = ccvTarjeta;
	}

	public String getNumeroTarjeta() {
		return this.numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getTipoTarjeta() {
		return this.tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public List<Consumo> getConsumos() {
		return this.consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}

	public Consumo addConsumo(Consumo consumo) {
		getConsumos().add(consumo);
		consumo.setTarjeta(this);

		return consumo;
	}

	public Consumo removeConsumo(Consumo consumo) {
		getConsumos().remove(consumo);
		consumo.setTarjeta(null);

		return consumo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Asesor getAsesor() {
		return this.asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}
	
}
