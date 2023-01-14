
package com.porfolio.backend.service;

import com.porfolio.backend.interfaces.IProyectoService;
import com.porfolio.backend.model.Proyecto;
import com.porfolio.backend.repository.IProyectosRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public IProyectosRepository proyeRepo;
    
    @Override
    public List<Proyecto> verProyectos() {
         return proyeRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyeRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }
    
    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }
    
}
