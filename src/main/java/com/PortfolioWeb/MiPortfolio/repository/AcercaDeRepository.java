
package com.PortfolioWeb.MiPortfolio.repository;

import com.PortfolioWeb.MiPortfolio.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ilich
 */
@Repository
public interface AcercaDeRepository extends JpaRepository <AcercaDe, Long>{
    
}
