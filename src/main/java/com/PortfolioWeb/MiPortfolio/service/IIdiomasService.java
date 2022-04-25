/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.Idiomas;
import java.util.List;

/**
 *
 * @author Ilich
 */
public interface IIdiomasService {
    
    public List<Idiomas> obtenerIdiomas ();
    public void crearIdiomas(Idiomas idioma);
    public void borrarIdiomas (Long id);
    public Idiomas obtenerIdiomas (Long id);
    public void modificarIdiomas(Idiomas idioma);
}
