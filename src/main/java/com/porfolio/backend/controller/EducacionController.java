/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.controller;

import com.porfolio.backend.interfaces.IEducacionService;
import com.porfolio.backend.model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ruben
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    @Autowired
    private IEducacionService EduServ;
    
    @GetMapping ("/edu/ver")
    @ResponseBody
    public List<Educacion> verEdu(){
        return EduServ.verEducacion();
    }
    
    @PostMapping ("/edu/crear")
    public void agregarEdu(@RequestBody Educacion edu){
        EduServ.crearEducacion(edu);
    }
    
    @DeleteMapping ("/edu/borrar/{id}")
    public void borrarEdu(@PathVariable Long id){
        EduServ.borrarEducacion(id);
    }
    
    @PutMapping ("/edu/editar/{id}")
    public void editarEdu (@PathVariable Long id,
                           @RequestBody Educacion eduModi){
        
        Educacion edu= EduServ.buscarEducacion(id);
        edu.setAnios(eduModi.getAnios());
        edu.setTitulo(eduModi.getTitulo());
        edu.setDescrip(eduModi.getDescrip());
        
        EduServ.crearEducacion(edu);
        
    }
    
}
