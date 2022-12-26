
package com.porfolio.backend.service;

import com.porfolio.backend.interfaces.IExperienciaService;
import com.porfolio.backend.model.Experiencia;
import com.porfolio.backend.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public IExperienciaRepository expeRepo;
   
    @Override
    public List<Experiencia> verExperiencias() {
     return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
       expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
       return expeRepo.findById(id).orElse(null);
    }
   
}
