package TDD;

public class AmbienteMain {
	
    public static void main(String[] args) {
        Quarto quarto = new Quarto(15.0f, 2);
        System.out.println("Quarto: Área = " + quarto.getArea() + " m², Capacidade = " + quarto.getCapacidade() + " pessoas");

        Sala sala = new Sala(20.0f, true);
        System.out.println("Sala: Área = " + sala.getArea() + " m², TV = " + (sala.hasTv() ? "Sim" : "Não"));

        Banheiro banheiro = new Banheiro(5.0f, true);
        System.out.println("Banheiro: Área = " + banheiro.getArea() + " m², Banheira = " + (banheiro.hasBanheira() ? "Sim" : "Não"));

        Cozinha cozinha = new Cozinha(10.0f, true);
        System.out.println("Cozinha: Área = " + cozinha.getArea() + " m², Micro-ondas = " + (cozinha.hasMicroondas() ? "Sim" : "Não"));
    }
}