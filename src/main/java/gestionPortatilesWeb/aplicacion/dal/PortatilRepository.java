/**
 * 
 */
package gestionPortatilesWeb.aplicacion.dal;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Pablo: Interfaz para Portatil para hacer operaciones del CRUD gracias
 *         al "extends CrudRepository"
 */
@Repository
public interface PortatilRepository extends CrudRepository<Portatil, Long> {

}
