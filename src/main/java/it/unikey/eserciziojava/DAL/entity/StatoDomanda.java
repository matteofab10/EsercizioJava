package it.unikey.eserciziojava.DAL.entity;

public enum StatoDomanda {

    ATTIVO(1),
    NON_ATTIVO(2);

    private int value;

    StatoDomanda(int value) {
        this.value = value;
    }
}
