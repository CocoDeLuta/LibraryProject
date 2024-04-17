package models;

public class Livro extends Midia{
    private String ibsn;

    public Livro(String nome, String ibsn) {
        super(nome);
        this.ibsn = ibsn;
    }

    public void mostrar() {
        System.out.println("Livro: " + getNome() + " - IBSN: " + this.ibsn);
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }
}
