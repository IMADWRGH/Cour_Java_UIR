import PaymentCommandManager.CommandeInterface.Paiement;
import PaymentCommandManager.Model.Commande;
import PaymentCommandManager.Services.Offline;
import PaymentCommandManager.Services.Online;
import Test.GestionCmd;
import Test.Paiment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Paiment paiment= GestionCmd.Mode();
//        Commande commande=new Commande(1,"Test",25,20.5,paiment);
//        commande.getPaiment().ModePaiment();
//        Commande c =new Commande();
//        c1=new Commande();
//        System.out.println(c);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Produit: ");
        String produit = scanner.nextLine();
        String temp = scanner.nextLine();
        produit = temp;
        System.out.println("Enter Id: ");
        int id = scanner.nextInt();
        System.out.println("Enter Quantite: ");
        int quantite = scanner.nextInt();

        System.out.println("Enter Prix: ");
        double prix = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("choisir les modes de paiement");
        String countryCode = scanner.nextLine();
        Paiement paiement =null;
        switch(countryCode) {
            case "Pay in Cash":
                paiement=new Offline();
                paiement.Pay();
                break;
            case "Pay in Paypal":
                paiement= new Online();
                paiement.Pay();
                break;
            default:
                System.out.println("choix invalide");
        }

        Commande commande = new Commande( id,produit, quantite, prix,paiement);

        System.out.println("Commande created: " + commande.toString());

        scanner.close();
    }


    }

