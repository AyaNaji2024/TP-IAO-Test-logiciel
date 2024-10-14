public class Enseignant extends Personne {
    private String grade;

    public Enseignant(String nom, String prenom, String grade) {
        super(nom, prenom);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String genererLogin() {
        return prenom + nom + grade + "usms.ma";
    }
}