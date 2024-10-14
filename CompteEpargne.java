import java.time.LocalDate;

public class CompteEpargne extends Compte {

    public CompteEpargne(String id, String dateCreation) {
        super(id, dateCreation);
    }

    @Override
    public boolean addOperation(Operation operation) {
        if (operation.getTypeOperation() == TypeOperation.Debit) {
            montant += operation.getMontant() * 0.05;
            operations.add(operation);
            return true;
        } else {
            int anneeCreation = Integer.parseInt(dateCreation.split("/")[2]);
            if (montant >= operation.getMontant() * 0.1 &&
                    LocalDate.now().getYear() > anneeCreation) {
                montant -= operation.getMontant() * 0.1;
                operations.add(operation);
                return true;
            }
            return false;
        }
    }
}