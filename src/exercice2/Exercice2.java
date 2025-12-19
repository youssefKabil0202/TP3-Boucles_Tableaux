package exercice2;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la hauteur du triangle : ");
        int hauteur = scanner.nextInt();

        for (int ligne = 1; ligne <= hauteur; ligne++) {
            for (int j = 0; j < hauteur - ligne; j++) {
                System.out.print(" ");
            }

            for (int i = 0; i < (2 * ligne - 1); i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
