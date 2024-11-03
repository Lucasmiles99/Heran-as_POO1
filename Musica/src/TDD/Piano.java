package TDD;

public class Piano extends Cordas {
    public Piano() {
        super("Piano");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o piano.");
    }
}