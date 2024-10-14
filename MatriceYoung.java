package Liskov;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;
/*Un tableau de Young (ou tableau de Young-Ferrers) est une disposition d'entiers dans un tableau de cases,
 où les lignes et les colonnes sont ordonnées de manière croissante.
Plus formellement, un tableau de Young remplit ces deux conditions :
 */
/*Les nombres dans chaque ligne sont disposés dans un ordre croissant, c'est-à-dire que
 chaque élément dans une ligne est inférieur ou égal à celui qui le suit.
 */
/*Les nombres dans chaque colonne sont également disposés dans un ordre croissant, c'est-à-dire
que chaque élément dans une colonne est inférieur ou égal à celui qui se trouve en dessous.
 */
/*Le tableau de Young doit implementer deux opérations : Extraire Min et inserer, il faut garder les deux
conditions valables aprs chaque opération.
 */
 /*Exemple :
        1  2  3
        2  4  5
        6  7  8

  */
public class MatriceYoung {
    private static final int INF = Integer.MAX_VALUE;  // Valeur infinie pour cases vides
    private int n;  // Nombre de lignes
    private int m;  // Nombre de colonnes
    private List<List<Integer>> matrice;  // Matrice interne

    // Constructeur
    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrice = new ArrayList<>();

        // Initialiser la matrice avec INF
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(INF);
            }
            matrice.add(row);
        }
    }

    // Extraire le minimum (élément en haut à gauche)
    public int extraireMin() {
        if (getElement(0, 0) == INF) {
            return INF;  // La matrice est vide
        } else {
            int min = getElement(0, 0);  // Récupérer le minimum
            equilibrerTableau(0, 0);  // Rééquilibrer la matrice
            return min;
        }
    }

    // Ajouter un élément au tableau de Young
    public boolean addElement(int key) {
        if (getElement(n - 1, m - 1) != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }

        // Insérer la clé dans la dernière case (en bas à droite)
        setElement(n - 1, m - 1, key);
        int i = n - 1, j = m - 1;

        // Rééquilibrer pour maintenir les propriétés du tableau de Young
        while (i > 0 || j > 0) {
            int top = (i > 0) ? getElement(i - 1, j) : INF;
            int left = (j > 0) ? getElement(i, j - 1) : INF;

            if (key >= top && key >= left) {
                break;  // L'élément est bien placé
            } else if (top < left) {
                setElement(i, j, top);
                i--;
            } else {
                setElement(i, j, left);
                j--;
            }
        }
        setElement(i, j, key);
        return true;
    }

    // Rééquilibrer le tableau après l'extraction du minimum
    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? getElement(i + 1, j) : INF;
        int right = (j + 1 < m) ? getElement(i, j + 1) : INF;

        if (down == INF && right == INF) {
            return;  // Fin de la descente
        }

        if (down < right) {
            setElement(i, j, down);
            equilibrerTableau(i + 1, j);
        } else {
            setElement(i, j, right);
            equilibrerTableau(i, j + 1);
        }
    }

    // Afficher le tableau
    public void printTableau() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = getElement(i, j);
                if (val == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
    }

    // Récupérer un élément de la matrice
    private int getElement(int i, int j) {
        return matrice.get(i).get(j);
    }

    // Définir un élément dans la matrice
    private void setElement(int i, int j, int val) {
        matrice.get(i).set(j, val);
    }
}