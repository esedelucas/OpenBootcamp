public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("brrr");
        System.out.println(coche.getSonido());
    }
}

abstract class Vehiculo {
    int velocidadMaxima;
    String  tipoGasolina;
    String  matricula;
    String  sonido;
    public Vehiculo (){
        System.out.println("Estoy en el constructor de vehiculo");
    }

    abstract public String getSonido();
    /*
    las clases abstractas, los getters y setters NO realizan
    acciones, sino que delego en las clases hijas lo que se hace.
     */
    abstract public void setSonido(String sonido);

}

class Coche extends Vehiculo{
    //conla palabra extends ya decimos que la clase coche
    //es una clase heredada de la clase vehículo
    public String getSonido(){
        return "Soy un super sonido: " + this.sonido;
        //return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

class Moto extends Vehiculo{
    public String getSonido(){
        return "Soy un super sonido: " + this.sonido;
        //return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }

}

/*
TIPOS DE HERENCIA:
el tipo de herencia es la relación que tenemos entre las clases heredadas.
- herencia simple: una clase hereda de otra
- herencia multilevel: una clase hereda de otra clase que a su vez hereda de otra clase.
- herencia multiple: consiste en que una clase hereda de dos o más clases padre.
        ejemplo:
  CLASE VEHICULO
    funcion
  CLASE MOTOR
    tipo gasolina;
  CLASE COCHE - heredada de VEHICULO Y DE MOTOR
- herencia jerarquica: como un arbol, de una clase base heredan otras dos clases. y de otra base heredan otras dos bases
- herencia hibrida: combina modelos de herencia.
 */