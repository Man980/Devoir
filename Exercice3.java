import java.util.*;

public class Exercice3 {
    public static void main(String[] args){

/*         // Exercice 3
                    int num[] = {17, 5, 4, 8, 12, 15};
            
                    // Initialiser min et max aux premiers éléments du tableau
                    int min = num[0];
                    int max = num[0];
            
                    // Parcourir le tableau pour trouver min et max
                    for (int i = 1; i < num.length; i++) {
                        if (num[i] < min) {
                            min = num[i];
                        }
                        if (num[i] > max) {
                            max = num[i];
                        }
                    }
            
                  System.out.println("La taille du tableau est : " + num.length);
                  System.out.println("Le min de ce tableau est : " + min);
                  System.out.println("Le max de ce tableau est : " + max);
*/
            
        // EXERCICE 3 (SUITE), VEUILLEZ DECOMMENTER POUR CONTINUER

    
        Scanner entree = new Scanner(System.in);
        String compteur = "oui";
        int i = 0;
        while (compteur.equals("oui")) {
            System.out.println("Voulez-vous continuer?");
            String rep = entree.next();

            if (rep.equals("non")) {
                compteur = "non";
                break;
            } else {
                System.out.println("Vous avez choisi de continuer.");
                i++;
            }
        }

        System.out.println("Programme terminé. Le nombre d'essais est : " + i);
        
    }
}
