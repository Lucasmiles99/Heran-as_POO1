package TDD;

public class Tambor extends Percussao {
    public Tambor() {
        super("Tambor");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o tambor.");
    }
}