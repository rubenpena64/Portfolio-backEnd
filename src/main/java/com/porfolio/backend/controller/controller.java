package com.porfolio.backend.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ruben
 */
@RestController
@CrossOrigin(origins = {"https://porfoliofrontruben.web.app", "http://localhost:4200"})
public class controller {

    
    
     @GetMapping ("/")
    @ResponseBody
    public String responderRaiz(){
        return "<p><h3>Ruben Peña</h3></p><p><h4>Porfolio personal</h4></p>";
    }    
}
