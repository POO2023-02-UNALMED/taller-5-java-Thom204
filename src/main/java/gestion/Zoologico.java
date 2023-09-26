package gestion;

import java.util.ArrayList;

public class Zoologico {
    //Atributos
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas= new ArrayList<Zona>();

    //constructors
    public Zoologico(){}
    public Zoologico(String nombre, String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }

    //getMethods
    public String getNombre(){
        return this.nombre;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public ArrayList<Zona> getZona(){
        return this.zonas;
    }

    //methods
    public void agregarZonas(Zona zona){
        zonas.add(zona);
        zona.setZoo(this);
    }
    public int cantidadTotalAnimales(){
        int ctr=0;
        for (Zona zona : zonas){
            ctr+=zona.cantidadAnimales();
        }
        return ctr;
    }
}
