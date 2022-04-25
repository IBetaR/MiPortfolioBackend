/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioWeb.MiPortfolio.repository;

import com.PortfolioWeb.MiPortfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ilich
 */
@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    List<Usuario> finByEmailandIsEnabledTrue(String email);
    
}
