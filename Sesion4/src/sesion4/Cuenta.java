package sesion4;

import java.util.List;

public class Cuenta {
    private String numero;
    private String titular;
    private Double saldo;
    private List<Movimiento> mMovimientos;
    public  void ingreso(double dinero){
        System.out.println("Usted va a ingresar " + dinero + "$");
    }
    public  void reintegro(double cantidad){
         System.out.println("Usted va a retirar " + cantidad + "$");
    }
}
