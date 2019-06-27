package com.ibm.prueba.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.prueba.modelo.Tarjeta;
import com.ibm.prueba.repositorio.TarjetaRepositorio;

/**
 * Clase con los servicios de las tarjetas
 * @author Andressadas
 *
 */
@Service
public class TarjetaServicio implements TarjetaServicioLocal {

	@Autowired
	private TarjetaRepositorio tarjetaRepositorio;
	
	/**
	 * Consulta el Tarjeta filtrando por el ID
	 * @param idTarjeta
	 * @return
	 */
	@Override
	public Tarjeta consultarTarjeta(long idTarjeta) {
		return tarjetaRepositorio.findById(idTarjeta).get();
	}

	/**
	 * Retorna una lista de las Tarjetas
	 * @return
	 */
	@Override
	public List<Tarjeta> consultarListaTarjeta() {
		return (List<Tarjeta>) tarjetaRepositorio.findAll();
	}

	/**
	 * Registra la Tarjeta
	 * @param tarjeta
	 */
	@Override
	public void registrarTarjeta(Tarjeta tarjeta) {
		tarjetaRepositorio.save(tarjeta);
	}

	/**
	 * Edita la Tarjeta
	 * @param tarjeta
	 * @param idTarjeta
	 */
	@Override
	public void editarTarjeta(Tarjeta tarjeta, long idTarjeta) {
		tarjetaRepositorio.findById(idTarjeta).ifPresent((x)->{
			tarjeta.setIdTarjeta(idTarjeta);
			tarjetaRepositorio.save(tarjeta);
		});
	}

	/**
	 * Eliminar la Tarjeta
	 * @param idTarjeta
	 */
	@Override
	public void eliminarTarjeta(long idTarjeta) {
		tarjetaRepositorio.deleteById(idTarjeta);
	}

}
