

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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String empresa;
    private String anios;
    private String descrip;

    public Experiencia() {
    }

    public Experiencia(String empresa, String anios, String descrip) {
        this.empresa = empresa;
        this.anios = anios;
        this.descrip = descrip;
    }
    
    
}
