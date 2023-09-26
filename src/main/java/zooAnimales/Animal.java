package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal {
    //atributes
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;

    protected static int totalAnimales=0;

    //constructors
    public Animal(){
        totalAnimales++;
    }
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        totalAnimales++;
    }

    //setMethods
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //getMethods
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public String getGenero(){
        return this.genero;
    }

    //methods
    public String movimiento(){
        return "desplazarse";
    }
    public static String totalPorTipo(){
        return "Mamiferos: "+Mamifero.cantidadMamiferos()+
                "\nAves: "+Ave.cantidadAves()+
                "\nReptiles: "+Reptil.cantidadReptiles()+
                "\nPeces: "+Pez.cantidadPeces()+
                "\nAnfibios: "+Anfibio.cantidadAnfibios();
    }
    public String toString(){
        if (zona==null) {
            return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es " + this.genero;
        }
        else{
            return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es " +
                    this.genero+", la zona en la que me ubico es "+this.zona.getNombre()+", en el "+this.zona.getZoo().getNombre();
        }
    }
}
