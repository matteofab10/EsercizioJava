package it.unikey.eserciziojava.DAL.repository;

import it.unikey.eserciziojava.DAL.entity.Domanda;
import org.hibernate.Hibernate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
@Transactional
public class DomandaRepositoryTest {

    @Autowired
    private DomandaRepository domandaRepository;

    @Test
    public void testInitialize() {
        Assertions.assertNotNull(domandaRepository,"non è stato inizializzato correttamente");
    }

    @Test
    public void findDomandaById() {

        Domanda domanda = new Domanda(1, "ATTIVO", true, "2022/06/12", "come ti chiami");

        Optional<Domanda> optionalDomanda = domandaRepository.findById(domanda.getId());
        Assertions.assertTrue(optionalDomanda.isPresent());
        Domanda foundEntity = optionalDomanda.get();
        Hibernate.initialize(foundEntity.getId());
    }
}
