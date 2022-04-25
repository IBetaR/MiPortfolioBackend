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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombre;
    private String descripcion;
    private String url;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String url) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
    }
    
}
