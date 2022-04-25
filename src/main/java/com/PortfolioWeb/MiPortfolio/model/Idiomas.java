/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.model;

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
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String idioma;
    private String nivel;
    private int habla;
    private int lee;
    private int escribe;

    public Idiomas() {
    }

    public Idiomas(Long id, String idioma, String nivel, int habla, int lee, int escribe) {
        this.id = id;
        this.idioma = idioma;
        this.nivel = nivel;
        this.habla = habla;
        this.lee = lee;
        this.escribe = escribe;
    }
    
}
