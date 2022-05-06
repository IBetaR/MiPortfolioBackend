/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.service;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Referencias;
import java.util.List;

/**
 *
 * @author Ilich
 */
public interface IReferenciasService {
    
    public List<Referencias> obtenerReferencias ();
    public Referencias crearReferencias(Referencias referencia);
    public void borrarReferencias (Long id);
    public Referencias obtenerReferencias (Long id);
    public void modificarReferencias(Referencias referencia);
    
}
