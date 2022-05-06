/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.repository;

import com.ArgProgSpringBoot.MiPortfolioWeb.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ilich
 */
@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}
