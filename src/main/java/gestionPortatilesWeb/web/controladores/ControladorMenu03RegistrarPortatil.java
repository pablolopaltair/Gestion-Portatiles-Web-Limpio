/**
 * 
 */
package gestionPortatilesWeb.web.controladores;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gestionPortatilesWeb.aplicacion.dal.Portatil;
import gestionPortatilesWeb.aplicacion.dto.ADAO;
import gestionPortatilesWeb.aplicacion.dto.ADAOImpl;
import gestionPortatilesWeb.aplicacion.dto.PortatilDTO;
import gestionPortatilesWeb.aplicacion.services.Services;

/**
 * @author Pablo
 *
 */
@Controller
public class ControladorMenu03RegistrarPortatil {
	
	Services consulta = new Services();
	
	 protected final Log logger = LogFactory.getLog(getClass());
	    
	 Map<String, Object> miModelo = new HashMap<String, Object>();
	 ADAO ADAO = new ADAOImpl();
	 Portatil portatil =new Portatil();

		 @RequestMapping(value="/insertPortatil")
		    public String navegacionFormulario(Model modelo) {
		        logger.info("Navegamos al formulario");
		        PortatilDTO portatil = new PortatilDTO();
		        modelo.addAttribute("ordenadorInsertado", portatil);
		        return "menu_03_registrarPortatil";
		    } 

		@RequestMapping(value = "/guardarPortatil", method = RequestMethod.POST)
		public ModelAndView guardarPortatil(@ModelAttribute("ordenadorInsertado") PortatilDTO portatilInsertado) {
			
			portatil=ADAO.PortatilDTOaDAO(portatilInsertado);
			
			consulta.insertarUnOrdenador(portatil);
			
			miModelo.put("mensaje", "Ordenador insertado");

			return new ModelAndView("menu_03_registrarPortatil", "miModelo", miModelo);
		}

}
