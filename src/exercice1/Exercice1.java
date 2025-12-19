package exercice1;

import java.util.Scanner;

public class Exercice1 {
    public static double CalculerSomme(int n) {
        double somme = 0.0;
        for (int i = 1; i <= n; i++) {
            somme = somme + (1.0 / i);
        }
        return somme;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de n : ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("nombre doit être un entier positif");
        } else {
            double resultat = CalculerSomme(n);
            System.out.printf("La somme des %d premiers termes est : %.4f%n", n, resultat);
        }

        scanner.close();

    }
}
