package PaymentCommandManager.Model;

import PaymentCommandManager.CommandeInterface.Paiement;

public class Commande {
    private int id;
    private String produit;
    private int quantite;
    private double prix;

    private Paiement paiement;


    public Commande(int id, String produit, int quantite, double prix,Paiement paiement) {
        this.id = id;
        this.produit = produit;
        this.quantite = quantite;
        this.prix = prix;
        this.paiement=paiement;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
