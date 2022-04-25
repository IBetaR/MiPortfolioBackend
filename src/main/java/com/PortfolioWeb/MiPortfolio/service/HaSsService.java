/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.HaSs;
import com.PortfolioWeb.MiPortfolio.repository.HaSsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class HaSsService implements IHaSsService {
    
    @Autowired
    public HaSsRepository hasRepo;
    
    @Override
    public List<HaSs> obtenerHabilidad(){
        return hasRepo.findAll();
    }
    
    @Override
    public void crearHabilidad(HaSs hass){
        hasRepo.save(hass);
    }
    
    @Override
    public void borrarHabilidad (Long id){
         hasRepo.deleteById(id);
    }
    
    @Override
    public HaSs obtenerHabilidad (Long id){
        return hasRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarHabilidad(HaSs hass){
        hasRepo.save(hass);
    }
}
