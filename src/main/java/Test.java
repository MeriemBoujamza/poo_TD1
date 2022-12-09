import model.Client;
import model.Compte;
import service.BanqueService;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("hello");

       Client client1 = new Client("meriem","boujamza");
        Client client2 = new Client("toto","tata");
        Client client3 = new Client("average","joe");

        Compte c1 = new Compte(1,1000000,client1);
        Compte c2 = new Compte(2,100,client2);
        Compte c3 = new Compte(3,5000,client3);
        System.out.println("avant le tri");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("apres le tri");
        ArrayList<Compte> comptes = new ArrayList<>();
        comptes.add(c1);
        comptes.add(c2);
        comptes.add(c3);
        BanqueService bs = new BanqueService();
        ArrayList<Compte> comptesSorted = bs.sortBySolde(comptes);
        for (Compte c:
             comptesSorted) {
            System.out.println(c);

        }
        System.out.println("CREATION OF NEW BANK ACCOUNT");
        Scanner sc = new Scanner(System.in);
        Compte compte4 = new Compte();
        System.out.println("entrer votre nom et prenom");
        String nomPrenom = sc.nextLine();
        String[] nomPrenomSplit = nomPrenom.split(" ");
        compte4.setClient(new Client(nomPrenomSplit[0],nomPrenomSplit[1]));
        System.out.println("entrer votre solde");
        compte4.setNumero(4);
        compte4.setSolde(sc.nextInt());
        bs.writeJson(compte4);





    }
}
