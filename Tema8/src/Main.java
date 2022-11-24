public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        //vehiculo.tipo = "Coche";
        vehiculo.setTipo("Coche");
        System.out.println(vehiculo.getTipo());
    }

}

class Vehiculo {
    //String tipo; // aquí la propiedad sería publica
    private String tipo; //aquí sería privada. Solo funciona
    // dentro de este constructor
    // --- aqui empiezan setters y getters ---
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
}