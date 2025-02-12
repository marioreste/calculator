package it.unimol.calcolatrice.operazioni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SottrazioneTest {

    @Test
    void calcola() {
        Sottrazione sottrazione = new Sottrazione();
        assertEquals(8, sottrazione.calcola(13, 5));
    }
}