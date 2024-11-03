package TDD;

public class Cavalo extends PecaXadrez {

    public Cavalo(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        if ((Math.abs(novaLinha - linha) == 2 && Math.abs(novaColuna - coluna) == 1) ||
            (Math.abs(novaLinha - linha) == 1 && Math.abs(novaColuna - coluna) == 2)) {
            linha = novaLinha;
            coluna = novaColuna;
            incrementarMovimentos();
            return true;
        }
        return false;
    }
}