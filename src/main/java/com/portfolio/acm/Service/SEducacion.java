/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.acm.Service;

import com.portfolio.acm.Entity.Educacion;
import com.portfolio.acm.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acm1ux3r0
 */

@Service
@Transactional

public class SEducacion {

    @Autowired
    REducacion rEducacion;

    public List<Educacion> list() {
        return rEducacion.findAll();// Que arme una lista trayéndonos todo.
    }

    public Optional<Educacion> getOne(int id) {
        return rEducacion.findById(id); 
    }

    public Optional<Educacion> getByNombreE(String nombreE) {
        return rEducacion.findByNombreE(nombreE);
    }

    public void save(Educacion educacion) {
        rEducacion.save(educacion);//(this)
    }

    public void delete(int id) {
        rEducacion.deleteById(id);
    }

    public boolean existsById(int id) {
        return rEducacion.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return rEducacion.existsByNombreE(nombreE);
    }

}
