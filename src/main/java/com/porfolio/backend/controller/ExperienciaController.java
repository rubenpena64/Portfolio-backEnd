
package com.porfolio.backend.controller;


import com.porfolio.backend.interfaces.IExperienciaService;
import com.porfolio.backend.model.Experiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



/**
 *
 * @author Ruben
 */
@RestController
@CrossOrigin(origins = {"https://porfoliofrontruben.web.app", "http://localhost:4200"})
public class ExperienciaController {
   
    @Autowired
    private IExperienciaService ExpeServ;
    

    @GetMapping ("/expe/ver")
    @ResponseBody
     public ResponseEntity<List<Experiencia>> list(){
         return new ResponseEntity(ExpeServ.verExperiencias(),HttpStatus.OK);
    }
    /*
    public List<Experiencia> verExpe(){
        return ExpeServ.verExperiencias();
    }
    */
    @PostMapping ("/expe/crear")
    public void agregarExpe(@RequestBody Experiencia expe){
        ExpeServ.crearExperiencia(expe);
    }
    
     @DeleteMapping ("/expe/borrar/{id}")
    public void borrarExpe(@PathVariable Long id){
        ExpeServ.borrarExperiencia(id);   
    }
    
    @PutMapping ("/expe/editar/{id}")
    public void editarExpe (@PathVariable Long id,
                           @RequestBody Experiencia expeModi){
        
        Experiencia expe= ExpeServ.buscarExperiencia(id);
        if(expe !=null){
            expe=expeModi;
            expe.setId(id);  
            ExpeServ.crearExperiencia(expe);
        }
       
     
        
    }
     
}

