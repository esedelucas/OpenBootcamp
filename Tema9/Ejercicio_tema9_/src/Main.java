public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente ();
        cliente.nombre = "Sergio";
        cliente.edad = 38;
        cliente.telefono = 5555555;
        cliente.credito = 6554.98;

        System.out.println("Clase Cliente");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Nombre: " +cliente.nombre);
        System.out.println("------------------------");
        System.out.println("Edad: " +cliente.edad);
        System.out.println("------------------------");
        System.out.println("Telefono: " +cliente.telefono);
        System.out.println("------------------------");
        System.out.println("Crédito: " +cliente.credito);
        System.out.println("++++++++++++++++++++++++");
        //+++++++++++++++++++++++++++++++++++++++++++++++//
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Sergio";
        trabajador.edad = 38;
        trabajador.telefono = 5555555;
        trabajador.salario = 1477.55;
        System.out.println("Clase Trabajador");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Nombre: " +trabajador.nombre);
        System.out.println("------------------------");
        System.out.println("Edad: " +trabajador.edad);
        System.out.println("------------------------");
        System.out.println("Telefono: " +trabajador.telefono);
        System.out.println("------------------------");
        System.out.println("Salario: " +trabajador.salario);
        System.out.println("++++++++++++++++++++++++");

    }
}

class Persona {

    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}