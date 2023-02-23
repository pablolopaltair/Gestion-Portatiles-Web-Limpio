/**
 * 
 */
package gestionPortatilesWeb.aplicacion.dto;

import gestionPortatilesWeb.aplicacion.dal.Alumno;
import gestionPortatilesWeb.aplicacion.dal.Portatil;

/**
 * @author Pablo: Implementa el método que convierte DTO a DAO
 *
 */
public class ADAOImpl implements ADAO {

	@Override
	public Alumno AlumnosDTOaDAO(AlumnoDTO alumnoDTO) {
		String md_uuid = java.util.UUID.randomUUID().toString();//Generación de md_uuid random
		Alumno alumno = new Alumno();
		
		if (alumnoDTO != null) {
			alumno.setMd_uuid(md_uuid);//Se introduce el numero random generado arriba
			alumno.setMd_date(alumnoDTO.getMd_date());
			alumno.setNombre(alumnoDTO.getNombre());
			alumno.setTelefono(alumnoDTO.getTelefono());
			alumno.setPortatil(alumnoDTO.getPortatil());
		}

		return alumno;
	}

	@Override
	public Portatil PortatilDTOaDAO(PortatilDTO portatilDTO) {
		String md_uuid = java.util.UUID.randomUUID().toString();//Generación de md_uuid random
		Portatil portatil = new Portatil();
		if (portatilDTO !=null) {
			portatil.setMd_uuid(md_uuid);//Se introduce el numero random generado arriba
			portatil.setMd_date(portatil.getMd_date());
			portatil.setMarca(portatil.getMarca());;
			portatil.setModelo(portatil.getModelo());
		}
		return portatil;
	}

}