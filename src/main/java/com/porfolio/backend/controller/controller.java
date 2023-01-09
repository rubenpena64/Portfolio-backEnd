package com.porfolio.backend.controller;

import com.porfolio.backend.interfaces.IPersonaService;
import com.porfolio.backend.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ruben
 */
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class controller {
    @Autowired
    private IPersonaService persoServ;
    
    
     @GetMapping ("/")
    @ResponseBody
    public String responderRaiz(){
        return "<p><h3>Ruben Peña</h3></p><p><h4>Porfolio personal</h4></p>";
    }   
    
    @GetMapping ("/persona/ver")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }   
    
    @PostMapping ("/persona/crear")
    public void agregarPersona(@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
    @DeleteMapping ("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);   
    }
    
    @PutMapping ("/persona/editar/{id}")
    public void editarPersona (@PathVariable Long id,
                                @RequestBody Persona perModi){
        Persona per= persoServ.buscarPersona(id);
        if(per != null)
        {
            per=perModi;
            per.setId(id);      
        persoServ.crearPersona(per);
        }
    }
    
    @GetMapping ("/persona/ver/miperfil")
    @ResponseBody
    public Persona verUnaPersona(){
        long miId = 1;
        return persoServ.buscarPersona(miId);
    }   
}
