package TDD;

public class Saxofone extends Madeiras {
    public Saxofone() {
        super("Saxofone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o saxofone.");
    }
}