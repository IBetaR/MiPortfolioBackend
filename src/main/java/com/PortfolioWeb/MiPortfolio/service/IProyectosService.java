/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.Proyectos;
import java.util.List;

/**
 *
 * @author Ilich
 */
public interface IProyectosService {
    
    public List<Proyectos> obtenerProyectos ();
    public void crearProyectos(Proyectos proyecto);
    public void borrarProyectos (Long id);
    public Proyectos obtenerProyectos (Long id);
    public void modificarProyectos(Proyectos proyecto);
    
}
