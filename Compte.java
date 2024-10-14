import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
    protected String id;
    protected String dateCreation;
    protected double montant;
    protected List<Operation> operations;

    public Compte(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.montant = 0;
        this.operations = new ArrayList<>();
    }

    public abstract boolean addOperation(Operation operation);

    public double getMontant() {
        return montant;
    }

    public List<Operation> getOperations() {
        return operations;
    }
}