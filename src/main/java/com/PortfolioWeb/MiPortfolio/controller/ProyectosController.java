package com.PortfolioWeb.MiPortfolio.controller;

import com.PortfolioWeb.MiPortfolio.model.Proyectos;
import com.PortfolioWeb.MiPortfolio.service.ProyectosService;
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
public class ProyectosController {
    
    @Autowired
    private ProyectosService proServ;
    
    @PostMapping ("/proyectos/crear")
    @ResponseBody
    public void crearProyectos (@RequestBody Proyectos proyecto){
        proServ.crearProyectos(proyecto);
    }
    
    @GetMapping ("/proyectos")
    @ResponseBody
    public List<Proyectos> obtenerProyectos(){
        return proServ.obtenerProyectos();
    }
    
    @GetMapping ("/proyectos/{id}")
    @ResponseBody
    public Proyectos obtenerProyectos(@PathVariable Long id){
        return proServ.obtenerProyectos(id);
    }
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public void borrarProyectos (@PathVariable Long id){
        proServ.borrarProyectos(id);
        
    }
    
    @PutMapping ("/proyectos/actualizar")
    public void modificarProyectos(@RequestBody Proyectos proyecto){
        System.out.println("Enviando Petición: " + proyecto);   
        proServ.modificarProyectos(proyecto);
    }
}
