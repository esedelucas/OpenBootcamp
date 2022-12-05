public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.sumaNumeros(3, 6);
        //se va a ejecutar la funcíon según los datos que les pasemos, en este caso enteros
    }
}

class Vehiculo {
    public void diHola(){
        System.out.println("Hola!!");
    }

}

class Coche extends Vehiculo {
    public void diHola(){
        System.out.println("Soy un coche!!");
    }
    //también podemos crear funciones polimorficas

    public int sumaNumeros (int a, int b){
        return a+b;
    }

    public float sumaNumeros (float a, float b){
        return a+b * (float)9.0;
    }

    public void sumaNumeros (double a, double b){
        System.out.println("El resultado es: " + (a + b));
    }
}

/*
Hemos hecho polimorfismo. Una misma función
implementada en dos clases, ejecuta lo ultimo que hayamos
escrito. En este caso, como está en la función hija,
lo hace en la última editada.
 */
