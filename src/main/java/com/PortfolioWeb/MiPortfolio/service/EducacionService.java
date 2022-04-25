package com.PortfolioWeb.MiPortfolio.service;

import com.PortfolioWeb.MiPortfolio.model.Educacion;
import com.PortfolioWeb.MiPortfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ilich
 */
@Service
public class EducacionService implements IEducacionService {
    
    
    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> obtenerEducacion(){
        return eduRepo.findAll();
    }
    
    @Override
    public void crearEducacion(Educacion educacion){
        eduRepo.save(educacion);
    }
    
    @Override
    public void borrarEducacion (Long id){
         eduRepo.deleteById(id);
    }
    
    @Override
    public Educacion obtenerEducacion (Long id){
        return eduRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarEducacion(Educacion educacion){
        eduRepo.save(educacion);
    }
}
