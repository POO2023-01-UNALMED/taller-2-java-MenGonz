package test;
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
        for(int i = 0; i < asientos.length; ++i){
            if(!(reg == asientos[i].registro)){ x = false; break;}
        }
        if(x){ return("Auto original"); }
        else{ return("Las piezas no son originales");}
    }
}
