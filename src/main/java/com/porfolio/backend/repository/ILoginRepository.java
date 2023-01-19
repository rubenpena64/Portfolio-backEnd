/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.backend.repository;

import com.porfolio.backend.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Ruben
 */
@Repository
public interface ILoginRepository extends JpaRepository <Login, Long>{
    
}
/*
spring.datasource.hikari.connection-timeout = 20000 #maximum number of milliseconds that a client will wait for a connection
spring.datasource.hikari.minimum-idle= 10 #minimum number of idle connections maintained by HikariCP in a connection pool
spring.datasource.hikari.maximum-pool-size= 10 #maximum pool size
spring.datasource.hikari.idle-timeout=10000 #maximum idle time for connection
spring.datasource.hikari.max-lifetime= 1000 # maximum lifetime in milliseconds of a connection in the pool after it is closed.
spring.datasource.hikari.auto-commit =true #default auto-commit behavior.
*/