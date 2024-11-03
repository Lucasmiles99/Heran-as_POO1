package TDD;

public class AnimalMain {
    public static void main(String[] args) {
        Animal gato = new Gato("Gato");
        Animal cao = new Cao("Cão");
        Animal tartaruga = new Tartaruga("Tartaruga");
        Animal lagarto = new Lagarto("Lagarto");

        gato.emitirSom();
        cao.emitirSom();
        tartaruga.emitirSom();
        lagarto.emitirSom();
    }
}