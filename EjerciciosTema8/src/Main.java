public class Main {
    public static void main(String[] args) {
        // constructor persona1
        Persona persona = new Persona();
        //Datos persona1
        System.out.println("Datos de la clase 'persona1:");
        System.out.println("****************************");
        persona.setEdad(25);
        System.out.println("Edad:" +persona.getEdad());
        persona.setNombre("Sergio");
        System.out.println("Nombre:" +persona.getNombre());
        persona.setTelefono(34555555);
        System.out.println("Teléfono:" +persona.getTelefono());
        System.out.println("****************************");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    // -------- edad ----------
    public void setEdad(int edad) {
        this.edad = edad;
        //System.out.println("Edad:" +edad);
    }
    public int getEdad() {
        return this.edad;
    }

    // -------- nombre ----------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    // -------- telefono ----------

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}