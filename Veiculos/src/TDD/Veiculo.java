package TDD;

public class Veiculo {
    private boolean motor;

    public Veiculo(boolean motor) {
        this.motor = motor;
    }

    public boolean hasMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "motor = " + motor +
                '}';
    }
}