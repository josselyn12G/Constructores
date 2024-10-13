public class Automovil {
    // Atributos - Propiedadaes - Estado
    private String marca;
    private String modelo;
    private String color = "Verde";
    private float cilindraje;
    // Constructores

    public Automovil() {
        /* 1. Tiene el mismo nombre de la clase y comienza con mayúscula.
           2. No devuelve nada porque solo reserva un espacio de memoria.
           3. Puede o no recibir parámetros.
         */
    }

    // Sobrecarga de métodos y polimorfismo.
    public Automovil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }


    //Métodos propios de operaciones y tareas

    public String verDetalle(){
        String dv = "La marca es: " +this.marca + "\n" + "El modelo es: " +this.modelo + "\n" + "El color es: " +this.color +  "\n" + "El cilindraje es: " + getCilindraje();
        return dv;
    }


}


/* Superclase de Java: OBJECT.
El bytecode es el que se encuentra en la mitad.*/