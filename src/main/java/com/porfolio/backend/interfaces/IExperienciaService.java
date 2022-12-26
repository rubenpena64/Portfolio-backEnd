
package com.porfolio.backend.interfaces;

import com.porfolio.backend.model.Experiencia;
import com.porfolio.backend.model.Persona;
import java.util.List;

/**
 *
 * @author Ruben
 */
public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia expe);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
}
