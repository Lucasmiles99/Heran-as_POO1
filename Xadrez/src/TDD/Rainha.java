package TDD;

public class Rainha extends PecaXadrez {

    public Rainha(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        if (novaLinha == linha || novaColuna == coluna ||
            Math.abs(novaLinha - linha) == Math.abs(novaColuna - coluna)) {
            linha = novaLinha;
            coluna = novaColuna;
            incrementarMovimentos();
            return true;
        }
        return false;
    }
}