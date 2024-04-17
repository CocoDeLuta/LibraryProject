package models;

public abstract class Midia {
    private String nome;

    public abstract void mostrar();

    public Midia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
