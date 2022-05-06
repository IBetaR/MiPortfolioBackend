/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.service;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Idiomas;
import com.ArgProgSpringBoot.MiPortfolioWeb.repository.IdiomasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class IdiomasService implements IIdiomasService {
    
    @Autowired
    public IdiomasRepository idioRepo;
    
    @Override
    public List<Idiomas> obtenerIdiomas(){
        return idioRepo.findAll();
    }
    
    @Override
    public Idiomas crearIdiomas(Idiomas idioma){
        return idioRepo.save(idioma);
    }
    
    @Override
    public void borrarIdiomas (Long id){
         idioRepo.deleteById(id);
    }
    
    @Override
    public Idiomas obtenerIdiomas (Long id){
        return idioRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarIdiomas(Idiomas idioma){
        idioRepo.save(idioma);
    }
    
}
