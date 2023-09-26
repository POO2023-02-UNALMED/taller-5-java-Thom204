package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;
public class Zona {
    //atributes
    private String nombre;
    private ArrayList<Animal> animales= new ArrayList<Animal>();
    private Zoologico zoo;

    //constructors
    public Zona(){}
    public Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo=zoo;
    }

    //setMethods
    public void setZoo(Zoologico zoo){
        this.zoo=zoo;
    }

    //getMethods
    public Zoologico getZoo(){
        return this.zoo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }

    //methods
    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }
    public int cantidadAnimales(){
        return this.animales.size();
    }
}
