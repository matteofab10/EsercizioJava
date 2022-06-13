package it.unikey.eserciziojava.DAL.repository;

import it.unikey.eserciziojava.DAL.entity.Domanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomandaRepository extends JpaRepository<Domanda, Long> {

    @Query(value = "SELECT d FROM Domanda d WHERE d.statoDomanda = 'ATTIVO'")
    List<Domanda> listaDomande();

}
