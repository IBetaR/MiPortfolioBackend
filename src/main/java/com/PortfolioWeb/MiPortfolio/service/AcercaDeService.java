/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.AcercaDe;
import com.PortfolioWeb.MiPortfolio.repository.AcercaDeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class AcercaDeService implements IAcercaDeService {
    
    @Autowired
    public AcercaDeRepository acdRepo;
    
    @Override
    public void obtenerAcercaDe(){
        acdRepo.findAll();
    }
    
    @Override
    public void crearAcercaDe(AcercaDe acercade){
        acdRepo.save(acercade);
    }
    
    @Override
    public void borrarAcercaDe (Long id){
         acdRepo.deleteById(id);
    }
    
    @Override
    public AcercaDe obtenerAcercaDe (Long id){
        return acdRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarAcercaDe(AcercaDe acercade){
        acdRepo.save(acercade);
    }

}
