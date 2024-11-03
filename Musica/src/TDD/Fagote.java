package TDD;

public class Fagote extends Madeiras {
    public Fagote() {
        super("Fagote");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o fagote.");
    }
}