/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.service;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Experiencia;
import com.ArgProgSpringBoot.MiPortfolioWeb.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> obtenerExperiencia(){
        return expRepo.findAll();
    }
    
    @Override
    public Experiencia crearExperiencia(Experiencia experiencia){
        return expRepo.save(experiencia);
    }
    
    @Override
    public void borrarExperiencia (Long id){
         expRepo.deleteById(id);
    }
    
    @Override
    public Experiencia obtenerExperiencia (Long id){
        return expRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarExperiencia(Experiencia experiencia){
        expRepo.save(experiencia);
    }
    
}
