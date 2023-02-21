package test;
public class Asiento {
    public String color;
    public Integer precio;
    public Integer registro;
    
    public Asiento(String color, Integer precio, Integer registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String color) {
        if(color.toLowerCase() == "verde" || color.toLowerCase()== "rojo" || color.toLowerCase() == "blanco" ||
           color.toLowerCase() == "amarillo" || color.toLowerCase() == "negro"){
            this.color = color;
        }else{ System.out.println("Color elegido no se encuentra en la lista de colore posibles" );}
    }
    
}