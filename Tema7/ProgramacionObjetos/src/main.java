/**
 *
 * @author esedelucas
 */
public class main {

    public static void main(String args[]) {
        Coche coche = new Coche(); //instanciar clase
        //<nombreClase><nombreVarible> = new <nombreClase>
        //aquí se ejecuta el constructor
        //se puede instanciar la clase - llamar al constructor con o sin parametros
        //Coche coche = new Coche( 2 , 90);
        System.out.println(coche.numPuertas);
        System.out.println(coche.velMaxima);
        System.out.println(coche.velActual);

        Coche coche2 = new Coche(2,90); //instanciar clase
        System.out.println(coche2.numPuertas);
        System.out.println(coche2.velMaxima);
        System.out.println(coche2.velActual);


        // podemos instanciar más coches
        // Coche coche2 = new Coche();
        // Coche coche3 = new Coche();
        // cada coche tienen las mismas propiedades y los mismos métodos

    }
}

class Coche {
    int numPuertas;
    int velMaxima;
    float velActual;
    /* vamos a crear un constructor
    *  tienen que cumplirar una serie de reglas
    *  public <NombreClase()>
    *  es lo primero que se ejecuta tras inicializar el objeto
    *
    */
    public Coche() {
        //podemos aprovechar para incializar variables
        numPuertas = 5;
        velMaxima = 120;
        //System.out.println("Aquí se ejecuta el constructor");
        System.out.println("Este es el constructor sin parámetros");
    }

    public Coche (int puertas, int velocidad){
        //podemos aprovechar para incializar variables
        numPuertas = puertas;
        velMaxima = velocidad;
        //System.out.println("Aquí se ejecuta el constructor");
        System.out.println("Este es el constructor con parámetros");
    }
    public void acelerar() {
        velActual += 15;
    } //metodos
    public void decelerar(){
        velActual -= 30;
    }
}