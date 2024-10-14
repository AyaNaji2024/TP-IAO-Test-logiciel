public class ValidationRegion2 implements ValidationRegion {
    @Override
    public boolean peutBoireAlcool(int age) {
        return age >= 14;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 15;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age >= 19;
    }
}