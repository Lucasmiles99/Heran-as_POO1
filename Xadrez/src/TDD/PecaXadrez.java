package TDD;

public abstract class PecaXadrez {
 protected int linha;
 protected int coluna;
 protected boolean cor; 
 protected int movimentos;

 public PecaXadrez(int linha, int coluna, boolean cor) {
     this.linha = linha;
     this.coluna = coluna;
     this.cor = cor;
     this.movimentos = 0;
 }

 public abstract boolean mover(int linha, int coluna);

 public int getLinha() {
     return linha;
 }

 public void setLinha(int linha) {
     this.linha = linha;
 }

 public int getColuna() {
     return coluna;
 }

 public void setColuna(int coluna) {
     this.coluna = coluna;
 }

 public boolean isCor() {
     return cor;
 }

 public void setCor(boolean cor) {
     this.cor = cor;
 }

 public int getMovimentos() {
     return movimentos;
 }

 public void incrementarMovimentos() {
     this.movimentos++;
   }
}