package TDD;

public class Quarto extends Ambiente {
    private int capacidade;

    public Quarto(float area, int capacidade) {
        super(area);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}