/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.controller;

import com.PortfolioWeb.MiPortfolio.model.Usuario;
import com.PortfolioWeb.MiPortfolio.model.dto.IniciarSesionDto;
import com.PortfolioWeb.MiPortfolio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ilich
 */
@RestController
public class UsuarioController {
    
    @Autowired
            
    UsuarioService userServ;
    
    @PostMapping ("/iniciar-sesion")
    public boolean login (@RequestBody IniciarSesionDto iniciarsesiondto){
        return userServ.isUserEnabled(iniciarsesiondto);
    }
    
    @PostMapping ("/registrar")
    public void registrar(@RequestBody Usuario usuario) throws Exception{
        userServ.crearUsuario(usuario);
    }
    
    
    
}
