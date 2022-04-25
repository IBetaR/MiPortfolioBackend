
package com.PortfolioWeb.MiPortfolio.repository;

import com.PortfolioWeb.MiPortfolio.model.Referencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ilich
 */
@Repository
public interface ReferenciasRepository extends JpaRepository <Referencias, Long>{
    
}
