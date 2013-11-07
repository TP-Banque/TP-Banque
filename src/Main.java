public class Main {
        public static void main(String[] args) {
                Banque unebanque = new Banque();
                Client unclient1 = new Client("Dubois", "Elsie");
                Client unclient2 = new Client ("FIle", "Jean");
                CompteEpargne uneEpargne = new CompteEpargne(unclient1,32, -30000.00, 52.00 );
                CompteCourant unCourant = new CompteCourant(unclient2,42, 60, 20);

                uneEpargne.crediter(1000);
                uneEpargne.debiter(500);
                System.out.println(uneEpargne.toString());
                System.out.println(unCourant.toString());

                unebanque.ajouterClient(unclient1);
                unebanque.ajouterClient(unclient2);
                unebanque.afficherClient();


        }
}