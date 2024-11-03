package TDD;

public class Torre extends PecaXadrez {

    public Torre(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        if (novaLinha == linha || novaColuna == coluna) {
            linha = novaLinha;
            coluna = novaColuna;
            incrementarMovimentos();
            return true;
        }
        return false;
    }
}