/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.Referencias;
import com.PortfolioWeb.MiPortfolio.repository.ReferenciasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class ReferenciasService implements IReferenciasService {
    
    @Autowired
    public ReferenciasRepository refRepo;
    
    @Override
    public List<Referencias> obtenerReferencias(){
        return refRepo.findAll();
    }
    
    @Override
    public void crearReferencias(Referencias referencia){
        refRepo.save(referencia);
    }
    
    @Override
    public void borrarReferencias (Long id){
         refRepo.deleteById(id);
    }
    
    @Override
    public Referencias obtenerReferencias (Long id){
        return refRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarReferencias(Referencias referencia){
        refRepo.save(referencia);
    }
    
}
