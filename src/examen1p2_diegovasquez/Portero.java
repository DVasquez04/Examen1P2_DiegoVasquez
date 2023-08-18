/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegovasquez;

import java.util.Random;

/**
 *
 * @author Diego Vasquez
 */
public class Portero extends Jugador{
static Random ran = new Random();

    public Portero() {
        super();
    }

    public Portero(String Nombre, int Edad, String Nacionalidad, String PieHabil, examen1p2_diegovasquez.Equipo Equipo) {
        super(Nombre, Edad, Nacionalidad, PieHabil, Equipo);
        Caracteristicas();
    }

    @Override
    public void Caracteristicas() {
        boolean valid = true;
        int r = 0;
        while(valid){
            r = 1+ran.nextInt(12);
            r = r*12;
            if(r >= 70 && r <= 100){
                valid = false;
            }
        }//fin while
        
        Agarre = r;
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(12);
            r = r*12;
            if(r >= 70 && r <= 100){
                valid = false;
            }
        }//fin while
        Lanzamiento = r;
        
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(12);
            r = r*12;
            if(r >= 70 && r <= 100){
                valid = false;
            }
        }//fin while
        Passing = r;
        
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(5);
            r = r*13;
            if(r <= 100){
                valid = false;
            }
        }//fin while
        Fisico = r;
        
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(5);
            r = r*13;
            if(r <= 100){
                valid = false;
            }
        }//fin while
        Ritmo = r;
        
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(5);
            r = r*13;
            if(r <= 100){
                valid = false;
            }
        }//fin while
        Entrada = r;
        
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(5);
            r = r*13;
            if(r <= 100){
                valid = false;
            }
        }//fin while
        Vision = r;
        
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(5);
            r = r*13;
            if(r <= 100){
                valid = false;
            }
        }//fin while
        Regate = r;
        
        valid = true;
        r = 0;
        while(valid){
            r = 1+ran.nextInt(5);
            r = r*13;
            if(r <= 100){
                valid = false;
            }
        }//fin while
        Disparo = r;
        
        Rating =(Agarre+Lanzamiento+Fisico+Ritmo+Entrada+Vision+Passing+Regate+Disparo)/9;
    }//fin caracteristicas
    
}
