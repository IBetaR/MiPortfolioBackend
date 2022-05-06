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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String centro;
    private String titulo;
    private String descrip;
    private String img;
    private String puntaje;
    private String inicio;
    private String fin;
    private String status;
    private String url;

    public Educacion() {
    }

    public Educacion(Long id, String centro, String titulo, String descrip, String img, String puntaje, String inicio, String fin, String status, String url) {
        this.id = id;
        this.centro = centro;
        this.titulo = titulo;
        this.descrip = descrip;
        this.img = img;
        this.puntaje = puntaje;
        this.inicio = inicio;
        this.fin = fin;
        this.status = status;
        this.url = url;
    }
    
    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", Centro=" + centro + ", Descrip=" + descrip + ", titulo=" + titulo + ", puntaje=" + puntaje + '}';
    }
    
    
    
}
