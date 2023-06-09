/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.acm.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author acm1ux3r0
 */

public class dtoEducacion {
    
    @NotBlank //No puede estar vacío.
    private String nombreE;
    
    @NotBlank //No puede estar vacío.
    private String descripcionE;

//<<<<<<<<<<        CONSTRUCTORES       >>>>>>>>>>>
    
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

//<<<<<<<<<<        GETTERS & SETTERS      >>>>>>>>>>>>
    
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
