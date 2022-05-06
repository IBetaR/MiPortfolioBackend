/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.repository;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ilich
 */
@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    //List<Usuario> finByEmailandIsEnabledTrue(String email);
    
}
