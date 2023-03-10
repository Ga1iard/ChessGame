/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import modelo.Jugador;

/**
 *
 * @author pc
 */
public class PnlRegistroDeJugadores extends javax.swing.JPanel {

    Jugador jugadores[] = new Jugador[2];

    public PnlRegistroDeJugadores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgFichaPrimerJugador = new javax.swing.ButtonGroup();
        btgFichaSegundoJugador = new javax.swing.ButtonGroup();
        txtNombrePrimerJugador = new javax.swing.JTextField();
        rbtBlancasPrimerJugador = new javax.swing.JRadioButton();
        rbtNegrasPrimerJugador = new javax.swing.JRadioButton();
        lblNombrePrimerJugador = new javax.swing.JLabel();
        lblPrimerJugador = new javax.swing.JLabel();
        pnlFondoAzulDerecho = new javax.swing.JPanel();
        pnlFondoAzulSuperior = new javax.swing.JPanel();
        sprNombrePrimerJugador = new javax.swing.JSeparator();
        lblFichaPrimerJugador = new javax.swing.JLabel();
        rbtNegrasSegundoJugador = new javax.swing.JRadioButton();
        sprNombreSegundoJugador = new javax.swing.JSeparator();
        txtNombreSegundoJugador = new javax.swing.JTextField();
        lblFichaSegundoJugador = new javax.swing.JLabel();
        lblNombreSegundoJugador = new javax.swing.JLabel();
        lblSegundoJugador = new javax.swing.JLabel();
        rbtBlancasSegundoJugador = new javax.swing.JRadioButton();
        pnlIniciarJuego = new javax.swing.JPanel();
        lblIniciarJuego = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));

        txtNombrePrimerJugador.setForeground(new java.awt.Color(153, 153, 153));
        txtNombrePrimerJugador.setText("Ingrese su nombre");
        txtNombrePrimerJugador.setBorder(null);
        txtNombrePrimerJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombrePrimerJugadorMouseClicked(evt);
            }
        });
        txtNombrePrimerJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePrimerJugadorActionPerformed(evt);
            }
        });

        rbtBlancasPrimerJugador.setBackground(new java.awt.Color(255, 255, 255));
        btgFichaPrimerJugador.add(rbtBlancasPrimerJugador);
        rbtBlancasPrimerJugador.setText("Blancas");
        rbtBlancasPrimerJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtBlancasPrimerJugadorActionPerformed(evt);
            }
        });

        rbtNegrasPrimerJugador.setBackground(new java.awt.Color(255, 255, 255));
        btgFichaPrimerJugador.add(rbtNegrasPrimerJugador);
        rbtNegrasPrimerJugador.setText("Negras");
        rbtNegrasPrimerJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNegrasPrimerJugadorActionPerformed(evt);
            }
        });

        lblNombrePrimerJugador.setText("Nombre");

        lblPrimerJugador.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPrimerJugador.setText("PRIMER JUGADOR");

        pnlFondoAzulDerecho.setBackground(new java.awt.Color(0, 109, 200));

        javax.swing.GroupLayout pnlFondoAzulDerechoLayout = new javax.swing.GroupLayout(pnlFondoAzulDerecho);
        pnlFondoAzulDerecho.setLayout(pnlFondoAzulDerechoLayout);
        pnlFondoAzulDerechoLayout.setHorizontalGroup(
            pnlFondoAzulDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        pnlFondoAzulDerechoLayout.setVerticalGroup(
            pnlFondoAzulDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        pnlFondoAzulSuperior.setBackground(new java.awt.Color(0, 109, 200));

        javax.swing.GroupLayout pnlFondoAzulSuperiorLayout = new javax.swing.GroupLayout(pnlFondoAzulSuperior);
        pnlFondoAzulSuperior.setLayout(pnlFondoAzulSuperiorLayout);
        pnlFondoAzulSuperiorLayout.setHorizontalGroup(
            pnlFondoAzulSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        pnlFondoAzulSuperiorLayout.setVerticalGroup(
            pnlFondoAzulSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        lblFichaPrimerJugador.setText("Ficha");

        rbtNegrasSegundoJugador.setBackground(new java.awt.Color(255, 255, 255));
        btgFichaSegundoJugador.add(rbtNegrasSegundoJugador);
        rbtNegrasSegundoJugador.setText("Negras");
        rbtNegrasSegundoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNegrasSegundoJugadorActionPerformed(evt);
            }
        });

        txtNombreSegundoJugador.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreSegundoJugador.setText("Ingrese su nombre");
        txtNombreSegundoJugador.setBorder(null);
        txtNombreSegundoJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreSegundoJugadorMouseClicked(evt);
            }
        });
        txtNombreSegundoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSegundoJugadorActionPerformed(evt);
            }
        });

        lblFichaSegundoJugador.setText("Ficha");

        lblNombreSegundoJugador.setText("Nombre");

        lblSegundoJugador.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSegundoJugador.setText("SEGUNDO JUGADOR");

        rbtBlancasSegundoJugador.setBackground(new java.awt.Color(255, 255, 255));
        btgFichaSegundoJugador.add(rbtBlancasSegundoJugador);
        rbtBlancasSegundoJugador.setText("Blancas");
        rbtBlancasSegundoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtBlancasSegundoJugadorActionPerformed(evt);
            }
        });

        pnlIniciarJuego.setBackground(new java.awt.Color(0, 42, 133));
        pnlIniciarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlIniciarJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlIniciarJuegoMouseClicked(evt);
            }
        });

        lblIniciarJuego.setBackground(new java.awt.Color(255, 255, 255));
        lblIniciarJuego.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIniciarJuego.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciarJuego.setText("INICIAR JUEGO");

        javax.swing.GroupLayout pnlIniciarJuegoLayout = new javax.swing.GroupLayout(pnlIniciarJuego);
        pnlIniciarJuego.setLayout(pnlIniciarJuegoLayout);
        pnlIniciarJuegoLayout.setHorizontalGroup(
            pnlIniciarJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIniciarJuegoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblIniciarJuego)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlIniciarJuegoLayout.setVerticalGroup(
            pnlIniciarJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIniciarJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIniciarJuego)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoAzulSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrimerJugador)
                            .addComponent(lblNombrePrimerJugador)
                            .addComponent(txtNombrePrimerJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sprNombrePrimerJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFichaPrimerJugador)
                            .addComponent(lblSegundoJugador)
                            .addComponent(lblNombreSegundoJugador)
                            .addComponent(txtNombreSegundoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sprNombreSegundoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFichaSegundoJugador)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(rbtNegrasSegundoJugador))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(rbtBlancasPrimerJugador)
                                .addGap(30, 30, 30)
                                .addComponent(rbtNegrasPrimerJugador))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtBlancasSegundoJugador)
                            .addComponent(pnlIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(pnlFondoAzulDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(pnlFondoAzulSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPrimerJugador)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombrePrimerJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombrePrimerJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sprNombrePrimerJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFichaPrimerJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtNegrasPrimerJugador)
                            .addComponent(rbtBlancasPrimerJugador))
                        .addGap(27, 27, 27)
                        .addComponent(lblSegundoJugador)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreSegundoJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreSegundoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sprNombreSegundoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFichaSegundoJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtNegrasSegundoJugador)
                            .addComponent(rbtBlancasSegundoJugador))
                        .addGap(18, 18, 18)
                        .addComponent(pnlIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlFondoAzulDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePrimerJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePrimerJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePrimerJugadorActionPerformed

    private void txtNombreSegundoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSegundoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSegundoJugadorActionPerformed

    private void pnlIniciarJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIniciarJuegoMouseClicked
        // TODO add your handling code here:
        String nombrePrimerJugador = txtNombrePrimerJugador.getText();
        String colorFichaPrimerJugador = "";
        int puntuacionPrimerJugador = 0;

        String nombreSegundoJugador = txtNombreSegundoJugador.getText();
        String colorFichaSegundoJugador = "";
        int puntuacionSegundoJugador = 0;

        jugadores[0] = new Jugador(nombrePrimerJugador, colorFichaPrimerJugador);
        jugadores[1] = new Jugador(nombreSegundoJugador, colorFichaSegundoJugador);

    }//GEN-LAST:event_pnlIniciarJuegoMouseClicked

    private void txtNombrePrimerJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombrePrimerJugadorMouseClicked
        // TODO add your handling code here:
        txtNombrePrimerJugador.setText("");
        txtNombrePrimerJugador.setForeground(Color.black);
    }//GEN-LAST:event_txtNombrePrimerJugadorMouseClicked

    private void txtNombreSegundoJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreSegundoJugadorMouseClicked
        // TODO add your handling code here:
        txtNombreSegundoJugador.setText("");
        txtNombreSegundoJugador.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreSegundoJugadorMouseClicked

    private void rbtBlancasPrimerJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtBlancasPrimerJugadorActionPerformed
        rbtNegrasSegundoJugador.setSelected(true);
    }//GEN-LAST:event_rbtBlancasPrimerJugadorActionPerformed

    private void rbtNegrasPrimerJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNegrasPrimerJugadorActionPerformed
        rbtBlancasSegundoJugador.setSelected(true);
    }//GEN-LAST:event_rbtNegrasPrimerJugadorActionPerformed

    private void rbtBlancasSegundoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtBlancasSegundoJugadorActionPerformed
        // TODO add your handling code here:
        rbtNegrasPrimerJugador.setSelected(true);
    }//GEN-LAST:event_rbtBlancasSegundoJugadorActionPerformed

    private void rbtNegrasSegundoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNegrasSegundoJugadorActionPerformed
        rbtBlancasPrimerJugador.setSelected(true);
    }//GEN-LAST:event_rbtNegrasSegundoJugadorActionPerformed

    public void asignarColorAJugadorUno(){
        
    }
    
    public void asignarColorAJugadorDos(){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgFichaPrimerJugador;
    private javax.swing.ButtonGroup btgFichaSegundoJugador;
    private javax.swing.JLabel lblFichaPrimerJugador;
    private javax.swing.JLabel lblFichaSegundoJugador;
    private javax.swing.JLabel lblIniciarJuego;
    private javax.swing.JLabel lblNombrePrimerJugador;
    private javax.swing.JLabel lblNombreSegundoJugador;
    private javax.swing.JLabel lblPrimerJugador;
    private javax.swing.JLabel lblSegundoJugador;
    private javax.swing.JPanel pnlFondoAzulDerecho;
    private javax.swing.JPanel pnlFondoAzulSuperior;
    private javax.swing.JPanel pnlIniciarJuego;
    private javax.swing.JRadioButton rbtBlancasPrimerJugador;
    private javax.swing.JRadioButton rbtBlancasSegundoJugador;
    private javax.swing.JRadioButton rbtNegrasPrimerJugador;
    private javax.swing.JRadioButton rbtNegrasSegundoJugador;
    private javax.swing.JSeparator sprNombrePrimerJugador;
    private javax.swing.JSeparator sprNombreSegundoJugador;
    private javax.swing.JTextField txtNombrePrimerJugador;
    private javax.swing.JTextField txtNombreSegundoJugador;
    // End of variables declaration//GEN-END:variables
}
