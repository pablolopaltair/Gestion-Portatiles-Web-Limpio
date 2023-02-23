/**
 * 
 */
package gestionPortatilesWeb.aplicacion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionPortatilesWeb.aplicacion.dal.*;

/**
 * @author Pablo López
 *
 */
@Service
public class Services {

	@Autowired
	private AlumnoRepository aluRepo;
	@Autowired
	private PortatilRepository porRepo;



	// INSERTAR ODENADOR
	@Transactional
	public void insertarUnOrdenador(Portatil portatil) {
		porRepo.save(portatil);
	}



}