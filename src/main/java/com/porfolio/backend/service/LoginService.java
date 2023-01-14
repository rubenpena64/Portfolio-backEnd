/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.service;

import com.porfolio.backend.interfaces.ILoginService;
import com.porfolio.backend.model.Login;
import com.porfolio.backend.repository.ILoginRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class LoginService implements ILoginService {
    @Autowired
    public ILoginRepository logRepo;
    
   /*
    @Override
    public void crearUser(Login logi) {
        long id=1;
        logi.setId(id);
        logRepo.save(logi);       
    }
    */
    
    @Override
    public Login buscarUser(Long id) {
       return logRepo.findById(id).orElse(null);
    }
    
    
}
