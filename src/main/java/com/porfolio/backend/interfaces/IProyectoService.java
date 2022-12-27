/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.backend.interfaces;

import com.porfolio.backend.model.Proyecto;
import java.util.List;

/**
 *
 * @author Ruben
 */
public interface IProyectoService {
    public List<Proyecto> verProyectos();
    public void crearProyecto(Proyecto per);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
}
