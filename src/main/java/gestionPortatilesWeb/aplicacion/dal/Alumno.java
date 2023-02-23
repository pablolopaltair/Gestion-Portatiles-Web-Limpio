/**
 * 
 */
package gestionPortatilesWeb.aplicacion.dal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Pablo López: Clase que define nuestra Entidad Alumno así como su
 *         localización en BBDD
 */

@Entity
@Table(name = "alumnos", schema = "dlk_gestion")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "telefono", nullable = false)
	private String telefono;
	
	//metadatos
	@Column(name="md_uuid",nullable=false)
	private String md_uuid;
	
	@Column(name="md_date",nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar md_date;

	// Relación del alumno-ordenador (portatil)
	@OneToOne
	Portatil portatil;
	
	

	// GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}

	public Portatil getPortatil() {
		return portatil;
	}

	public void setPortatil(Portatil portatil) {
		this.portatil = portatil;
	}
	
}