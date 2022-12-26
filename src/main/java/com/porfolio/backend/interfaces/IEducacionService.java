/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.backend.interfaces;

import com.porfolio.backend.model.Educacion;
import java.util.List;

/**
 *
 * @author Ruben
 */
public interface IEducacionService {
    
   public List<Educacion> verEducacion();
   public void crearEducacion(Educacion edu);
   public void borrarEducacion(Long id);
   public Educacion buscarEducacion(Long id);
   
}
