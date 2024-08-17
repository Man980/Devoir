import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        // Ceci est un programme conçu dans le cadre du cours de Java I enseigné au CTPEA.

        // Résolution
        // Conception du menu

        // Définition de l'instantiation de la classe Scanner
        Scanner entree = new Scanner(System.in);
        String warningss = "\n\n*      Ceci est un programme conçu exclusivement par les étudiants :               *\n*      1. Micklove Lucisca MILORT                                                        *\r\n" + //
                        "*      2. Josias SAINT ANGE                                                 *\r\n" + //
                        "*      3. Jean Michel Ralph MANY                                                  *\r\n" + //
                        "*      4. Widmaier MORIL\r\n*      Aucune partie de ce programmme ne doit etre copiee ou redistribuee\r\n*      sans la permission ecrite des developpeurs.                         __*****__\n";

            
            int choice_0 = -2;

            while (choice_0 == -2){
                System.out.print("\n\n***** ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** *****");
                System.out.print(warningss);
                System.out.println("\n\n***** ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** *****");
                System.out.print("Veuillez appuyer sur 0 pour quitter ou nimporte quel chiffre pour continuer >>> ");
                int user_entry = getPositiveIntAdvance(entree);
                if(user_entry ==0){
                    break;
                }
                else if(user_entry!=-1){
                    //else{
                        // Code to execute...
                    int choice = -1;
                    while (choice != 5) {
                        System.out.println("\n\n******************************** WELCOME TO EASY CALCULUS ********************************\n");
                     System.out.println("*  ");  System.out.println("1. Multiplication de deux matrices");
                     System.out.println("*  ");  System.out.println("2. Tri de tableau");
                     //System.out.println("*  ");  System.out.println("3. Tri de tableau Méthode Beta");
                     System.out.println("*  ");   System.out.println("4. Résolution d'un système d'équations linéaires à 3 inconnues");
                     System.out.println("*  "); System.out.println("5. Quitter");
                     System.out.println("*  ");  System.out.print("Veuillez faire un choix : ");

                    if (entree.hasNextInt()) {
                        choice = entree.nextInt();

                        // Appeler les différentes fonctions en fonction du choix de l'utilisateur
                        switch (choice) {
                            case 1:
                                runMatrixMultiplication(entree);
                                break;
                            case 2:
                            case 3:
                                runSortingExample(entree, choice);
                                break;
                            case 4:
                                runGaussElimination(entree);
                                break;
                            case 5:
                                System.out.println("Au revoir!");
                                break;
                            default:
                                System.out.println("Mauvais choix ! Veuillez essayer à nouveau.");
                                break;
                        } 
                    } else {
                        System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                        entree.next(); // Pour consommer l'entrée non entière
                    }
                }

        entree.close();
    }

    }
    }
    

    // Exemple de fonction pour exécuter le tri
    public static void runSortingExample(Scanner entree, int choice) {
        int taille = -1;
        while (taille <= 0) {
            System.out.print("Entrez la taille du tableau (entier positif) : ");
            if (entree.hasNextInt()) {
                taille = entree.nextInt();
                if (taille <= 0) {
                    System.out.println("La taille doit être un entier positif.");
                }
            } else {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                entree.next(); // Pour consommer l'entrée non entière
            }
        }

        int[] tableau = new int[taille];
        System.out.println("Entrez les valeurs du tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            while (!entree.hasNextInt()) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                entree.next(); // Pour consommer l'entrée non entière
                System.out.print("Valeur " + (i + 1) + " : ");
            }
            tableau[i] = entree.nextInt();
        }

        System.out.println("Tableau saisi : ");
        printArray(tableau);

        int[] sortedArray;
        if (choice == 2) {
            sortedArray = selectionSort(tableau.clone());
            System.out.println("Tableau trié par sélection : ");
        } else {
            sortedArray = insertionSort(tableau.clone());
            System.out.println("Tableau trié par insertion : ");
        }
        printArray(sortedArray);
    }

    public static void runMatrixMultiplication(Scanner entree) {
        int m, n, p;

        System.out.print("Entrez le nombre de lignes de la matrice A (m) : ");
        while ((m = getPositiveInt(entree)) == -1);

        System.out.print("Entrez le nombre de colonnes de la matrice A et de lignes de la matrice B (n) : ");
        while ((n = getPositiveInt(entree)) == -1);

        System.out.print("Entrez le nombre de colonnes de la matrice B (p) : ");
        while ((p = getPositiveInt(entree)) == -1);

        int[][] A = new int[m][n];
        int[][] B = new int[n][p];

        System.out.println("Entrez les valeurs de la matrice A : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] : ");
                A[i][j] = getValidInt(entree);
            }
        }

        System.out.println("Entrez les valeurs de la matrice B : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("B[" + i + "][" + j + "] : ");
                B[i][j] = getValidInt(entree);
            }
        }

        int[][] C = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrice A :");
        printMatrix(A);
        System.out.println("Matrice B :");
        printMatrix(B);
        System.out.println("Matrice C (A * B) :");
        printMatrix(C);
    }

    public static void runGaussElimination(Scanner entree) {
        int n = 3; // Nombre d'inconnues
        double[][] a = new double[n][n + 1];
        System.out.println("Entrez les coefficients du système d'équations (ligne par ligne) : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("a[" + i + "][" + j + "] : ");
                a[i][j] = getValidDouble(entree);
            }
        }

        // Conversion en forme échelonnée
        for (int i = 0; i < n; i++) {
            // Recherche du pivot
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[j][i]) > Math.abs(a[max][i])) {
                    max = j;
                }
            }
            // Échange des lignes
            double[] temp = a[i];
            a[i] = a[max];
            a[max] = temp;

            // Normalisation de la ligne pivot
            for (int j = i + 1; j < n; j++) {
                double factor = a[j][i] / a[i][i];
                for (int k = i; k <= n; k++) {
                    a[j][k] -= factor * a[i][k];
                }
            }
        }

        // Affichage des étapes intermédiaires
        System.out.println("Forme échelonnée :");
        printMatrix(a);

        // Résolution par substitution arrière
        double[] x = new double[n]; // pour sauvegarder les solutions du systeme
        for (int i = n - 1; i >= 0; i--) {
            x[i] = a[i][n] / a[i][i];
            for (int j = i - 1; j >= 0; j--) {
                a[j][n] -= a[j][i] * x[i];
            }
        }

        // Affichage du résultat
        System.out.println("Solution :");
        for (int i = 0; i < n; i++) { 
            System.out.printf("x%d = %.2f\n", i + 1, x[i]);
        }
    }

    public static int getPositiveInt(Scanner entree) {
        int num = -1;
        if (entree.hasNextInt()) {
            num = entree.nextInt();
            if (num <= 0) {
                System.out.println("Veuillez entrer un entier positif.");
                num = -1;
            }
        } else {
            System.out.println("Entrée invalide. Veuillez entrer un nombre.");
            entree.next(); // Pour consommer l'entrée non entière
        }
        return num;
    }

    public static int getPositiveIntAdvance(Scanner entree) {
        int num = -1;
        if (entree.hasNextInt()) {
            num = entree.nextInt();
            if (num < 0) {
                System.out.println("Veuillez entrer un entier positif.");
                num = -1;
            }
        else if(num==0){
            num=0;
        }
        } else {
            System.out.println("Entrée invalide. Veuillez entrer un nombre.");
            entree.next(); // Pour consommer l'entrée non entière
        }
        return num;
    }

    public static int getValidInt(Scanner entree) {
        while (!entree.hasNextInt()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre.");
            entree.next(); // Pour consommer l'entrée non entière
        }
        return entree.nextInt();
    }

    public static double getValidDouble(Scanner entree) {
        while (!entree.hasNextDouble()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre.");
            entree.next(); // Pour consommer l'entrée non entière
        }
        return entree.nextDouble();
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }
}
