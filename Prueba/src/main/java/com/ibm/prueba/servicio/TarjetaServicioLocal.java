package com.ibm.prueba.servicio;

import java.util.List;

import com.ibm.prueba.modelo.Tarjeta;

/**
 * Interface con los servicios de las tarjetas
 * @author Andressadas
 *
 */
public interface TarjetaServicioLocal {

	/**
	 * Consulta el Tarjeta filtrando por el ID
	 * @param idTarjeta
	 * @return
	 */
	Tarjeta consultarTarjeta(long idTarjeta);
	
	/**
	 * Retorna una lista de las Tarjetas
	 * @return
	 */
	List<Tarjeta> consultarListaTarjeta();
	
	/**
	 * Registra la Tarjeta
	 * @param tarjeta
	 */
	void registrarTarjeta(Tarjeta tarjeta);
	
	/**
	 * Edita la Tarjeta
	 * @param tarjeta
	 * @param idTarjeta
	 */
	void editarTarjeta(Tarjeta tarjeta, long idTarjeta);
	
	/**
	 * Eliminar la Tarjeta
	 * @param idTarjeta
	 */
	void eliminarTarjeta(long idTarjeta);
	
}
