package com.PortfolioWeb.MiPortfolio.controller;

import com.PortfolioWeb.MiPortfolio.model.Educacion;
import com.PortfolioWeb.MiPortfolio.service.EducacionService;
import com.PortfolioWeb.MiPortfolio.service.IEducacionService;
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
    
    @PostMapping ("/educacion/crear")
    @ResponseBody
    public void crearEducacion(@RequestBody Educacion educacion){
        eduServ.crearEducacion(educacion);
    }
    
    @GetMapping ("/educacion")
    @ResponseBody
    public List<Educacion> obtenerEducacion(){
        return eduServ.obtenerEducacion();
    
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
