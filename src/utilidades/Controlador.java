package utilidades;

import vista.PnlTableroBotones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import vista.PnlTablero;

public class Controlador implements ActionListener {
    
    public static boolean enrroqueReyA = true;
    public static boolean enrroqueTorreIzquierdaA = true;
    public static boolean enrroqueTorreDerechaA = true;
    public static boolean enrroqueReyB = true;
    public static boolean enrroqueTorreIzquierdaB = true;
    public static boolean enrroqueTorreDerechaB = true;

    public static String[][] tablero = new String[8][8];
    private char turnoJugador = 'A';
    private String posicionAntigua = null;
    private String posicionNueva = null;
    private String posicionActual;
    public static String fichaElegida;
    public static ImageIcon imagenElegida;
    //Movimientos movimientos;
    //Bot bot = new Bot();

    public Controlador() {
        iniciarTablero();
        PnlTableroBotones vista = new PnlTableroBotones();
        vista.setVisible(true);
        añadirActionEvents();
        //movimientos = new Movimientos();
    }

    private void iniciarTablero() {
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

    private void añadirActionEvents() {
        PnlTableroBotones.btnA1.addActionListener(this);
        PnlTableroBotones.btnB1.addActionListener(this);
        PnlTableroBotones.btnC1.addActionListener(this);
        PnlTableroBotones.btnD1.addActionListener(this);
        PnlTableroBotones.btnE1.addActionListener(this);
        PnlTableroBotones.btnF1.addActionListener(this);
        PnlTableroBotones.btnG1.addActionListener(this);
        PnlTableroBotones.btnH1.addActionListener(this);

        PnlTableroBotones.btnA2.addActionListener(this);
        PnlTableroBotones.btnB2.addActionListener(this);
        PnlTableroBotones.btnC2.addActionListener(this);
        PnlTableroBotones.btnD2.addActionListener(this);
        PnlTableroBotones.btnE2.addActionListener(this);
        PnlTableroBotones.btnF2.addActionListener(this);
        PnlTableroBotones.btnG2.addActionListener(this);
        PnlTableroBotones.btnH2.addActionListener(this);

        PnlTableroBotones.btnA3.addActionListener(this);
        PnlTableroBotones.btnB3.addActionListener(this);
        PnlTableroBotones.btnC3.addActionListener(this);
        PnlTableroBotones.btnD3.addActionListener(this);
        PnlTableroBotones.btnE3.addActionListener(this);
        PnlTableroBotones.btnF3.addActionListener(this);
        PnlTableroBotones.btnG3.addActionListener(this);
        PnlTableroBotones.btnH3.addActionListener(this);

        PnlTableroBotones.btnA4.addActionListener(this);
        PnlTableroBotones.btnB4.addActionListener(this);
        PnlTableroBotones.btnC4.addActionListener(this);
        PnlTableroBotones.btnD4.addActionListener(this);
        PnlTableroBotones.btnE4.addActionListener(this);
        PnlTableroBotones.btnF4.addActionListener(this);
        PnlTableroBotones.btnG4.addActionListener(this);
        PnlTableroBotones.btnH4.addActionListener(this);

        PnlTableroBotones.btnA5.addActionListener(this);
        PnlTableroBotones.btnB5.addActionListener(this);
        PnlTableroBotones.btnC5.addActionListener(this);
        PnlTableroBotones.btnD5.addActionListener(this);
        PnlTableroBotones.btnE5.addActionListener(this);
        PnlTableroBotones.btnF5.addActionListener(this);
        PnlTableroBotones.btnG5.addActionListener(this);
        PnlTableroBotones.btnH5.addActionListener(this);

        PnlTableroBotones.btnA6.addActionListener(this);
        PnlTableroBotones.btnB6.addActionListener(this);
        PnlTableroBotones.btnC6.addActionListener(this);
        PnlTableroBotones.btnD6.addActionListener(this);
        PnlTableroBotones.btnE6.addActionListener(this);
        PnlTableroBotones.btnF6.addActionListener(this);
        PnlTableroBotones.btnG6.addActionListener(this);
        PnlTableroBotones.btnH6.addActionListener(this);

        PnlTableroBotones.btnA7.addActionListener(this);
        PnlTableroBotones.btnB7.addActionListener(this);
        PnlTableroBotones.btnC7.addActionListener(this);
        PnlTableroBotones.btnD7.addActionListener(this);
        PnlTableroBotones.btnE7.addActionListener(this);
        PnlTableroBotones.btnF7.addActionListener(this);
        PnlTableroBotones.btnG7.addActionListener(this);
        PnlTableroBotones.btnH7.addActionListener(this);

        PnlTableroBotones.btnA8.addActionListener(this);
        PnlTableroBotones.btnB8.addActionListener(this);
        PnlTableroBotones.btnC8.addActionListener(this);
        PnlTableroBotones.btnD8.addActionListener(this);
        PnlTableroBotones.btnE8.addActionListener(this);
        PnlTableroBotones.btnF8.addActionListener(this);
        PnlTableroBotones.btnG8.addActionListener(this);
        PnlTableroBotones.btnH8.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (turnoJugador == 'A') {
            posicionActual = getBotonPosicionString(ae.getSource());

            if (comprobarSiLaFichaEsBlanca(posicionActual)) {
                posicionAntigua = posicionActual;
            } else if (posicionAntigua != null) {
                posicionNueva = posicionActual;
                if (movimientos.esPosibleEsteMovimiento(tablero, posicionAntigua, posicionNueva)){
                    cambiarFichas(posicionAntigua, posicionNueva);
                    posicionNueva = null;
                    posicionAntigua = null;
                    turnoMaquina();
                    comprobarJaqueMateHaciaBlancas();
                }
            }
        }
    }
    
    private void comprobarJaqueMateHaciaBlancas(){
        boolean jaqueMate = true;
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                String posicion = ""+i+""+j;
                if(comprobarSiLaFichaEsBlanca(posicion)){
                    String[] movimientosF = movimientos.movimientosAmodificados(tablero, posicion);
                    if(!movimientosF[0].equals("")){
                        jaqueMate = false;
                        break;
                    }
                }
            }
        }
        
        if(jaqueMate == true){
            MateHaciaBlancas ventana = new MateHaciaBlancas(null, true);
            ventana.setVisible(true);
        }
        
    }
    
    private void turnoMaquina(){
            String[] movimientos = bot.movimientoBot(tablero);
            cambiarFichas(movimientos[0], movimientos[1]);
    }
    
    
    private void cambiarFichas(String posAntigua, String posNueva) {
        cambiarEnString(posAntigua, posNueva);
        cambiarEnPantalla(posAntigua, posNueva);
        comprobarPeonEnUltimaFila();
        comprobarEnrroque(posAntigua, posNueva);
    }

    private void cambiarEnString(String posAntigua, String posNueva) {
        int xA = Character.getNumericValue(posAntigua.charAt(1));
        int yA = Character.getNumericValue(posAntigua.charAt(0));

        int xN = Character.getNumericValue(posNueva.charAt(1));
        int yN = Character.getNumericValue(posNueva.charAt(0));
               
        tablero[yN][xN] = tablero[yA][xA];
        tablero[yA][xA] = "";
    }

    private void cambiarEnPantalla(String posAntigua, String posNueva) {
        boton(posNueva).setIcon(boton(posAntigua).getIcon());
        boton(posAntigua).setIcon(null);
    }

    private void comprobarPeonEnUltimaFila() {
        for (int i = 0; i < 8; i++) {
            if (tablero[0][i].equals("A_peon")) {
                //Se mostrara la tabla de eleccion de ficha
                eleccionDePeon();
                tablero[0][i] = fichaElegida;
                String posicion = "0" + i;
                boton(posicion).setIcon(imagenElegida);
            }

            if (tablero[7][i].equals("B_peon")) {
                tablero[7][i] = "B_reina";
                String posicion = "7" + i;
                boton(posicion).setIcon(new ImageIcon(getClass().getResource("/Imagenes/ReinaNegra.png")));
            }
        }
    }

    private void eleccionDePeon() {
        VentanaEleccionFicha ventanaElec = new VentanaEleccionFicha(null, true);
        ventanaElec.setVisible(true);
    }

    private void comprobarEnrroque(String posAntigua, String posNueva) {
        int xN = Character.getNumericValue(posNueva.charAt(1));
        int yN = Character.getNumericValue(posNueva.charAt(0));

        int xA = Character.getNumericValue(posAntigua.charAt(1));
        int yA = Character.getNumericValue(posAntigua.charAt(0));

        if (tablero[yN][xN].equals("A_rey") || tablero[yN][xN].equals("B_rey")) {
            if (xA + 2 == xN) {
                //Derecha
                tablero[yN][xN - 1] = tablero[yN][7];
                tablero[yN][xN + 1] = "";

                String posicionTorreAntigua = "" + yN + 7;
                String posicionTorreNueva = "" + yN + (xN - 1);

                boton(posicionTorreNueva).setIcon(boton(posicionTorreAntigua).getIcon());
                boton(posicionTorreAntigua).setIcon(null);
            } else if (xA - 2 == xN) {
                //Izquierda
                tablero[yN][xA - 1] = tablero[yN][0];
                tablero[yN][0] = "";

                String posicionTorreAntigua = "" + yN + 0;
                String posicionTorreNueva = "" + yN + (xA - 1);

                boton(posicionTorreNueva).setIcon(boton(posicionTorreAntigua).getIcon());
                boton(posicionTorreAntigua).setIcon(null);
            }
        }
    }

    private JButton boton(String posicion) {
        if (posicion.equals("00")) {
            return PnlTableroBotones.c00;
        } else if (posicion.equals("01")) {
            return PnlTableroBotones.c01;
        } else if (posicion.equals("02")) {
            return PnlTableroBotones.c02;
        } else if (posicion.equals("03")) {
            return PnlTableroBotones.c03;
        } else if (posicion.equals("04")) {
            return PnlTableroBotones.c04;
        } else if (posicion.equals("05")) {
            return PnlTableroBotones.c05;
        } else if (posicion.equals("06")) {
            return PnlTableroBotones.c06;
        } else if (posicion.equals("07")) {
            return PnlTableroBotones.c07;
        } else if (posicion.equals("10")) {
            return PnlTableroBotones.c10;
        } else if (posicion.equals("11")) {
            return PnlTableroBotones.c11;
        } else if (posicion.equals("12")) {
            return PnlTableroBotones.c12;
        } else if (posicion.equals("13")) {
            return PnlTableroBotones.c13;
        } else if (posicion.equals("14")) {
            return PnlTableroBotones.c14;
        } else if (posicion.equals("15")) {
            return PnlTableroBotones.c15;
        } else if (posicion.equals("16")) {
            return PnlTableroBotones.c16;
        } else if (posicion.equals("17")) {
            return PnlTableroBotones.c17;
        } else if (posicion.equals("20")) {
            return PnlTableroBotones.c20;
        } else if (posicion.equals("21")) {
            return PnlTableroBotones.c21;
        } else if (posicion.equals("22")) {
            return PnlTableroBotones.c22;
        } else if (posicion.equals("23")) {
            return PnlTableroBotones.c23;
        } else if (posicion.equals("24")) {
            return PnlTableroBotones.c24;
        } else if (posicion.equals("25")) {
            return PnlTableroBotones.c25;
        } else if (posicion.equals("26")) {
            return PnlTableroBotones.c26;
        } else if (posicion.equals("27")) {
            return PnlTableroBotones.c27;
        } else if (posicion.equals("30")) {
            return PnlTableroBotones.btnA4;
        } else if (posicion.equals("31")) {
            return PnlTableroBotones.btnB4;
        } else if (posicion.equals("32")) {
            return PnlTableroBotones.btnC4;
        } else if (posicion.equals("33")) {
            return PnlTableroBotones.btnD4;
        } else if (posicion.equals("34")) {
            return PnlTableroBotones.c34;
        } else if (posicion.equals("35")) {
            return PnlTableroBotones.c35;
        } else if (posicion.equals("36")) {
            return PnlTableroBotones.c36;
        } else if (posicion.equals("37")) {
            return PnlTableroBotones.c37;
        } else if (posicion.equals("40")) {
            return PnlTableroBotones.c40;
        } else if (posicion.equals("41")) {
            return PnlTableroBotones.c41;
        } else if (posicion.equals("42")) {
            return PnlTableroBotones.c42;
        } else if (posicion.equals("43")) {
            return PnlTableroBotones.c43;
        } else if (posicion.equals("44")) {
            return PnlTableroBotones.c44;
        } else if (posicion.equals("45")) {
            return PnlTableroBotones.c45;
        } else if (posicion.equals("46")) {
            return PnlTableroBotones.c46;
        } else if (posicion.equals("47")) {
            return PnlTableroBotones.c47;
        } else if (posicion.equals("50")) {
            return PnlTableroBotones.c50;
        } else if (posicion.equals("51")) {
            return PnlTableroBotones.c51;
        } else if (posicion.equals("52")) {
            return PnlTableroBotones.c52;
        } else if (posicion.equals("53")) {
            return PnlTableroBotones.c53;
        } else if (posicion.equals("54")) {
            return PnlTableroBotones.c54;
        } else if (posicion.equals("55")) {
            return PnlTableroBotones.c55;
        } else if (posicion.equals("56")) {
            return PnlTableroBotones.c56;
        } else if (posicion.equals("57")) {
            return PnlTableroBotones.c57;
        } else if (posicion.equals("60")) {
            return PnlTableroBotones.c60;
        } else if (posicion.equals("61")) {
            return PnlTableroBotones.c61;
        } else if (posicion.equals("62")) {
            return PnlTableroBotones.c62;
        } else if (posicion.equals("63")) {
            return PnlTableroBotones.c63;
        } else if (posicion.equals("64")) {
            return PnlTableroBotones.c64;
        } else if (posicion.equals("65")) {
            return PnlTableroBotones.c65;
        } else if (posicion.equals("66")) {
            return PnlTableroBotones.c66;
        } else if (posicion.equals("67")) {
            return PnlTableroBotones.c67;
        } else if (posicion.equals("70")) {
            return PnlTableroBotones.c70;
        } else if (posicion.equals("71")) {
            return PnlTableroBotones.c71;
        } else if (posicion.equals("72")) {
            return PnlTableroBotones.c72;
        } else if (posicion.equals("73")) {
            return PnlTableroBotones.c73;
        } else if (posicion.equals("74")) {
            return PnlTableroBotones.c74;
        } else if (posicion.equals("75")) {
            return PnlTableroBotones.c75;
        } else if (posicion.equals("76")) {
            return PnlTableroBotones.c76;
        } else if (posicion.equals("77")) {
            return PnlTableroBotones.c77;
        }
        return null;
    }

    private String getBotonPosicionString(Object boton) {
        if (boton == PnlTableroBotones.c00) {
            return "00";
        } else if (boton == PnlTableroBotones.c01) {
            return "01";
        } else if (boton == PnlTableroBotones.c02) {
            return "02";
        } else if (boton == PnlTableroBotones.c03) {
            return "03";
        } else if (boton == PnlTableroBotones.c04) {
            return "04";
        } else if (boton == PnlTableroBotones.c05) {
            return "05";
        } else if (boton == PnlTableroBotones.c06) {
            return "06";
        } else if (boton == PnlTableroBotones.c07) {
            return "07";
        } else if (boton == PnlTableroBotones.c10) {
            return "10";
        } else if (boton == PnlTableroBotones.c11) {
            return "11";
        } else if (boton == PnlTableroBotones.c12) {
            return "12";
        } else if (boton == PnlTableroBotones.c13) {
            return "13";
        } else if (boton == PnlTableroBotones.c14) {
            return "14";
        } else if (boton == PnlTableroBotones.c15) {
            return "15";
        } else if (boton == PnlTableroBotones.c16) {
            return "16";
        } else if (boton == PnlTableroBotones.c17) {
            return "17";
        } else if (boton == PnlTableroBotones.c20) {
            return "20";
        } else if (boton == PnlTableroBotones.c21) {
            return "21";
        } else if (boton == PnlTableroBotones.c22) {
            return "22";
        } else if (boton == PnlTableroBotones.c23) {
            return "23";
        } else if (boton == PnlTableroBotones.c24) {
            return "24";
        } else if (boton == PnlTableroBotones.c25) {
            return "25";
        } else if (boton == PnlTableroBotones.c26) {
            return "26";
        } else if (boton == PnlTableroBotones.c27) {
            return "27";
        } else if (boton == PnlTableroBotones.btnA4) {
            return "30";
        } else if (boton == PnlTableroBotones.btnB4) {
            return "31";
        } else if (boton == PnlTableroBotones.btnC4) {
            return "32";
        } else if (boton == PnlTableroBotones.btnD4) {
            return "33";
        } else if (boton == PnlTableroBotones.c34) {
            return "34";
        } else if (boton == PnlTableroBotones.c35) {
            return "35";
        } else if (boton == PnlTableroBotones.c36) {
            return "36";
        } else if (boton == PnlTableroBotones.c37) {
            return "37";
        } else if (boton == PnlTableroBotones.c40) {
            return "40";
        } else if (boton == PnlTableroBotones.c41) {
            return "41";
        } else if (boton == PnlTableroBotones.c42) {
            return "42";
        } else if (boton == PnlTableroBotones.c43) {
            return "43";
        } else if (boton == PnlTableroBotones.c44) {
            return "44";
        } else if (boton == PnlTableroBotones.c45) {
            return "45";
        } else if (boton == PnlTableroBotones.c46) {
            return "46";
        } else if (boton == PnlTableroBotones.c47) {
            return "47";
        } else if (boton == PnlTableroBotones.c50) {
            return "50";
        } else if (boton == PnlTableroBotones.c51) {
            return "51";
        } else if (boton == PnlTableroBotones.c52) {
            return "52";
        } else if (boton == PnlTableroBotones.c53) {
            return "53";
        } else if (boton == PnlTableroBotones.c54) {
            return "54";
        } else if (boton == PnlTableroBotones.c55) {
            return "55";
        } else if (boton == PnlTableroBotones.c56) {
            return "56";
        } else if (boton == PnlTableroBotones.c57) {
            return "57";
        } else if (boton == PnlTableroBotones.c60) {
            return "60";
        } else if (boton == PnlTableroBotones.c61) {
            return "61";
        } else if (boton == PnlTableroBotones.c62) {
            return "62";
        } else if (boton == PnlTableroBotones.c63) {
            return "63";
        } else if (boton == PnlTableroBotones.c64) {
            return "64";
        } else if (boton == PnlTableroBotones.c65) {
            return "65";
        } else if (boton == PnlTableroBotones.c66) {
            return "66";
        } else if (boton == PnlTableroBotones.c67) {
            return "67";
        } else if (boton == PnlTableroBotones.c70) {
            return "70";
        } else if (boton == PnlTableroBotones.c71) {
            return "71";
        } else if (boton == PnlTableroBotones.c72) {
            return "72";
        } else if (boton == PnlTableroBotones.c73) {
            return "73";
        } else if (boton == PnlTableroBotones.c74) {
            return "74";
        } else if (boton == PnlTableroBotones.c75) {
            return "75";
        } else if (boton == PnlTableroBotones.c76) {
            return "76";
        } else if (boton == PnlTableroBotones.c77) {
            return "77";
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

}
