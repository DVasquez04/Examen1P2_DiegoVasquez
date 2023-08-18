/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegovasquez;

import java.util.ArrayList;

/**
 *
 * @author Diego Vasquez
 */
public class Equipo {
    private String Nombre;
    private String Pais;
    private int Rating;
    private ArrayList<Jugador> Plantilla = new ArrayList();

    public Equipo() {
    }

    public Equipo(String Nombre, String Pais) {
        this.Nombre = Nombre;
        this.Pais = Pais;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getRating() {
        setRating();
        return Rating;
    }

    public void setRating() {
        int R = 0;
        for (int i = 0; i < Plantilla.size(); i++) {
            R += Plantilla.get(i).getRating();
        }
        R = (R/4);
        this.Rating = R;
    }

    public ArrayList<Jugador> getPlantilla() {
        return Plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> Plantilla) {
        int js = Plantilla.size();
        if(js == 4){
            this.Plantilla = Plantilla;
        }else{
            System.out.println("Jugadores en planilla overflow");
        }
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nPais=" + Pais + "\nRating=" + Rating + "\nPlantilla=" + Plantilla.toString();
    }
    
}
