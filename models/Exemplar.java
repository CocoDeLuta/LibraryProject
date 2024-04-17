package models;

public class Exemplar {
    private String codigo;
    private Midia[] exemplares;

    public Exemplar( String codigo) {
        this.codigo = codigo;
    }

    public void mostrarExemplares() {
        for (Midia exemplar : exemplares) {
            exemplar.mostrar();
        }
    }

    public void adicionarExemplar(Midia exemplar) {
        for (int i = 0; i < exemplares.length; i++) {
            if (exemplares[i] == null) {
                exemplares[i] = exemplar;
                break;
            }
        }
    }
    
}
