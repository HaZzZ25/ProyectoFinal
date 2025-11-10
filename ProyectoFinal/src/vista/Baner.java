package vista;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Baner extends javax.swing.JFrame {
    
    public Baner() {
        initComponents();
        
        setLocationRelativeTo(null);//Centra la ventana
        ProgressBarIniciado();//Llamada a cargar la barra de progreso
    }
    
private void ProgressBarIniciado(){
    Timer mTimer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pbCarga.setForeground(Color.RED);
            pbCarga.setValue(pbCarga.getValue() + 1);
            pbCarga.setStringPainted(true);

            pbCarga.setString("Loading..." + pbCarga.getValue() + "%");

            // Detiene el temporizador cuando se llega al 100%
            if (pbCarga.getValue() >= 100) {
                pbCarga.setForeground(Color.RED); // Cambia el color a rojo aquí
                ((Timer)e.getSource()).stop();

                // Cierra la ventana de carga y abre la segunda ventana
                cerrarVentanaCarga();
                abrirNuevaVentana();
            }
        }
    });

    mTimer.start();
}
    
    // Método para cerrar la ventana de carga
    private void cerrarVentanaCarga() {
    this.dispose(); // Cierra la ventana actual
}

// Método para abrir una nueva ventana
    private void abrirNuevaVentana() {
    // Aquí debes colocar el código para abrir la nueva ventana
    // Por ejemplo:
    Login ventana = new Login();
    ventana.setVisible(true);
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbCarga = new javax.swing.JProgressBar();
        lblImagen = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VideojuegosCR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pbCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 400, 30));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 56, -1, -1));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bienvenido a Sistema \"VideojuegosCR\"");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baner().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JProgressBar pbCarga;
    // End of variables declaration//GEN-END:variables
}
