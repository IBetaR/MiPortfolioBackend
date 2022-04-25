package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author Ilich
 */
public interface IEducacionService {
    
    public List<Educacion> obtenerEducacion ();
    public void crearEducacion(Educacion educacion);
    public void borrarEducacion (Long id);
    public Educacion obtenerEducacion (Long id);
    public void modificarEducacion(Educacion educacion);
}
