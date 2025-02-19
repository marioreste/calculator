package it.unimol.calcolatrice;

import it.unimol.calcolatrice.operazioni.*;

import net.sourceforge.jeval.Evaluator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int operazione;

        System.out.print("Inserisci il primo numero: ");
        num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Inserisci l'operazione: \n" +
                "1. Addizione \n" +
                "2. Sottrazione\n" +
                "3. Moltiplicazione\n" +
                "4. Divisione\n");
        operazione = Integer.parseInt(scanner.nextLine());

        if (operazione == 4) {
            do {
                System.out.print("Inserisci il secondo numero (diverso da 0): ");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    System.out.println("Errore: Il divisore non può essere zero.");
                }
            } while (num2 == 0);
        } else {
            System.out.print("Inserisci il secondo numero: ");
            num2 = Double.parseDouble(scanner.nextLine());
        }

        double risultato = 0;

        switch (operazione) {
            case 1:
                risultato = new Addizione().calcola(num1, num2);
                break;
            case 2:
                risultato = new Sottrazione().calcola(num1, num2);
                break;
            case 3:
                risultato = new Moltiplicazione().calcola(num1, num2);
                break;
            case 4:
                risultato = new Divisione().calcola(num1, num2);
                break;
            default:
                System.out.println("Operazione non valida.");
                scanner.close();
                return;
        }

        System.out.println("Risultato: " + risultato);
        scanner.close(); */

        String expression = "3 + 5 * (2 - 4) / 2"; // Esempio di espressione matematica

        Evaluator evaluator = new Evaluator();
        try {
            String result = evaluator.evaluate(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error evaluating expression: " + e.getMessage());
        }
    }
}