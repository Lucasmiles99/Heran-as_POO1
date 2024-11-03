package TDD;

public class Violao extends Cordas {
    public Violao() {
        super("Violão");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o violão.");
    }
}