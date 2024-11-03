package TDD;

public class Bispo extends PecaXadrez {

    public Bispo(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        if (Math.abs(novaLinha - linha) == Math.abs(novaColuna - coluna)) {
            linha = novaLinha;
            coluna = novaColuna;
            incrementarMovimentos();
            return true;
        }
        return false;
    }
}