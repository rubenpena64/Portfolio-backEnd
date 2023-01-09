
package com.porfolio.backend.controller;

import com.porfolio.backend.interfaces.ILoginService;
import com.porfolio.backend.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ruben
 */
@RestController



@CrossOrigin(origins = "https://porfoliofrontruben.web.app")
public class LoginController {
    @Autowired
     private ILoginService logSer;
    
    
   
     @PostMapping ("/login/comp")
    public void login(@RequestBody Login logi) throws NotFoundException{
        long id=1;
        Login  lo = logSer.buscarUser(id);        
       if ((!lo.getNombre().equals(logi.getNombre()))|| (!lo.getPass().equals(logi.getPass()))){
           throw new NotFoundException();
       }             
    }
    
   @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Not Found")
    public class NotFoundException extends Exception {
    public NotFoundException() {
    }

   }
    
    @PutMapping ("/login/crear")
    public void lgNew(@RequestBody Login logi) {
       logSer.crearUser(logi);
    }
    
}
    
