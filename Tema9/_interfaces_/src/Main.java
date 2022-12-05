public class Main {
    public static void main(String[] args) {

    }
}

interface Vehiculo {
    int variables = 0;
    void Acelerar (int cuantavelocidad);
    void Frenar (int cuantavelocidad);
}

//en la clase en la que se implementa la interface
//tienes que añadir las mismas funciones que haya en la interface
class Coche implements Vehiculo {
    public void Acelerar (int cuantavelocidad){

    }

    public void Frenar (int cuantavelocidad){

    }
}

/*
Las interfaces son como las clases abstractas
pero a diferencia de estas, no implementan ninguna funcion
sino que nos dicen lo que nosotros tenemos que implementar


 PSEUDOCODIGO:

 INTERFACE COCHE
    FUNCION ALMACENAR (NUM CUANTAVELOCIDAD)
    FUNCION FRENAR (NUM CUANTAVELOCIDAD)


 */