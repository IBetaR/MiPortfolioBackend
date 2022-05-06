/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.controller;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.AcercaDe;
import com.ArgProgSpringBoot.MiPortfolioWeb.service.AcercaDeService;
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
public class AcercaDeController {
    @Autowired
    private AcercaDeService acdServ;
    
    @GetMapping ("/acercade")
    @ResponseBody
    public List<AcercaDe> obtenerAcercaDe(){
        return acdServ.obtenerAcercaDe();
    
    }
    
    @PostMapping ("/acercade/crear")
    @ResponseBody
    public AcercaDe crearAcercaDe(@RequestBody AcercaDe acercade){
        return acdServ.crearAcercaDe(acercade);
    }
    
    @GetMapping ("/acercade/{id}")
    @ResponseBody
    public AcercaDe obtenerAcercaDe(@PathVariable Long id){
        return acdServ.obtenerAcercaDe(id);
    
    }
    
    @PutMapping ("/acercade/actualizar")
    public void modificarAcercaDe (@RequestBody AcercaDe acercade){
        System.out.println("Enviando Petición: " + acercade);   
        acdServ.modificarAcercaDe(acercade);
    }
    
    @DeleteMapping ("/acercade/borrar/{id}")
    public void borrarAcercaDe(@PathVariable Long id){
        acdServ.borrarAcercaDe(id);
    }
}
