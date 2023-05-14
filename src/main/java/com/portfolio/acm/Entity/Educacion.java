/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.acm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author acm1ux3r0
 */

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    
//<<<<<<<<<<<<      CONTRUCTORES       >>>>>>>>>>>>>>
    
    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE) {
        //Sin Id porque va a ser incremental.
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

//<<<<<<<<<<<<<<<       GETTERS & SETTERS       >>>>>>>>>>>>>>>>
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }        
}
