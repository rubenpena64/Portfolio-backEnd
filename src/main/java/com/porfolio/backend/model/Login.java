/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ruben
 */
@Getter @Setter
@Entity
public class Login {    
    @Id    
    private long id = 1;
    @NotBlank
    private String nombre;
    @NotBlank
    private String pass;

    public Login(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    public Login() {
    }
    
    
   
}
