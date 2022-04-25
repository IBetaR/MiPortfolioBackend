/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.HaSs;
import java.util.List;

/**
 *
 * @author Ilich
 */
public interface IHaSsService {
    
    public List<HaSs> obtenerHabilidad ();
    public void crearHabilidad(HaSs hass);
    public void borrarHabilidad (Long id);
    public HaSs obtenerHabilidad (Long id);
    public void modificarHabilidad(HaSs hass);
}
