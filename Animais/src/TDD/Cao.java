package TDD;

public class Cao extends Mamifero {
    public Cao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " late.");
    }
}