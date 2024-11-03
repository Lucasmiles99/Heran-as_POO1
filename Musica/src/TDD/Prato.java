package TDD;

public class Prato extends Percussao {
    public Prato() {
        super("Prato");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o prato.");
    }
}