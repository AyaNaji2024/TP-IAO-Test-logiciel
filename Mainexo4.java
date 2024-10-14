public class Main {
    public static void main(String[] args) {
        // Création des objets Etudiant et Enseignant
        Etudiant etudiant1 = new Etudiant("Dupont", "Jean", 123);
        Etudiant etudiant2 = new Etudiant("Durand", "Alice", 456);

        Enseignant enseignant1 = new Enseignant("Martin", "Sophie", "Professeur");
        Enseignant enseignant2 = new Enseignant("Lemoine", "Paul", "Maître de Conférences");

        // Tests de génération de logins pour les étudiants
        CompteUniversitaire compteEtu1 = new CompteUniversitaire();
        compteEtu1.setLogin(etudiant1);
        System.out.println("Login Etudiant 1: " + compteEtu1.getLogin());

        CompteUniversitaire compteEtu2 = new CompteUniversitaire();
        compteEtu2.setLogin(etudiant2);
        System.out.println("Login Etudiant 2: " + compteEtu2.getLogin());

        // Tests de génération de logins pour les enseignants
        CompteUniversitaire compteEns1 = new CompteUniversitaire();
        compteEns1.setLogin(enseignant1);
        System.out.println("Login Enseignant 1: " + compteEns1.getLogin());

        CompteUniversitaire compteEns2 = new CompteUniversitaire();
        compteEns2.setLogin(enseignant2);
        System.out.println("Login Enseignant 2: " + compteEns2.getLogin());

        // Vérification de la cohérence des données
        System.out.println("Nom de l'étudiant 1: " + etudiant1.getNom());
        System.out.println("Grade de l'enseignant 2: " + enseignant2.getGrade());
    }
}