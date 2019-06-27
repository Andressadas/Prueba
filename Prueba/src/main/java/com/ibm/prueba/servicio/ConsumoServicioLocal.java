package com.ibm.prueba.servicio;

import java.util.List;

import com.ibm.prueba.modelo.Consumo;

/**
 * Interface con los servicios del Consumo
 * @author Andressadas
 *
 */
public interface ConsumoServicioLocal {

	/**
	 * Consulta el Consumo filtrando por el ID
	 * @param idConsumo
	 * @return
	 */
	Consumo consultarConsumo(long idConsumo);
	
	/**
	 * Retorna una lista de los Consumos
	 * @return
	 */
	List<Consumo> consultarListaConsumo();
	
	/**
	 * Registra el Consumo
	 * @param consumo
	 */
	void registrarConsumo(Consumo consumo);
	
	/**
	 * Editar el Consumo
	 * @param consumo
	 * @param idConsumo
	 */
	void editarConsumo(Consumo consumo, long idConsumo);
	
	/**
	 * Eliminar el Consumo
	 * @param idConsumo
	 */
	void eliminarConsumo(long idConsumo);
	
}
