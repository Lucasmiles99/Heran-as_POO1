package TDD;

public class Rei extends PecaXadrez {

    public Rei(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        if (Math.abs(novaLinha - linha) <= 1 && Math.abs(novaColuna - coluna) <= 1) {
            linha = novaLinha;
            coluna = novaColuna;
            incrementarMovimentos();
            return true;
        }
        return false;
    }
}