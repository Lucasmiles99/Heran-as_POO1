package TDD;

public class VeiculoMain {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(true);
        Caminhao caminhao = new Caminhao(true, 4);
        Carro carro = new Carro(true, 4);
        Moto moto = new Moto(true, 250);

        System.out.println(veiculo);
        System.out.println(caminhao);
        System.out.println(carro);
        System.out.println(moto);
    }
}