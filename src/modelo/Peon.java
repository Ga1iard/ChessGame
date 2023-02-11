/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pc
 */
public class Peon extends Ficha {

    public Peon(int movimientoX, int movimientoY, int posicionX, int posicionY) {
        super(movimientoX, movimientoY, posicionX, posicionY);

    }

    @Override
    public void moverFichaBlanca() {

        if (this.posicionY == 1) {
            this.movimientoY = 2;
        } else {
            this.movimientoY = 1;
        }

        this.posicionY += this.movimientoY;

    }

    @Override
    public void moverFichaNegra() {

        if (this.posicionY == 6) {
            this.movimientoY = 2;
        } else {
            this.movimientoY = 1;
        }

        this.posicionY -= this.movimientoY;

    }

}
