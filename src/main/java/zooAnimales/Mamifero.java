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
    public String toString(){
        if (zona==null) {
            return "Mi nombre es "+this.nombre+"tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es " + this.genero;
        }
        else{
            return "Mi nombre es "+this.nombre+"tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es " +
                    this.genero+", la zona en la que me ubico es "+this.zona+", en el "+this.zona.getZoo();
        }
    }
}
