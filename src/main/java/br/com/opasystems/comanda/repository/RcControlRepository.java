package br.com.opasystems.comanda.repository;

import br.com.opasystems.comanda.domain.RcControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RcControlRepository extends JpaRepository<RcControl, Long> {
}
