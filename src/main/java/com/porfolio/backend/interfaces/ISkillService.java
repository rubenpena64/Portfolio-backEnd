/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.backend.interfaces;

import com.porfolio.backend.model.Skill;
import java.util.List;

/**
 *
 * @author Ruben
 */
public interface ISkillService {
    
    public List<Skill> verSkill();
    public void crearSkill(Skill per);
    public void borrarSkill(Long id);
    public Skill buscarSkill(Long id);
    
}