package com.porfolio.backend.repository;

import com.porfolio.backend.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Ruben
 */
@Repository
public interface IProyectosRepository extends JpaRepository <Proyecto, Long>{
    
}
