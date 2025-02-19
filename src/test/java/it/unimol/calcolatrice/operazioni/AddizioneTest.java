package it.unimol.calcolatrice.operazioni;

import static org.junit.jupiter.api.Assertions.*;

class AddizioneTest {

    @org.junit.jupiter.api.Test
    void calcola() {
        Addizione addizione=new Addizione();
        assertEquals(4, addizione.calcola(2, 2));
    }
}