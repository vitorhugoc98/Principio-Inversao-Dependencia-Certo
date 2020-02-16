package principioinversaodependenciacorreto;
public abstract class Veiculo {
    private boolean motorLigado;

    public Veiculo(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }
    
    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    @Override
    public String toString() {
        return "Status Motor{" + "motorLigado=" + motorLigado + '}';
    }
    
}
