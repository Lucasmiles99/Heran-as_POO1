package TDD;

public class Tuba extends Metais {
    public Tuba() {
        super("Tuba");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a tuba.");
    }
}