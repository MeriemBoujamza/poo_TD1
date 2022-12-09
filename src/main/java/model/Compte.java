package model;

public class Compte  implements Comparable{

    private int numero;
    private int solde;
    private Client client;

    public Compte() {
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", client=" + client +
                '}';
    }

    public Compte(int numero, int solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.client = client;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public int compareTo(Object c) {
        int solde1=((Compte)c).getSolde();
        /* For Ascending order*/
        return this.solde- solde1;

    }
}
