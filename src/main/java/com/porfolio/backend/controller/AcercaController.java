
package com.porfolio.backend.controller;

//import com.porfolio.backend.interfaces.IAcercaService;
//import com.porfolio.backend.model.Acerca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ruben



@RestController

@CrossOrigin(origins = {"https://porfoliofrontruben.web.app", "http://localhost:4200"})

public class AcercaController {
    @Autowired
    private IAcercaService AceServ;
      
    @GetMapping ("/acerca/ver")
    @ResponseBody
      public ResponseEntity<Acerca> Acerca(){
         return new ResponseEntity(AceServ.verAcerca(),HttpStatus.OK);
    }
    /*
    public Acerca verAcerca(){
        return AceServ.verAcerca();
    }     
    
    @PutMapping ("/acerca/editar/{id}")
    public void editarAcerca (@PathVariable Long id,
                                @RequestBody Acerca aceModi){
       AceServ.crearAcerca(aceModi);        
    }    
}
 */