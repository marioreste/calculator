package it.unimol.calcolatrice;

import it.unimol.calcolatrice.operazioni.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Inserisci l'operazione (+ o -): ");
        char operazione = scanner.next().charAt(0);

        System.out.print("Inserisci il secondo numero: ");
        double num2 = Double.parseDouble(scanner.nextLine());

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