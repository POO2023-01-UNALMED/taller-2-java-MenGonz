// Auto.java
//
// modelo string 
// precio int
// asientos array[asiento]
// marca string
// motor Motor
// registro Int 
// cantidadCreados Int
// ----------------------------------------------------------------
// cantidadAsientos(); int
// verificarIntegridad(); String
// 
public class Auto {
    public String modelo;
    public Integer precio;
    public Asiento[] asientos;
    public String marca;    
    public Motor motor;
    public Integer registro;
    public static Integer cantidadCreados;
    
    public Auto(String marca, String modelo, Motor motor, Asiento[] asientos, Integer registro, String cantidadCreados) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.asientos = asientos;
        this.registro = registro;
    }
    
    public Integer cantidadAsientos(){
        return this.asientos.length;
    }

    public String verificarIntegridad(){
        Boolean x = true;
        Integer reg = motor.registro;
        for(int i = 0; i < asientos.lenght; ++i){
            if(!(reg == asientos[i].registro)){ x = false; break;}
        }
        if(x){ System.out.println("Auto original"); }
        else{System.out.println("Las piezas no son originales");}
    }
}
