public class Main {
    public static void main(String[] args) {
        Compte compteCourant = new CompteCourant("123", "10/10/2022");
        Compte compteEpargne = new CompteEpargne("456", "01/01/2020");

        Operation debit = new Operation(100, TypeOperation.Debit);
        Operation credit = new Operation(50, TypeOperation.Credit);

        System.out.println("Ajout opération sur compte courant : " + compteCourant.addOperation(debit));
        System.out.println("Ajout opération sur compte courant : " + compteCourant.addOperation(credit));
        System.out.println("Montant du compte courant : " + compteCourant.getMontant());

        System.out.println("Ajout opération sur compte épargne : " + compteEpargne.addOperation(debit));
        System.out.println("Ajout opération sur compte épargne : " + compteEpargne.addOperation(credit));
        System.out.println("Montant du compte épargne : " + compteEpargne.getMontant());
    }
}
