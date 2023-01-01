/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ruben
 */
@Getter @Setter
@Entity 
public class Acerca {
    @Id    
    private long id=1;
    
    private String linea1; 
    private String linea2;
    private String linea3;   

    public Acerca() {
    }

    public Acerca(String linea1, String linea2, String linea3) {
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.linea3 = linea3;  
       
    }
    
    
}
