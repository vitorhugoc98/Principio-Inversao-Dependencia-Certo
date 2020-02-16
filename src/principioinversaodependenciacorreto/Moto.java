package principioinversaodependenciacorreto;
public class Moto extends Veiculo implements InterfaceMotor{

    public Moto(boolean motorLigado) {
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
