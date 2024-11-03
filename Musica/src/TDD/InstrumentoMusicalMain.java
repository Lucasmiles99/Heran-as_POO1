package TDD;

public class InstrumentoMusicalMain {
    public static void main(String[] args) {
        InstrumentoMusical violao = new Violao();
        InstrumentoMusical fagote = new Fagote();
        InstrumentoMusical trompete = new Trompete();
        InstrumentoMusical tuba = new Tuba();
        InstrumentoMusical tambor = new Tambor();
        InstrumentoMusical prato = new Prato();
        InstrumentoMusical piano = new Piano();
        InstrumentoMusical saxofone = new Saxofone();

        violao.tocar();
        fagote.tocar();
        trompete.tocar();
        tuba.tocar();
        tambor.tocar();
        prato.tocar();
        piano.tocar();
        saxofone.tocar();
    }
}