public class ValidationAge {
    private ValidationRegion validationRegion;

    // Le constructeur prend en paramètre la région
    public ValidationAge(ValidationRegion validationRegion) {
        this.validationRegion = validationRegion;
    }

    public boolean peutBoireAlcool(int age) {
        return validationRegion.peutBoireAlcool(age);
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return validationRegion.peutUtiliserFesseBouk(age);
    }

    public boolean peutEtreEluMaire(int age) {
        return validationRegion.peutEtreEluMaire(age);
    }
}