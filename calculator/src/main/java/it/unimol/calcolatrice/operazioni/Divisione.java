package it.unimol.calcolatrice.operazioni;

public class Divisione {
    public double calcola(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Errore: Divisione per zero non consentita.");
        }
        return (a / b);
    }
}
