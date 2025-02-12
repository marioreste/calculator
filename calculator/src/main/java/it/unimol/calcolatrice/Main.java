package it.unimol.calcolatrice;

import it.unimol.calcolatrice.operazioni.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operazione;

        System.out.print("Inserisci il primo numero: ");
        num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Inserisci l'operazione (+ o -): ");
        operazione = scanner.next().charAt(0);

        if (operazione == '/') {
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
            case '+':
                risultato = new Addizione().calcola(num1, num2);
                break;
            case '-':
                risultato = new Sottrazione().calcola(num1, num2);
                break;
            case '*':
                risultato = new Moltiplicazione().calcola(num1, num2);
                break;
            default:
                System.out.println("Operazione non valida.");
                scanner.close();
                return;
        }

        System.out.println("Risultato: " + risultato);
        scanner.close();
    }
}