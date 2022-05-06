/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.controller;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Idiomas;
import com.ArgProgSpringBoot.MiPortfolioWeb.service.IdiomasService;
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
public class IdiomasController {
    
    @Autowired
    private IdiomasService idioServ;
    
    @PostMapping ("/idiomas/crear")
    @ResponseBody
    public Idiomas crearIdiomas (@RequestBody Idiomas idioma){
        return idioServ.crearIdiomas(idioma);
    }
    
    @GetMapping ("/idiomas")
    @ResponseBody
    public List<Idiomas> obtenerIdiomas(){
        return idioServ.obtenerIdiomas();
    }
    
    @GetMapping ("/idiomas/{id}")
    @ResponseBody
    public Idiomas obtenerIdiomas(@PathVariable Long id){
        return idioServ.obtenerIdiomas(id);
    }
    
    @DeleteMapping ("/idiomas/borrar/{id}")
    public void borrarIdiomas (@PathVariable Long id){
        idioServ.borrarIdiomas(id);
        
    }
    
    @PutMapping ("/idiomas/actualizar")
    public void modificarIdiomas(@RequestBody Idiomas idioma){
        System.out.println("Enviando Petición: " + idioma);   
        idioServ.modificarIdiomas(idioma);
    }
}
