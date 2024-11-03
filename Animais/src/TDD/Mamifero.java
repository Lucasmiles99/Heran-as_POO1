package TDD;

public class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som característico de mamífero.");
    }
}