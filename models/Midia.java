package models;

public abstract class Midia {
    private String nome;

    public abstract void mostrar();
    
    public String getNome() {
        return nome;
    }

    public Midia(String nome) {
        this.nome = nome;
    }
}
