package principioinversaodependenciacorreto;
public class PrincipioInversaoDependenciaCorreto {
    public static void main(String[] args) {
        
        Carro carro00 = new Carro(false); 
        carro00.ligarMotor(); 
        carro00.toString();
        //carro00.desligarMotor(); 
        System.out.println(carro00.toString());
        
        Moto moto00 = new Moto(false);
        moto00.ligarMotor(); 
        moto00.toString(); 
        //moto00.desligarMotor(); 
        System.out.println(moto00.toString());
        
    }
    
}
