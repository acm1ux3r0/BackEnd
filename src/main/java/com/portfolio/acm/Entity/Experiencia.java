/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Experiencia {
    //Vamos a poner las columnas que va a tener nuestra tabla en la DB.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Tipo de generación.
    private int id;
    private String nombreE;
    private String descripcionE;
    
    // <<<<<<<<<<<<<<<<     CONSTRUCTORES       >>>>>>>>>>>>>>>

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    
    // <<<<<<<<<<<<<<   GETTERS & SETTERS   >>>>>>>>>>>>>>>>>

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
