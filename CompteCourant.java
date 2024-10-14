public class CompteCourant extends Compte {

    public CompteCourant(String id, String dateCreation) {
        super(id, dateCreation);
    }

    @Override
    public boolean addOperation(Operation operation) {
        if (operation.getTypeOperation() == TypeOperation.Debit) {
            montant += operation.getMontant();
            operations.add(operation);
            return true;
        } else {
            if (montant >= operation.getMontant()) {
                montant -= operation.getMontant();
                operations.add(operation);
                return true;
            }
            return false;
        }
    }
}