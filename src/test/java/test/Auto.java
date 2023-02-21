package test;
public class Auto {
    public String modelo;
    public Integer precio;
    public Asiento[] asientos;
    public String marca;    
    public Motor motor;
    public Integer registro;
    public static Integer cantidadCreados;
    
    
    public Integer cantidadAsientos(){
        Integer cont = 0;

        for (int i = 0; i < asientos.length; i++) {
            if(!(this.asientos[i] == null)){
                cont += 1;
            }
        }
        return cont;
    }

    public String verificarIntegridad(){
        Boolean x = true;
        Integer reg = motor.registro;
        for(int i = 0; i < asientos.length; ++i){
            if(!(asientos[i] == null)){
                if(!(reg == asientos[i].registro)){ x = false; break;}
            }
            
        }
        if(x && this.registro == reg){ return("Auto original"); }
        else{ return("Las piezas no son originales");}
    }
}
