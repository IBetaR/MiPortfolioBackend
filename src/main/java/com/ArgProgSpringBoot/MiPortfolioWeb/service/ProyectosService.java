/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.service;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Proyectos;
import com.ArgProgSpringBoot.MiPortfolioWeb.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    public ProyectosRepository proRepo;
    
    @Override
    public List<Proyectos> obtenerProyectos(){
        return proRepo.findAll();
    }
    
    @Override
    public Proyectos crearProyectos(Proyectos proyecto){
        return proRepo.save(proyecto);
    }
    
    @Override
    public void borrarProyectos (Long id){
         proRepo.deleteById(id);
    }
    
    @Override
    public Proyectos obtenerProyectos (Long id){
        return proRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarProyectos(Proyectos proyecto){
        proRepo.save(proyecto);
    }
    
}
