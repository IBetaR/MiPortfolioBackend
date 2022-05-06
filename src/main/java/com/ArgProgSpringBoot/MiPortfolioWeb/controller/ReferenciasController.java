/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.controller;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Referencias;
import com.ArgProgSpringBoot.MiPortfolioWeb.service.ReferenciasService;
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
public class ReferenciasController {
    
    @Autowired
    private ReferenciasService refServ;
    
    @PostMapping ("/referencias/crear")
    @ResponseBody
    public Referencias crearReferencias (@RequestBody Referencias referencia){
        return refServ.crearReferencias(referencia);
    }
    
    @GetMapping ("/referencias")
    @ResponseBody
    public List<Referencias> obtenerReferencias(){
        return refServ.obtenerReferencias();
    }
    
    @GetMapping ("/referencias/{id}")
    @ResponseBody
    public Referencias obtenerReferencias(@PathVariable Long id){
        return refServ.obtenerReferencias(id);
    }
    
    @DeleteMapping ("/referencias/borrar/{id}")
    public void borrarReferencias (@PathVariable Long id){
        refServ.borrarReferencias(id);
        
    }
    
    @PutMapping ("/referencias/actualizar")
    public void modificarReferencias(@RequestBody Referencias referencia){
        System.out.println("Enviando Petición: " + referencia);   
        refServ.modificarReferencias(referencia);
    }
    
}
