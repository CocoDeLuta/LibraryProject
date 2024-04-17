
package projeto;
import models.*;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "978-3-16-148410-0");
        livro.mostrar();
    }
}
