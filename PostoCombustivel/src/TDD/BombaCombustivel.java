package TDD;

public class BombaCombustivel {
 private double totalLitros;
 private float valorLitro;

 public BombaCombustivel(double totalLitros, float valorLitro) {
     this.totalLitros = totalLitros;
     this.valorLitro = valorLitro;
 }

 public boolean abastecerPorLitro(int litros) {
     if (litros <= totalLitros) {
         totalLitros -= litros;
         System.out.println("Abastecido " + litros + " litros.");
         return true;
     } else {
         System.out.println("Quantidade insuficiente de combustível.");
         return false;
     }
 }

 public boolean abastecerPorValor(double valor) {
     int litros = (int) (valor / valorLitro);
     if (litros <= totalLitros) {
         totalLitros -= litros;
         System.out.println("Abastecido " + litros + " litros com o valor de R$ " + valor);
         return true;
     } else {
         System.out.println("Quantidade insuficiente de combustível.");
         return false;
     }
 }

 public double getTotalLitros() {
     return totalLitros;
 }

 public void setTotalLitros(double totalLitros) {
     this.totalLitros = totalLitros;
 }

 public float getValorLitro() {
     return valorLitro;
 }

 public void setValorLitro(float valorLitro) {
     this.valorLitro = valorLitro;
 }
}