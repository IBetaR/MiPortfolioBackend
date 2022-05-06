/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ilich
 */
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String cargo;
    private String empresa;
    private String descrip;
    private String img;
    private String modalidad;
    private String inicio;
    private String fin;
    private String duracion;

    public Experiencia() {
    }

    public Experiencia(Long id, String cargo, String empresa, String descrip, String img, String modalidad, String inicio, String fin, String duracion) {
        this.id = id;
        this.cargo = cargo;
        this.empresa = empresa;
        this.descrip = descrip;
        this.img = img;
        this.modalidad = modalidad;
        this.inicio = inicio;
        this.fin = fin;
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", Empresa=" + empresa + ", cargo=" + cargo + ", Descripción=" + descrip + '}';
    }
    
    
    
}
