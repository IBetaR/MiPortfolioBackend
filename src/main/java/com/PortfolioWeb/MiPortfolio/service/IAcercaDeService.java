/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.AcercaDe;

/**
 *
 * @author Ilich
 */
public interface IAcercaDeService {
    
    public void crearAcercaDe (AcercaDe acercade);
    public void obtenerAcercaDe ();
    public void borrarAcercaDe (Long id);
    public AcercaDe obtenerAcercaDe (Long id);
    public void modificarAcercaDe(AcercaDe acercade);
    
}
