package TDD;

public class Tartaruga extends Reptil {
    public Tartaruga(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz som de tartaruga.");
    }
}