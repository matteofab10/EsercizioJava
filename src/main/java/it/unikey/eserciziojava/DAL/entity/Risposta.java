package it.unikey.eserciziojava.DAL.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "risposta")
public class Risposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rispostaGiusta")
    private boolean rispostaGiusta;

    @Column(name = "contenutoRisposta")
    private String contenutoRisposta;

    @ManyToOne
    private Domanda domanda;
}
