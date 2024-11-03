package TDD;

public class NaveEspacialMain {
	
    public static void main(String[] args) {
        Apolo11 apolo11 = new Apolo11(25000, "Hidrazina");
        System.out.println("Apolo 11: Velocidade Máxima = " + apolo11.getVelocidadeMaxima() + " km/h, Tipo de Combustível = " + apolo11.getTipoCombustivel());

        MillenniumFalcon millenniumFalcon = new MillenniumFalcon(1050, 0.5f);
        System.out.println("Millennium Falcon: Velocidade Máxima = " + millenniumFalcon.getVelocidadeMaxima() + " km/h, Classe de Hiperpropulsor = " + millenniumFalcon.getClasseHiperpropulsor());
    }
}