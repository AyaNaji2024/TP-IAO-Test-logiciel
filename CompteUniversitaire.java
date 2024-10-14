public class CompteUniversitaire {
    private String login;

    public void setLogin(Ipersonne personne) {
        this.login = personne.genererLogin();
    }

    public String getLogin() {
        return login;
    }
}