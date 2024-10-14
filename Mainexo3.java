public class Main {
    public static void main(String[] args) {
        // Créer une MatriceYoung de 3x3
        MatriceYoung matrice = new MatriceYoung(3, 3);

        // Ajouter des éléments
        System.out.println("Ajout d'éléments dans la matrice:");
        matrice.addElement(10);
        matrice.addElement(5);
        matrice.addElement(20);
        matrice.addElement(2);
        matrice.addElement(15);

        // Afficher la matrice après ajout
        System.out.println("\nMatrice après ajout:");
        matrice.printTableau();

        // Extraire le minimum
        System.out.println("\nExtraction du minimum:");
        int min = matrice.extraireMin();
        System.out.println("Minimum extrait: " + min);

        // Afficher la matrice après extraction du minimum
        System.out.println("\nMatrice après extraction du minimum:");
        matrice.printTableau();

        // Ajouter un autre élément pour tester l'insertion après extraction
        System.out.println("\nAjout de l'élément 1 après extraction:");
        matrice.addElement(1);
        matrice.printTableau();

        // Extraire à nouveau le minimum
        System.out.println("\nNouvelle extraction du minimum:");
        min = matrice.extraireMin();
        System.out.println("Minimum extrait: " + min);

        // Afficher la matrice finale
        System.out.println("\nMatrice finale:");
        matrice.printTableau();
    }
}

