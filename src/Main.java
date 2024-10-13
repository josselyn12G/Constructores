//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciación de objeto.
        Automovil bmw = new Automovil("BMW", "I22"); // Cuando no existe el constructor el Java en su proceso crea un constructor implícito.

        bmw.setColor("Negro");
        bmw.setCilindraje(200f);
        System.out.println("bmw = \n"+ bmw.verDetalle());

        // Segundo objeto
        Automovil bmw2 = new Automovil("Mercedes", "ML200"); // Asignar valores dentro del constructor.

        bmw2.setColor("Negro");
        bmw2.setCilindraje(200f);
        System.out.println("bmw2 = \n"+ bmw2.verDetalle());


        // Comparación de objetos.
        System.out.println(bmw == bmw2);



        //  Principio de Programación Orientada a Objetos: Cada objeto tiene una identidad única.
    }
}