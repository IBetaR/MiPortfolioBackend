/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.service;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.AcercaDe;
import com.ArgProgSpringBoot.MiPortfolioWeb.repository.AcercaDeRepository;
import java.util.List;
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
    public List<AcercaDe> obtenerAcercaDe(){
        return acdRepo.findAll();
    }
    
    @Override
    public AcercaDe crearAcercaDe(AcercaDe acercade){
        return acdRepo.save(acercade);
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
