package com.ibm.prueba.servicio;

import java.util.List;

import com.ibm.prueba.modelo.Asesor;

/**
 * Interface con los servicios del Asesor
 * @author Andressadas
 *
 */
public interface AsesorServicioLocal {

	/**
	 * Consulta el Asesor filtrando por el ID
	 * @param idAsesor
	 * @return
	 */
	Asesor consultarAsesor(long idAsesor);
	
	/**
	 * Retorna una lista de los Asesores
	 * @return
	 */
	List<Asesor> consultarListaAsesor();
	
	/**
	 * Registra el Asesor
	 * @param asesor
	 */
	void registrarAsesor(Asesor Asesor);
	
	/**
	 * Editar el Asesor
	 * @param asesor
	 * @param idAsesor
	 */
	void editarAsesor(Asesor asesor, long idAsesor);
	
	/**
	 * Eliminar el Asesor
	 * @param idAsesor
	 */
	void eliminarAsesor(long idAsesor);
	
}
