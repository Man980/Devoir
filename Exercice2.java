import java.math.BigInteger;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        // Exercice 2

        boolean compteur = true;
        Exercice2 exo1 = new Exercice2();
        Scanner entree = new Scanner(System.in);

        while (compteur) {
            System.out.println("Veuillez entrer un nombre et je vous calculerai le factoriel : ");
            int nb = entree.nextInt();
            exo1.factoriel(nb);

            // Demander à l'utilisateur s'il souhaite continuer
            System.out.println("Voulez-vous calculer un autre factoriel ? (oui/non) : ");
            String reponse = entree.next();

            if (reponse.equalsIgnoreCase("non")) {
                compteur = false;
            }
        }

        System.out.println("Programme terminé.");
        entree.close();
    }

    public void factoriel(int nombre) {
        BigInteger facto = BigInteger.valueOf(1);

        if (nombre < 0) {
            System.out.println("Le nombre doit être positif.");
        } else if (nombre == 0 || nombre == 1) {
            System.out.println("Le factoriel de " + nombre + " ! = 1");
        } else {
            for (int i = 1; i <= nombre; i++) {
                facto = facto.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Le factoriel de " + nombre + " ! = " + facto);
        }
    }
}
