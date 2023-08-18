/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Estadio {
    private String Nombre;
    private String Ciudad;
    private int Capacidad;
    private String EquipoPerteneciente;

    public Estadio() {
    }

    public Estadio(String Nombre, String Ciudad, int Capacidad, String EquipoPerteneciente) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Capacidad = Capacidad;
        this.EquipoPerteneciente = EquipoPerteneciente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getEquipoPerteneciente() {
        return EquipoPerteneciente;
    }

    public void setEquipoPerteneciente(String EquipoPerteneciente) {
        this.EquipoPerteneciente = EquipoPerteneciente;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nCiudad=" + Ciudad + "\nCapacidad=" + Capacidad + "\nEquipo Perteneciente=" + EquipoPerteneciente;
    }
    
}
