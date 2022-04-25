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
public class Referencias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombrecompleto;
    private String linkedin;
    private String otrodato;

    public Referencias() {
    }

    public Referencias(Long id, String nombrecompleto, String linkedin, String otrodato) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.linkedin = linkedin;
        this.otrodato = otrodato;
    }
   
}
