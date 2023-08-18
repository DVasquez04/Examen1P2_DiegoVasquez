/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Jugador {
    protected String Nombre;
    protected int Edad;
    protected String Nacionalidad;
    protected String PieHabil;
    protected int Rating;
    protected String Equipo;
    protected int Agarre;
    protected int Lanzamiento;
    protected int Fisico;
    protected int Ritmo;
    protected int Entrada;
    protected int Vision;
    protected int Passing;
    protected int Regate;
    protected int Disparo;

    public Jugador() {
    }

    public Jugador(String Nombre, int Edad, String Nacionalidad, String PieHabil, int Rating, String Equipo, int Agarre, int Lanzamiento, int Fisico, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
        this.PieHabil = PieHabil;
        this.Rating = Rating;
        this.Equipo = Equipo;
        this.Agarre = Agarre;
        this.Lanzamiento = Lanzamiento;
        this.Fisico = Fisico;
        this.Ritmo = Ritmo;
        this.Entrada = Entrada;
        this.Vision = Vision;
        this.Passing = Passing;
        this.Regate = Regate;
        this.Disparo = Disparo;
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

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getAgarre() {
        return Agarre;
    }

    public void setAgarre(int Agarre) {
        this.Agarre = Agarre;
    }

    public int getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(int Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public int getFisico() {
        return Fisico;
    }

    public void setFisico(int Fisico) {
        this.Fisico = Fisico;
    }

    public int getRitmo() {
        return Ritmo;
    }

    public void setRitmo(int Ritmo) {
        this.Ritmo = Ritmo;
    }

    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public int getVision() {
        return Vision;
    }

    public void setVision(int Vision) {
        this.Vision = Vision;
    }

    public int getPassing() {
        return Passing;
    }

    public void setPassing(int Passing) {
        this.Passing = Passing;
    }

    public int getRegate() {
        return Regate;
    }

    public void setRegate(int Regate) {
        this.Regate = Regate;
    }

    public int getDisparo() {
        return Disparo;
    }

    public void setDisparo(int Disparo) {
        this.Disparo = Disparo;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nEdad=" + Edad + "\nNacionalidad=" + Nacionalidad + "\nPie Habil=" + PieHabil + "\nRating=" + Rating + "\nEquipo=" + Equipo + "\nAgarre=" + Agarre + "\nLanzamiento=" + Lanzamiento + "\nFisico=" + Fisico + "\nRitmo=" + Ritmo + "\nEntrada=" + Entrada + "\nVision=" + Vision + "\nPassing=" + Passing + "\nRegate=" + Regate + "\nDisparo=" + Disparo;
    }
    
}
