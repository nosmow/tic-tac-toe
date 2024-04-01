package com.ventanas;

import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author dainer
 */
public class VentanaMenu extends javax.swing.JFrame {

    private String jugador1;
    private String jugador2;
    /**
     * Creates new form menu
     */
    public VentanaMenu() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    
    
    public void setImageButton(JLabel lbl, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icon);
        this.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        panelTxt1 = new javax.swing.JPanel();
        txtNombre1 = new javax.swing.JTextField();
        lblNombre2 = new javax.swing.JLabel();
        panelTxt2 = new javax.swing.JPanel();
        txtNombre2 = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(470, 400));
        setMinimumSize(new java.awt.Dimension(470, 400));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        lblMinimizar.setFont(new java.awt.Font("Harrington", 0, 55)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 119, 0));
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText("•");
        lblMinimizar.setToolTipText("");
        lblMinimizar.setFocusable(false);
        lblMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setMaximumSize(new java.awt.Dimension(22, 35));
        lblMinimizar.setMinimumSize(new java.awt.Dimension(22, 35));
        lblMinimizar.setPreferredSize(new java.awt.Dimension(22, 35));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinimizarMousePressed(evt);
            }
        });
        jPanel2.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));

        lblCerrar.setFont(new java.awt.Font("Harrington", 0, 55)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("•");
        lblCerrar.setToolTipText("");
        lblCerrar.setFocusable(false);
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.setMaximumSize(new java.awt.Dimension(22, 35));
        lblCerrar.setMinimumSize(new java.awt.Dimension(22, 35));
        lblCerrar.setPreferredSize(new java.awt.Dimension(22, 35));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCerrarMousePressed(evt);
            }
        });
        jPanel2.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Tic Tac Toe");
        panel.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 470, -1));

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Jugador 1:");
        panel.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, -1));

        panelTxt1.setBackground(new java.awt.Color(102, 102, 102));

        txtNombre1.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre1.setBorder(null);
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelTxt1Layout = new javax.swing.GroupLayout(panelTxt1);
        panelTxt1.setLayout(panelTxt1Layout);
        panelTxt1Layout.setHorizontalGroup(
            panelTxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTxt1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTxt1Layout.setVerticalGroup(
            panelTxt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTxt1Layout.createSequentialGroup()
                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel.add(panelTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 177, 35));

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Jugador 2:");
        panel.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, -1));

        panelTxt2.setBackground(new java.awt.Color(102, 102, 102));

        txtNombre2.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre2.setBorder(null);
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelTxt2Layout = new javax.swing.GroupLayout(panelTxt2);
        panelTxt2.setLayout(panelTxt2Layout);
        panelTxt2Layout.setHorizontalGroup(
            panelTxt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTxt2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTxt2Layout.setVerticalGroup(
            panelTxt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTxt2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel.add(panelTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 177, 35));

        btnJugar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Jugar");
        btnJugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnJugar.setContentAreaFilled(false);
        btnJugar.setVisible(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        panel.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 109, 65));

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 109, 65));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String n1 = this.txtNombre1.getText().replaceAll(" ", "");
        String n2 = this.txtNombre2.getText().replaceAll(" ", "");
        
        if(!n1.equals("") && !n2.equals("")) {
            this.jugador1 = this.txtNombre1.getText();
            this.jugador2 = this.txtNombre2.getText();

            this.btnGuardar.setVisible(false);
            this.btnJugar.setVisible(true);
        }   
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        VentanaJuego juego = new VentanaJuego(this.jugador1, this.jugador2);
        juego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void lblMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMousePressed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMousePressed

    private void lblCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMousePressed

    private void txtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyTyped
        if(this.txtNombre1.getText().length() >= 14)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombre1KeyTyped

    private void txtNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyTyped
        if(this.txtNombre2.getText().length() >= 14)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombre2KeyTyped

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnJugar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelTxt1;
    private javax.swing.JPanel panelTxt2;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}
