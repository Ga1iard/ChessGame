/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bidob
 */
public abstract class Ficha {
    protected String nombreFicha;
    protected int movimientoX;
    protected int movimientoY;

    public Ficha(int movimientoX, int movimientoY) {
        this.movimientoX = movimientoX;
        this.movimientoY = movimientoY;
    }
    
   // public abstract void moverFicha();
    
    
}
