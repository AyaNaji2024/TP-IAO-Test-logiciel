import java.util.HashMap;
import java.util.Map;

public class Facture {
    private int id;
    private HashMap<Produit, Integer> produits;
    private static double TVA;

    public Facture(int id) {
        this.id = id;
        this.produits = new HashMap<>();
    }

    public static double getTVA() {
        return TVA;
    }

    public static void setTVA(double TVA) {
        Facture.TVA = TVA;
    }
    public void addProduit(Produit produit, int quantité){
        this.produits.put(produit, quantité);
    }
    public double getTotal(){
        double total = 0;
        for (Map.Entry mapentry : this.produits.entrySet()) {
            total+= ((Produit)mapentry.getKey()).getPrix() * ((Double)mapentry.getValue());
        }
        return total;
    }
    public double getTotalTTC(){
        return this.getTotal()*(1+this.TVA);
    }
}
