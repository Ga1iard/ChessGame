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
    protected int posicionX;
    protected int posicionY;
    protected int posicion[][];

    public Ficha(int movimientoX, int movimientoY, int posicionX, int posicionY) {
        this.movimientoX = movimientoX;
        this.movimientoY = movimientoY;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.posicion = new int[posicionX][posicionY];
    }

    public abstract void moverFichaBlanca();
    public abstract void moverFichaNegra();

}
