/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.controller;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.HaSs;
import com.ArgProgSpringBoot.MiPortfolioWeb.service.HaSsService;
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
public class HaSsController {
    
    @Autowired
    private HaSsService hasServ;
    
    @PostMapping ("/habilidades/crear")
    @ResponseBody
    
    public HaSs crearHabilidad(@RequestBody HaSs hass){
        return hasServ.crearHabilidad(hass);
    }
    
    @GetMapping ("/habilidades")
    @ResponseBody
    public List<HaSs> obtenerHabilidad(){
        return hasServ.obtenerHabilidad();
    }
    
    @GetMapping ("/habilidades/{id}")
    @ResponseBody
    public HaSs obtenerHabilidad(@PathVariable Long id){
        return hasServ.obtenerHabilidad(id);
    }
    
    @DeleteMapping ("/habilidades/borrar/{id}")
    public void borrarHabilidad (@PathVariable Long id){
        hasServ.borrarHabilidad(id);
        
    }
    
    @PutMapping ("/habilidades/actualizar")
    public void modificarHabilidad(@RequestBody HaSs hass){
        System.out.println("Enviando Petición: " + hass);   
        hasServ.modificarHabilidad(hass);
    }
    
}
