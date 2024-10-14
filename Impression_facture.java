import java.util.Map;

public class Impression_facture {
    public void imprimer(Facture facture){
        double prix;
        for (Map.Entry mapentry : facture.produits.entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * ((Double)mapentry.getValue());
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }
}