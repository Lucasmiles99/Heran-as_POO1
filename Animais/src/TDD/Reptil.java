package TDD;

public class Reptil extends Animal {
    public Reptil(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som característico de réptil.");
    }
}