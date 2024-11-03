package TDD;

public class InstrumentoMusical {
    private String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tocar() {
        System.out.println("Tocando " + nome);
    }
}