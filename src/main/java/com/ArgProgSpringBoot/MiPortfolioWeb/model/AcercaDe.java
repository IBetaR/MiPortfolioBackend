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
public class AcercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombrecompleto;
    private String titulo;
    private String resumencv;
    private String imagenperfil;

    public AcercaDe() {
    }

    public AcercaDe(Long id, String nombrecompleto, String titulo, String resumencv, String imagenperfil) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.titulo = titulo;
        this.resumencv = resumencv;
        this.imagenperfil = imagenperfil;
    }
    
    
    
}
