public class Main {
    public static void main(String[] args) {

        Produit produit1 = new Produit();
        produit1.setLibele("Laptop");
        produit1.setPrix(1000.00);

        Produit produit2 = new Produit();
        produit2.setLibele("Smartphone");
        produit2.setPrix(500.00);

        Facture facture = new Facture(1);
        facture.addProduit(produit1, 2);
        facture.addProduit(produit2, 3);


        Impression_facture impression = new Impression_facture();
        impression.imprimer(facture);

        Enregistrer_facture enregistrement = new Enregistrer_facture();
        enregistrement.saveFacture(facture);
    }
}