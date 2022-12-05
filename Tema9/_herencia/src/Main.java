public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        //coche.setSonido("brrr");
        //System.out.println(coche.getSonido());
    }
}

interface Vehiculo {

}

interface Motor {

}

class Coche implements Motor, Vehiculo {
    public Coche (){

    }
}

/*
- herencia multiple: consiste en que una clase hereda de dos o más clases padre.
  se delcara: class Coche implements ClasePadre1, ClasePadre2
        ejemplo:
  CLASE VEHICULO
    funcion
  CLASE MOTOR
    tipo gasolina;
  CLASE COCHE - heredada de VEHICULO Y DE MOTOR
  las clases padre, deberemos cambiar "class" por "interface"

 */