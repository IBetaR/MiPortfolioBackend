/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArgProgSpringBoot.MiPortfolioWeb.model.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ilich
 */
@Getter @Setter
public class IniciarSesionDto {
    private String email;
    private String password;

    public IniciarSesionDto() {
    }

    public IniciarSesionDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "IniciarSesionDto{" + "email=" + email + ", password=" + password + '}';
    }
}
