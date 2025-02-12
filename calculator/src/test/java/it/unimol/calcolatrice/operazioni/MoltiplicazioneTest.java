package it.unimol.calcolatrice.operazioni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoltiplicazioneTest {

    @Test
    void calcola() {
        Moltiplicazione moltiplicazione = new Moltiplicazione();
        assertEquals(33, moltiplicazione.calcola(3, 11));
    }
}