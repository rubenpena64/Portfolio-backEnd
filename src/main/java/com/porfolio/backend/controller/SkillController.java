/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.controller;

import com.porfolio.backend.interfaces.ISkillService;
import com.porfolio.backend.model.Skill;
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
@CrossOrigin(origins = {"https://porfoliofrontruben.web.app", "http://localhost:4200"})
public class SkillController {
    
    @Autowired
    private ISkillService SkiServ;
    
    @GetMapping ("/skill/ver")
    @ResponseBody
    public List<Skill> verSkill(){
        return SkiServ.verSkill();
    }   
    
    @PostMapping ("/skill/crear")
    public void agregarSkill(@RequestBody Skill ski){
        SkiServ.crearSkill(ski);
    }
    
    @DeleteMapping ("/skill/borrar/{id}")
    public void borrarSkill(@PathVariable Long id){
        SkiServ.borrarSkill(id);   
    }
    
     @PutMapping ("/skill/editar/{id}")
    public void editarSkill (@PathVariable Long id,
                            @RequestBody Skill skiModi){
        
        Skill ski= SkiServ.buscarSkill(id);
        if(ski != null)
        {
        ski=skiModi;
        ski.setId(id);     
        SkiServ.crearSkill(ski);
        }
    }
    
    
}
