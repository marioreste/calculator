package it.unimol.calcolatrice.operazioni;

import static org.junit.jupiter.api.Assertions.*;

class DivisioneTest {

    @org.junit.jupiter.api.Test
    void calcola() {
        Divisione divisione = new Divisione();
        assertEquals(5, divisione.calcola(35, 7));
    }
}