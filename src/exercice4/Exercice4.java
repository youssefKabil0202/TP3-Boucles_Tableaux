package exercice4;

public class Exercice4 {
    public static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;

        int taillePremiereLigne = t[0].length;

        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taillePremiereLigne) {
                return false;
            }
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        double[] sommes = new double[t.length];

        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (int j = 0; j < t[i].length; j++) {
                somme += t[i][j];
            }
            sommes[i] = somme;
        }

        return sommes;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {

        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }

        if (t1.length != t2.length || t1[0].length != t2[0].length) {
            return null; // dimensions différentes
        }

        double[][] resultat = new double[t1.length][t1[0].length];

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[0].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return resultat;
    }

     public static void main(String[] args) {
       System.out.println("=== Test avec tableaux réguliers ===");
       double[][] t1 = {{1, 2, 3}, {4, 5, 6}};
       double[][] t2 = {{7, 8, 9}, {10, 11, 12}};

       System.out.println("Tableau 1:");
       affiche(t1);

       System.out.println("\nTableau 2:");
       affiche(t2);

       System.out.println("\nTableau 1 régulier? " + regulier(t1));
       System.out.println("Tableau 2 régulier? " + regulier(t2));

       System.out.print("\nSommes des lignes de t1: ");
       double[] sommes = sommeLignes(t1);
       for (double s : sommes) System.out.print(s + " ");

       System.out.println("\n\nSomme t1 + t2:");
       double[][] somme = somme(t1, t2);
       affiche(somme);

       System.out.println("\n=== Test avec tableau irrégulier ===");
       double[][] t3 = {{1, 2}, {3, 4, 5}};

       System.out.println("Tableau 3:");
       affiche(t3);

       System.out.println("\nTableau 3 régulier? " + regulier(t3));

       System.out.println("\nSomme t1 + t3:");
       double[][] somme2 = somme(t1, t3);
          if (somme2 == null) {
           System.out.println("Résultat: null (car t3 n'est pas régulier)");
            }

       }
}
