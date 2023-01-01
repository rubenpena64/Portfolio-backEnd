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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String titulo;
    @NotNull
    private String descrip; 
    private String link;
    private String foto;

    public Proyecto(String titulo, String descrip, String foto, String link) {
        this.titulo = titulo;
        this.descrip = descrip;
        this.foto = foto;
        this.link = link;
    }

    public Proyecto() {
    }
}
