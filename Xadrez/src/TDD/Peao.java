package TDD;

public class Peao extends PecaXadrez {

    public Peao(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        if (cor && novaLinha == linha + 1 && novaColuna == coluna) { 
            linha = novaLinha;
            coluna = novaColuna;
            incrementarMovimentos();
            return true;
        } else if (!cor && novaLinha == linha - 1 && novaColuna == coluna) { 
            linha = novaLinha;
            coluna = novaColuna;
            incrementarMovimentos();
            return true;
        }
        return false;
    }
}