package TDD;

public class Trompete extends Metais {
    public Trompete() {
        super("Trompete");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o trompete.");
    }
}