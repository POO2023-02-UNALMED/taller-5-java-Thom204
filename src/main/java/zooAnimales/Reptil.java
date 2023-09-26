package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    //atributes
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    private static ArrayList<Reptil>listado= new ArrayList<Reptil>();

    //constructors
    public Reptil(){
        listado.add(this);
        totalAnimales++;
    }
    public Reptil(String nombre, int edad, String habitat, String genero, String escamas, int largocola){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorEscamas=escamas;
        this.largoCola=largocola;
        listado.add(this);
        totalAnimales++;
    }

    //methods
    public static int cantidadReptiles(){
        return Reptil.listado.size();
    }
    @Override
    public String movimiento(){
        return "reptar";
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }
}
