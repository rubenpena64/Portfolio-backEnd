package com.porfolio.backend.service;

import com.porfolio.backend.interfaces.IPersonaService;
import com.porfolio.backend.model.Persona;
import com.porfolio.backend.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class PersonaService  implements IPersonaService {
    @Autowired
    public IPersonaRepository persoRepo;
            
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
       persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
      persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
      return persoRepo.findById(id).orElse(null);
    }
}
