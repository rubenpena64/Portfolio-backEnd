/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backend.service;

import com.porfolio.backend.interfaces.ISkillService;
import com.porfolio.backend.model.Skill;
import com.porfolio.backend.repository.ISkillRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
@Transactional
public class SkillService implements ISkillService {
    
    @Autowired
    public ISkillRepository skillRepo;

    @Override
    public List<Skill> verSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill ski) {
        skillRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
}
