package it.unikey.eserciziojava.DAL.repository;

import it.unikey.eserciziojava.DAL.entity.Risposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RispostaRepository extends JpaRepository<Risposta, Long> {

    @Query(value = "SELECT r FROM Risposta r WHERE r.rispostaGiusta = true")
    List<Risposta> listaRisposteGiuste();
}
