package TDD;

public class Sala extends Ambiente {
    private boolean tv;

    public Sala(float area, boolean tv) {
        super(area);
        this.tv = tv;
    }

    public boolean hasTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }
}