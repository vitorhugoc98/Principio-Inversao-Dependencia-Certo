package principioinversaodependenciacorreto;
public class Carro extends Veiculo implements InterfaceMotor{

    public Carro(boolean motorLigado) {
        super(motorLigado);
    }

    @Override
    public boolean ligarMotor() {
        if(!super.isMotorLigado()){
            super.setMotorLigado(true);
        }
        return super.isMotorLigado(); 
    }

    @Override
    public boolean desligarMotor() {
        if(super.isMotorLigado()){
            super.setMotorLigado(false);
        }
        return super.isMotorLigado();
    }
    
}
