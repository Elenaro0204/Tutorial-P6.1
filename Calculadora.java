

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Elena RO
 */
class Calculadora {

    // Atributos
    private String marca;
    private String modelo;
    private String nserie;
    /*public static int objetos; Es util para controlar cuantos objetos se crean (Ejemplo: controla cuantas calculadoras se crean)*/

    private Scanner sc = new Scanner(System.in);

    // Constructor
    public Calculadora(String marca, String modelo, String nserie) {
        this.marca = marca;
        this.modelo = modelo;
        this.nserie = nserie;
        /*this.objetos += 1;*/

    }

    // Constructor2 (sobrecarga del metodo constructor por numero de parametro)
    public Calculadora() {

    }

    // Métodos
    /*public static void suma(double n1, double n2) {
        System.out.println("La suma de los reales " + n1 + " mas " + n2 + " es " + (n1 + n2));
    }*/
    
    public double suma(double n1, double n2){
        return n1+n2;
    }

    // Sobrecarga del metodo suma por tipo de datos
    public void suma(int n1, int n2) {
        System.out.println("La suma de los enteros " + n1 + " mas " + n2 + " es " + (n1 + n2));
    }

    // Sobrecarga del metodo suma por numero de parametro (otra version que se diferencia del anterior en algun aspecto)
    public void suma() {
        System.out.print("Introduce el primer numero:");
        float n1 = sc.nextFloat();
        System.out.print("Introduce el segundo numero:");
        float n2 = sc.nextFloat();
        System.out.println("La suma de " + n1 + " mas " + n2 + " es " + (n1 + n2));
    }

    /*public void resta(float n1, float n2) {
        System.out.println("La resta de " + n1 + " menos " + n2 + " es " + (n1 - n2));
    */
    
    public double resta(double n1, double n2){
        return n1-n2;
    }

    /*Aqui irá la multiplicación y la división*/

    public void datos() {
        System.out.println("La marca es: " + this.marca + "\nEl modelo es: " + this.modelo + "\nEl SN es: " + this.nserie);
    }

    //Añadido toString
    @Override
    /*Significa que redefino el metodo que viene de una clase superior*/
    public String toString() {
        /*Es necesario una variable String para poderlo usar*/
        String datos = "Calculadora{" + "La marca es: " + this.marca + ", el modelo es: " + this.modelo + " y el SN es: " + this.nserie + '}';
        return datos;
    }

    // getter y setter: sirve para poder ver y acrualizar los datos desde dentro del programa
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    /*public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }*/
}
