/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.service;

import com.porfolio.backend.interfaces.IEducacionService;
import com.porfolio.backend.model.Educacion;
import com.porfolio.backend.repository.IEducacionRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public IEducacionRepository eduRepo;
    
    @Override
    public List<Educacion> verEducacion() {
          return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
         eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
      eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
