package test;
public class Motor {
    public int numeroCilindros;
    public String tipo;
    public Integer registro;
    
    public void cambiarRegistro(Integer registro){
        this.registro = registro;
    }
    
    public void asignarTipo(String tipo) {
        if(tipo.toLowerCase() == "electrico" || tipo.toLowerCase() == "gasolina")
        { this.tipo = tipo; }
    }
    
}
