/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.controller;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Educacion;
import com.ArgProgSpringBoot.MiPortfolioWeb.service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ilich
 */
@RestController
public class EducacionController {
    @Autowired
    private EducacionService eduServ;
    
    @GetMapping ("/educacion")
    @ResponseBody
    public List<Educacion> obtenerEducacion(){
        System.out.println(eduServ.toString());
        return eduServ.obtenerEducacion();
    
    }
    
    @PostMapping ("/educacion/crear")
    @ResponseBody
    public Educacion crearEducacion(@RequestBody Educacion educacion){
        return eduServ.crearEducacion(educacion);
    }
    
    @GetMapping ("/educacion/{id}")
    @ResponseBody
    public Educacion obtenerEducacion(@PathVariable Long id){
        return eduServ.obtenerEducacion(id);
    
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping ("/educacion/actualizar")
    public void modificarEducacion(@RequestBody Educacion educacion){
        System.out.println("Enviando Petición: " + educacion);   
        eduServ.modificarEducacion(educacion);
    }
    
}
