/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.PnlTableroBotones;

/**
 *
 * @author Bidob
 */

/**
 * @author Bidob
 * hay un error pero la logica quedaria en esta seccion, masomenos planteada
 * no esta modificado nada mas solo esta seccion asi que ojo :v
 */


public class PruebaDeMovimiento {

    private String posicionAntigua;
    private String posicionNueva;
    private String posicionActual;
    private String tablero[][];

    public PruebaDeMovimiento() {
        iniciarTablero();
        tablero = new String[8][8];
        PnlTableroBotones c = new PnlTableroBotones();

    }

    public void iniciarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "";
            }
        }

        for (int i = 0; i < 8; i++) {
            tablero[1][i] = "B_peon";
            tablero[6][i] = "A_peon";
        }

        tablero[0][0] = "B_torre";
        tablero[0][1] = "B_caballo";
        tablero[0][2] = "B_alfil";
        tablero[0][3] = "B_reina";
        tablero[0][4] = "B_rey";
        tablero[0][5] = "B_alfil";
        tablero[0][6] = "B_caballo";
        tablero[0][7] = "B_torre";

        tablero[7][0] = "A_torre";
        tablero[7][1] = "A_caballo";
        tablero[7][2] = "A_alfil";
        tablero[7][3] = "A_reina";
        tablero[7][4] = "A_rey";
        tablero[7][5] = "A_alfil";
        tablero[7][6] = "A_caballo";
        tablero[7][7] = "A_torre";
    }

    public void añadirAcciones() {
        //PnlTableroBotones.btnH2.addActionListener(this);
        //PnlTablero.lblB8.addMouseListener((MouseListener) this);
    }

    public void actionPerformed(ActionEvent ae) {
        
            posicionActual = getBotonPosicionString(ae.getSource());

            
                posicionNueva = posicionActual;

                cambiarFichas(posicionAntigua, posicionNueva);
                posicionNueva = null;
                posicionAntigua = null;

            
        
    }

    private void cambiarFichas(String posAntigua, String posNueva) {
        cambiarEnString(posAntigua, posNueva);
        //cambiarEnPantalla(posAntigua, posNueva);
    }

    private String getBotonPosicionString(Object pnl) {
        if (pnl == PnlTableroBotones.btnH2) {
            return "17";
        }
        return null;
    }

    private boolean comprobarSiLaFichaEsBlanca(String posicion) {
        int x = Character.getNumericValue(posicion.charAt(1));
        int y = Character.getNumericValue(posicion.charAt(0));
        if (!tablero[y][x].equals("")) {
            return (tablero[y][x].charAt(0) == 'A') ? true : false;
        }
        return false;
    }

    private void cambiarEnString(String posAntigua, String posNueva) {
        int xA = Character.getNumericValue(posAntigua.charAt(1));
        int yA = Character.getNumericValue(posAntigua.charAt(0));

        int xN = Character.getNumericValue(posNueva.charAt(1));
        int yN = Character.getNumericValue(posNueva.charAt(0));

        tablero[yN][xN] = tablero[yA][xA];
        tablero[yA][xA] = "";
    }
/*
    private void cambiarEnPantalla(String posAntigua, String posNueva) {
        lbl(posNueva).setIcon(lbl(posAntigua).getIcon());
        lbl(posAntigua).setIcon(null);
    }*/

    private JButton btn(String posicion){
        if(posicion.equals("17")){
            return PnlTableroBotones.btnH2;
        }
        return null;
    }
    
}
