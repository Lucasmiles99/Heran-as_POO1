package TDD;

public class BombaCombustivelMain {
 public static void main(String[] args) {
     BombaGasolina bombaGasolina = new BombaGasolina(1000, 5.50f);
     BombaEtanol bombaEtanol = new BombaEtanol(800, 4.00f);
     BombaDiesel bombaDiesel = new BombaDiesel(1200, 6.00f);

     bombaGasolina.abastecerPorLitro(20);
     bombaEtanol.abastecerPorValor(100);
     bombaDiesel.abastecerPorLitro(50);
 	}
}