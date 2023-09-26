package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
    //atributes
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    private static ArrayList<Pez> listado= new ArrayList<Pez>();


    //constructors
    public Pez(){
        listado.add(this);
        totalAnimales++;
    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorescamas, int cantidadaletas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorEscamas=colorescamas;
        this.cantidadAletas=cantidadaletas;
        listado.add(this);
        totalAnimales++;
    }

    //methods
    public static int cantidadPeces(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "nadar";
    }
    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones++;
        return new Pez(nombre,edad, "oceano",genero, "rojo",6);
    }
    public static Pez crearBacalao (String nombre, int edad, String genero){
        bacalaos++;
        return new Pez(nombre,edad, "oceano",genero, "gris",6);}
}
