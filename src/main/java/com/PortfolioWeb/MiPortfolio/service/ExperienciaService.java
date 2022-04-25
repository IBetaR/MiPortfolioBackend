
package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.Experiencia;
import com.PortfolioWeb.MiPortfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> obtenerExperiencia(){
        return expRepo.findAll();
    }
    
    @Override
    public void crearExperiencia(Experiencia experiencia){
        expRepo.save(experiencia);
    }
    
    @Override
    public void borrarExperiencia (Long id){
         expRepo.deleteById(id);
    }
    
    @Override
    public Experiencia obtenerExperiencia (Long id){
        return expRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarExperiencia(Experiencia experiencia){
        expRepo.save(experiencia);
    }
}
