package Test;

public class Commande {
    private int id;
    private String produit;
    private int quantite;
    private double prix;
    private  Paiment paiment;

    public Commande() {
    }

    public Commande(int id, String produit, int quantite, double prix, Paiment paiment) {
        this.id = id;
        this.produit = produit;
        this.quantite = quantite;
        this.prix = prix;
        this.paiment=paiment;
    }

    public Paiment getPaiment() {
        return paiment;
    }

    public void setPaiment(Paiment paiment) {
        this.paiment = paiment;
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
