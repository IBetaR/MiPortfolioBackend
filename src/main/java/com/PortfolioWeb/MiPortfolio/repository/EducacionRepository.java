package com.PortfolioWeb.MiPortfolio.repository;

import com.PortfolioWeb.MiPortfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ilich
 */
@Repository
public interface EducacionRepository extends JpaRepository <Educacion,Long> {
    
}
