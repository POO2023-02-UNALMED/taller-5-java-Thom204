package zooAnimales;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Anfibio extends Animal{
    //atributes
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    private static ArrayList<Anfibio>listado= new ArrayList<Anfibio>();

    //constructors
    public Anfibio(){
        listado.add (this);
        totalAnimales++;
    }
    public Anfibio(String nombre, int edad, String habitat, String genero,String colorpiel, boolean veneno){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPiel=colorpiel;
        this.venenoso=veneno;
        listado.add (this);
        totalAnimales++;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso=venenoso;
    }


    public String getColorPiel() {
        return this.colorPiel;
    }
    public boolean isVenenoso() {
        return this.venenoso;
    }
    //methods
    public static int cantidadAnfibios(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "saltar";
    }
    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre,edad, "selva",genero, "rojo",true);
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
}
