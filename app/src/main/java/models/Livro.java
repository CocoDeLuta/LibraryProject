package models;

public class Livro extends Midia {
    private String isbm; // International Standard Book Number

    public Livro(String nome, String isbm) {
        super(nome);
        this.isbm = isbm;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    @Override
    public void mostrar() {
        System.out.println("Livro: " + getNome() + " - ISBM: " + this.isbm);
    }

}
