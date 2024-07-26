import java.util.Scanner;

public class Exercice4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander la taille de la matrice
        System.out.println("Entrez le nombre de lignes de la matrice: ");
        int rows = scanner.nextInt();
        System.out.println("Entrez le nombre de colonnes de la matrice: ");
        int cols = scanner.nextInt();

        // Initialiser les matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        // Saisir les éléments de la première matrice
        System.out.println("Entrez les éléments de la première matrice:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d,%d]: ", i + 1, j + 1);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Saisir les éléments de la deuxième matrice
        System.out.println("Entrez les éléments de la deuxième matrice:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d,%d]: ", i + 1, j + 1);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Calculer la somme des deux matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Afficher la matrice résultante
        System.out.println("La somme des deux matrices est:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
