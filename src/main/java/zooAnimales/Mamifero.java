package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
    //Atributes
    public static int caballos=0;
    public static int leones=0;
    private boolean pelaje;
    private int patas;
    private static ArrayList<Mamifero>listado= new ArrayList<Mamifero>();

    //constructores
    public Mamifero(){
        listado.add(this);
        totalAnimales++;
    }
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje,int patas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.patas=patas;
        this.pelaje=pelaje;
        listado.add(this);
        totalAnimales++;
    }
    public void setPatas(int patas){
        this.patas=patas;
    }
    public void setPelaje(boolean pelaje){
        this.pelaje=pelaje;
    }
    public int getPatas(){
        return this.patas;
    }
    public boolean isPelaje(){
        return this.pelaje;
    }
    //methods
    public static int cantidadMamiferos(){
        return listado.size();
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return new Mamifero(nombre,edad,"pradera",genero,true,4);
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        return new Mamifero(nombre,edad,"selva",genero,true,4);
    }
    
}
