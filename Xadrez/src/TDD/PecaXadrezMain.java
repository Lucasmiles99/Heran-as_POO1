package TDD;

public class PecaXadrezMain {
 
	public static void main(String[] args) {
     PecaXadrez rei = new Rei(0, 4, true);
     PecaXadrez rainha = new Rainha(0, 3, true);
     PecaXadrez peao = new Peao(1, 0, true);

     System.out.println("Movendo o rei: " + rei.mover(1, 4)); 
     System.out.println("Movendo a rainha: " + rainha.mover(1, 4)); 
     System.out.println("Movendo o peão: " + peao.mover(2, 0)); 
 	}
}