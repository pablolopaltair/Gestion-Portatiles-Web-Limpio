/**
 * 
 */
package gestionPortatilesWeb.aplicacion.dto;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import gestionPortatilesWeb.aplicacion.dal.Portatil;

/**
 * @author Pablo: DTO de Alumno
 *
 */
@Service
public class AlumnoDTO {

	//ATRIBUTOS
	private String nombre;
	private String telefono;
	private Calendar md_date;
	Portatil portatil;
	
	
	//CONSTRUCTOR !--(md_date provisional)
	public AlumnoDTO(Calendar md_date, String nombre, String telefono, Portatil portatil) {
		super();
		this.md_date = md_date; //!--provisional
		this.nombre = nombre;
		this.telefono = telefono;
		this.portatil = portatil;
	}
	
	
	public AlumnoDTO() {
		super();
	}



	//GETTERS Y SETTERS
	/**
	 * md_date provisional getter y setters
	 */
	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Portatil getPortatil() {
		return portatil;
	}
	public void setPortatil(Portatil portatil) {
		this.portatil = portatil;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Alumno: [ md_date:" + md_date + "] [ Nombre:" + nombre + "] [ Teléfono:" + telefono + "] [ Portatil: " + portatil + "]";
	}
	
	
	
}