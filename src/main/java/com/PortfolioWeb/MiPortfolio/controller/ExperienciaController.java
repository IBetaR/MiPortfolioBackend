
package com.PortfolioWeb.MiPortfolio.controller;

import com.PortfolioWeb.MiPortfolio.model.Experiencia;
import com.PortfolioWeb.MiPortfolio.service.ExperienciaService;
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
public class ExperienciaController  {
    @Autowired
    private ExperienciaService expServ;
    
    @PostMapping ("/experiencia/crear")
    @ResponseBody
    public void crearExperiencia(@RequestBody Experiencia experiencia){
        expServ.crearExperiencia(experiencia);
    }
    
    @GetMapping ("/experiencia")
    @ResponseBody
    public List<Experiencia> obtenerExperiencia(){
        return expServ.obtenerExperiencia();
    }
    
    @GetMapping ("/experiencia/{id}")
    @ResponseBody
    public Experiencia obtenerExperiencia(@PathVariable Long id){
        return expServ.obtenerExperiencia(id);
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
        
    }
    
    @PutMapping ("/experiencia/actualizar")
    public void modificarExperiencia(@RequestBody Experiencia experiencia){
        System.out.println("Enviando Petición: " + experiencia);   
        expServ.modificarExperiencia(experiencia);
    }
    
}
