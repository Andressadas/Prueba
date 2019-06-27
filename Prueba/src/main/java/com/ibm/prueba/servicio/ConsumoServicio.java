package com.ibm.prueba.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.prueba.modelo.Consumo;
import com.ibm.prueba.repositorio.ConsumoRepositorio;

/**
 * Clase con los servicios del Consumo
 * @author Andressadas
 *
 */
@Service
public class ConsumoServicio implements ConsumoServicioLocal {

	@Autowired
	private ConsumoRepositorio consumoRepositorio;
	
	/**
	 * Consulta el Consumo filtrando por el ID
	 * @param idConsumo
	 * @return
	 */
	@Override
	public Consumo consultarConsumo(long idConsumo) {
		return consumoRepositorio.findById(idConsumo).get();
	}

	/**
	 * Retorna una lista de los Consumos
	 * @return
	 */
	@Override
	public List<Consumo> consultarListaConsumo() {
		return (List<Consumo>) consumoRepositorio.findAll();
	}

	/**
	 * Registra el Consumo
	 * @param consumo
	 */
	@Override
	public void registrarConsumo(Consumo consumo) {
		consumoRepositorio.save(consumo);
	}

	/**
	 * Editar el Consumo
	 * @param consumo
	 * @param idConsumo
	 */
	@Override
	public void editarConsumo(Consumo consumo, long idConsumo) {
		consumoRepositorio.findById(idConsumo).ifPresent((x)->{
			consumo.setIdConsumo(idConsumo);
			consumoRepositorio.save(consumo);
		});
	}

	/**
	 * Eliminar el Consumo
	 * @param idConsumo
	 */
	@Override
	public void eliminarConsumo(long idConsumo) {
		consumoRepositorio.deleteById(idConsumo);	
	}

}
