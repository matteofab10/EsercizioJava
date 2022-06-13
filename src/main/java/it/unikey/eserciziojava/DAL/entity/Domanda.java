package it.unikey.eserciziojava.DAL.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "domanda")
public class Domanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "statoDomanda")
    private StatoDomanda statoDomanda;

    @Column(name = "domandaObbligatoria")
    private boolean domandaObbligatoria;

    @Column(name = "dataSomministrazione")
    private LocalDate dataSomministrazione;

    @Column(name = "contenutoDomanda")
    private String contenutoDomanda;

    @OneToMany(mappedBy = "domanda")
    private List<Risposta> risposta;

    public Domanda(int id, String statoDomanda, boolean domandaObbligatoria, String dataSomministrazione, String contenutoDomanda) {
    }
}
