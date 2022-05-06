/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.service;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.AcercaDe;
import java.util.List;

/**
 *
 * @author Ilich
 */
public interface IAcercaDeService {
    
    public AcercaDe crearAcercaDe (AcercaDe acercade);
    public List<AcercaDe> obtenerAcercaDe ();
    public void borrarAcercaDe (Long id);
    public AcercaDe obtenerAcercaDe (Long id);
    public void modificarAcercaDe(AcercaDe acercade);
    
}
