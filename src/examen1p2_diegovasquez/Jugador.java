/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public abstract class Jugador {
    protected String Nombre;
    protected int Edad;
    protected String Nacionalidad;
    protected String PieHabil;
    protected Equipo Equipo;
    protected int Agarre;
    protected int Lanzamiento;
    protected int Fisico;
    protected int Ritmo;
    protected int Entrada;
    protected int Vision;
    protected int Passing;
    protected int Regate;
    protected int Disparo;
    protected int Rating;

    public Jugador() {
    }

    public Jugador(String Nombre, int Edad, String Nacionalidad, String PieHabil, Equipo Equipo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
        this.PieHabil = PieHabil;
        this.Equipo = Equipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getPieHabil() {
        return PieHabil;
    }

    public void setPieHabil(String PieHabil) {
        this.PieHabil = PieHabil;
    }

    public int getRating() {
        return Rating;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }
    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nEdad=" + Edad + "\nNacionalidad=" + Nacionalidad + "\nPie Habil=" + PieHabil + "\nRating=" + Rating + "\nEquipo=" + Equipo + "\nAgarre=" + Agarre + "\nLanzamiento=" + Lanzamiento + "\nFisico=" + Fisico + "\nRitmo=" + Ritmo + "\nEntrada=" + Entrada + "\nVision=" + Vision + "\nPassing=" + Passing + "\nRegate=" + Regate + "\nDisparo=" + Disparo;
    }
    public abstract void Caracteristicas();
    
}
