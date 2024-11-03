package TDD;

public class Banheiro extends Ambiente {
    private boolean banheira;

    public Banheiro(float area, boolean banheira) {
        super(area);
        this.banheira = banheira;
    }

    public boolean hasBanheira() {
        return banheira;
    }

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }
}