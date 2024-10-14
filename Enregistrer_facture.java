import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Enregistrer_facture {

    public void saveFacture(Facture facture) {
        try {
            // create a FileWriter object with the file name
            String file = "Facture".concat(String.valueOf(this.id));
            FileWriter writer = new FileWriter(file);
            writer.write(this.id);
            // write the string to the file
            for (Map.Entry mapentry : facture.produits.entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() );
            }
            writer.write("Prix = " + facture.getTotal());
            writer.write("PrixTTC = " + tfacture.getTotalTTC());
            // close the writer
            writer.close();

            System.out.println("Successfully wrote text to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}