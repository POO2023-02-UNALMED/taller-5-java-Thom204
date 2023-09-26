package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    //atributes
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    private static ArrayList<Ave>listado=new ArrayList<Ave>();

    //constructors
    public Ave(){
        listado.add(this);
        totalAnimales++;
    }
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPlumas=colorPlumas;
        listado.add(this);
        totalAnimales++;
    }
    public void setColorPlumas(String color){
        this.colorPlumas=color;
    }
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    //methods
    public static int cantidadAves(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "volar";
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return new Ave(nombre,edad, "montanas",genero, "cafe glorioso");
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return new Ave(nombre,edad, "montanas",genero, "blanco y amarillo");
    }
}
