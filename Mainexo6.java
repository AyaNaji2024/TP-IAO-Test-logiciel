public class Main {
    public static void main(String[] args) {
        ValidationAge validation = new ValidationAge();

        // Tests avec différentes régions
        System.out.println("Peut boire alcool en region1 : " + validation.peutBoireAlcool(15, "region1")); // true
        System.out.println("Peut utiliser FesseBouk en region2 : " + validation.peutUtiliserFesseBouk(14, "region2")); // false
        System.out.println("Peut être élu maire en region3 : " + validation.peutEtreEluMaire(20, "region3")); // true
        System.out.println("Peut boire alcool sans région (par défaut) : " + validation.peutBoireAlcool(17, "")); // false
    }
}