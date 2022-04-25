package com.PortfolioWeb.MiPortfolio.model.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ilich
 */
@Getter
@Setter
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
        return "UserDto{" + "email=" + email + ", password=" + password + '}';
    }
    
    
    
}
