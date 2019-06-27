package com.ibm.prueba.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase modelo del Asesor
 * @author Andressadas
 *
 */
@Entity
@Table(name = "asesor")
public class Asesor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private long idAsesor;

	private String nombreAsesor;

	private String tipoAsesor;

	//bi-directional many-to-one association to Tarjeta
	@OneToMany(mappedBy="asesor")
	private List<Tarjeta> tarjetas;

	public Asesor() {
	}

	public long getIdAsesor() {
		return this.idAsesor;
	}

	public void setIdAsesor(long idAsesor) {
		this.idAsesor = idAsesor;
	}

	public String getNombreAsesor() {
		return this.nombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}

	public String getTipoAsesor() {
		return this.tipoAsesor;
	}

	public void setTipoAsesor(String tipoAsesor) {
		this.tipoAsesor = tipoAsesor;
	}

	public List<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Tarjeta addTarjeta(Tarjeta tarjeta) {
		getTarjetas().add(tarjeta);
		tarjeta.setAsesor(this);

		return tarjeta;
	}

	public Tarjeta removeTarjeta(Tarjeta tarjeta) {
		getTarjetas().remove(tarjeta);
		tarjeta.setAsesor(null);

		return tarjeta;
	}
	
}
