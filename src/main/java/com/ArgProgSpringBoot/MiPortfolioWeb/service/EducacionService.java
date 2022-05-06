/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.service;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Educacion;
import com.ArgProgSpringBoot.MiPortfolioWeb.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> obtenerEducacion(){
        return eduRepo.findAll();
    }
    
    @Override
    public Educacion crearEducacion(Educacion educacion){
        return eduRepo.save(educacion);
    }
    
    @Override
    public void borrarEducacion (Long id){
         eduRepo.deleteById(id);
    }
    
    @Override
    public Educacion obtenerEducacion (Long id){
        return eduRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarEducacion(Educacion educacion){
        eduRepo.save(educacion);
    }
    
    
}
