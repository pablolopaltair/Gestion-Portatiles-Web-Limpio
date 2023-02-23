/**
 * 
 */
package gestionPortatilesWeb.aplicacion.dto;

import java.util.Calendar;

import gestionPortatilesWeb.aplicacion.dal.Portatil;

/**
 * @author Pablo: Clase que Implementa la Interfaz que convierte DAO a DTO y
 *         recopila los datos
 *
 */


public class ADTOImpl implements ADTO {

	
	//Recopila datos y los almacena en DTO
	@Override
	public AlumnoDTO AlumnosDAOaDTO(Calendar md_date, String nombre, String telefono, Portatil portatil) {

		AlumnoDTO DTO = new AlumnoDTO(md_date, nombre, telefono, portatil);
		return DTO;
	}

	//Recopila datos y los almacena en DTO
	@Override
	public PortatilDTO PortatilDAOaDTO(Calendar md_date, String marca, String modelo) {

		PortatilDTO DTO = new PortatilDTO(md_date, marca, modelo);
		return DTO;
	}
	

}