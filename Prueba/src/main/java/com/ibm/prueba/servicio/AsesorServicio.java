package com.ibm.prueba.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.prueba.modelo.Asesor;
import com.ibm.prueba.repositorio.AsesorRepositorio;

/**
 * Clase con los servicios del Asesor
 * @author Andressadas
 *
 */
@Service
public class AsesorServicio implements AsesorServicioLocal {

	@Autowired
	private AsesorRepositorio asesorRepositorio;
	
	/**
	 * Consulta el Asesor filtrando por el ID
	 * @param idAsesor
	 * @return
	 */
	@Override
	public Asesor consultarAsesor(long idAsesor) {
		return asesorRepositorio.findById(idAsesor).get();
	}

	/**
	 * Retorna una lista de los Asesores
	 * @return
	 */
	@Override
	public List<Asesor> consultarListaAsesor() {
		return  (List<Asesor>) asesorRepositorio.findAll();
	}

	/**
	 * Registra el Asesor
	 * @param asesor
	 */
	@Override
	public void registrarAsesor(Asesor asesor) {
		asesorRepositorio.save(asesor);
	}

	/**
	 * Editar el Asesor
	 * @param asesor
	 * @param idAsesor
	 */
	@Override
	public void editarAsesor(Asesor asesor, long idAsesor) {
		asesorRepositorio.findById(idAsesor).ifPresent((x)->{
			asesor.setIdAsesor(idAsesor);
			asesorRepositorio.save(asesor);
		});
	}

	/**
	 * Eliminar el Asesor
	 * @param idAsesor
	 */
	@Override
	public void eliminarAsesor(long idAsesor) {
		asesorRepositorio.deleteById(idAsesor);	
	}

}
