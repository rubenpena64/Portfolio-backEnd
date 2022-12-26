/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Ruben
 */
@Getter @Setter
@Entity 
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String anios;
    private String descrip;

    public Educacion() {
    }

    public Educacion(String titulo, String anios, String descrip) {
        this.titulo = titulo;
        this.anios = anios;
        this.descrip = descrip;
    }   
    
}
