package com.porfolio.backend.controller;

import com.porfolio.backend.interfaces.IProyectoService;
import com.porfolio.backend.model.Proyecto;
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
//@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    @Autowired
     private IProyectoService proyeServ;
     
    @GetMapping ("/proye/ver")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyeServ.verProyectos();
    }   
     
    @PostMapping ("/proye/crear")
    public void agregarProyecto(@RequestBody Proyecto proye){
        proyeServ.crearProyecto(proye);
    }
    
    @DeleteMapping ("/proye/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyeServ.borrarProyecto(id);   
    }
    
    @PutMapping ("/proye/editar/{id}")
    public void editarProyecto (@PathVariable Long id,
                            @RequestBody Proyecto proModi){
        
        Proyecto pro= proyeServ.buscarProyecto(id);
        if(pro != null)
        {
        pro=proModi;
        pro.setId(id);     
        proyeServ.crearProyecto(pro);        
        }
    }
}
