/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pc
 */
public class Jugador {
    
    private String nombre;
    private String colorDeFicha;
    private int puntuacion;

    public Jugador(String nombre, String colorDeFicha) {
        this.nombre = nombre;
        this.colorDeFicha = colorDeFicha;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorDeFicha() {
        return colorDeFicha;
    }

    public void setColorDeFicha(String colorDeFicha) {
        this.colorDeFicha = colorDeFicha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    
    
    
    
}
