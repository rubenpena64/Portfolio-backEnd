package com.porfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    private String habilidad; 
    
    
    private String nivel;

    public Skill() {
    }

    public Skill(String habilidad, String nivel) {
        this.habilidad = habilidad;
        this.nivel = nivel;
    }
}
