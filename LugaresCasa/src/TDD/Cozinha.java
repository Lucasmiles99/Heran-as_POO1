package TDD;

public class Cozinha extends Ambiente {
    private boolean microondas;

    public Cozinha(float area, boolean microondas) {
        super(area);
        this.microondas = microondas;
    }

    public boolean hasMicroondas() {
        return microondas;
    }

    public void setMicroondas(boolean microondas) {
        this.microondas = microondas;
    }
}