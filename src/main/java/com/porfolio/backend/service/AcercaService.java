/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.service;

import com.porfolio.backend.interfaces.IAcercaService;
import com.porfolio.backend.model.Acerca;
import com.porfolio.backend.repository.IAcercaRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
@Transactional
public class AcercaService implements IAcercaService {
    @Autowired
    public IAcercaRepository acercaRepo;
    Acerca ace = new Acerca("","","");
    
    @Override
    public Acerca verAcerca() {
        long id=1;        
        return acercaRepo.findById(id).orElse(ace);
    }

    @Override
    public void crearAcerca(Acerca ace) {
        long id=1;
        ace.setId(id);
        acercaRepo.save(ace);
    }
    
}
