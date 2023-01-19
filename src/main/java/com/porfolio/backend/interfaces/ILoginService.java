/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.backend.interfaces;

import com.porfolio.backend.model.Login;

/**
 *
 * @author Ruben
 */
public interface ILoginService {
   
   public void crearUser(Login logi);  
   public Login buscarUser(long id);
}
