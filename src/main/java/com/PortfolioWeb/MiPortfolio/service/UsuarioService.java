/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.Usuario;
import com.PortfolioWeb.MiPortfolio.model.dto.IniciarSesionDto;
import com.PortfolioWeb.MiPortfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository userRepo;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(IniciarSesionDto iniciarsesiondto){
        boolean isUserEnabled = false;
        List<Usuario> usuarios = userRepo.finByEmailandIsEnabledTrue(iniciarsesiondto.getEmail());
        if (!usuarios.isEmpty()){
            Usuario usuario = usuarios.get(0);
            if (passwordEncoder.matches(iniciarsesiondto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
        
    }
    
    public void crearUsuario(Usuario usuario) throws Exception{
        List<Usuario> usuarios = userRepo.finByEmailandIsEnabledTrue(usuario.getEmail());
        if(!usuarios.isEmpty()){
            throw new Exception ("El email ya está registrado.");
        }else{
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            userRepo.save(usuario);
        }
    }
    
    
}
