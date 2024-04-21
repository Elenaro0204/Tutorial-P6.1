/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Elena RO
 */
public class MainCalculadora {
    
    public static void main(String[] args){
        
        /*APUNTES:
        - Instanciacion: necesito crear un objeto para que se pueda usar.
        
        Para acceder al metodo si no es estatico necesito crear un objeto.
        Las clases que llevan "static" necesitan un objeto mientras que las que no lo llevan no lo necesitan.
        Una clase Static usa directamente clase->metodo mientras que cuando no es static se usa clase->objeto->metodo.
        
        - Sobrecarga de un objeto: tener distintas versiones del mismo objeto.
        Tipos de Sobrecarga:
            - Sobrecarga por tipos de datos.
            - Sobrecarga por numero de parametro.
        
        Para acceder a un metodo privado tiene que ser desde la misma clase pero si quieres que se pueda acceder desde otra clase del paquete tiene que ser publico.
        Por defecto poner todos los atributos private.
        */
        
        
        Calculadora casio1 =new Calculadora("Casio", "PD20", "SN231242");
        int n1=3;
        int n2=8;
        /*Casio 2 es otro objeto tipo Calculadora*/
        Calculadora casio2 =new Calculadora();
        
        /*Calculadora.suma(3,8); -->Como el metodo saca por pantalla, va a sumar 3+8*/
        casio1.suma(6.0, 7.0);
        casio1.suma(n1,n2);
        casio2.multiplica(5, 4);
        casio2.suma();
        
        casio1.datos();
        
        /*Para usar el metodo String hay que crear una variable en Calculadora para poder usarlo*/
        System.out.println(casio1.toString());
    }
    
}
