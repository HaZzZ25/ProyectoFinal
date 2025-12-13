
package vista;
import poo.ReporteFinanciero;

/**
 *
 * @author achit
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    public PaginaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);//Centra la ventana

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panGestion = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btClientes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnReporteFinanciero = new javax.swing.JButton();
        lblIconF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bienvenido a VideojuegosFJH");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 400, 80));

        panGestion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventana Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panGestion.setOpaque(false);

        btnProductos.setBackground(new java.awt.Color(0, 0, 0));
        btnProductos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo-producto.png"))); // NOI18N
        btnProductos.setText("Gestion Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo-cliente.png"))); // NOI18N
        btnUsuarios.setText("Gestion Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btClientes.setBackground(new java.awt.Color(0, 0, 0));
        btClientes.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btClientes.setForeground(new java.awt.Color(255, 255, 255));
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btClientes.setText("Gestion Clientes");
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(0, 0, 0));
        btnVentas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        btnVentas.setText("Gestion Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnReporteFinanciero.setBackground(new java.awt.Color(0, 0, 0));
        btnReporteFinanciero.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnReporteFinanciero.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteFinanciero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte1.png"))); // NOI18N
        btnReporteFinanciero.setText("Reporte Diario");
        btnReporteFinanciero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteFinancieroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panGestionLayout = new javax.swing.GroupLayout(panGestion);
        panGestion.setLayout(panGestionLayout);
        panGestionLayout.setHorizontalGroup(
            panGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductos)
                    .addComponent(btClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(panGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
            .addGroup(panGestionLayout.createSequentialGroup()
                .addComponent(btnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panGestionLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnReporteFinanciero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panGestionLayout.setVerticalGroup(
            panGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductos)
                    .addComponent(btnUsuarios))
                .addGap(28, 28, 28)
                .addGroup(panGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClientes)
                    .addComponent(btnVentas))
                .addGap(28, 28, 28)
                .addComponent(btnReporteFinanciero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );

        getContentPane().add(panGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 560, 300));

        lblIconF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoCR.jpg"))); // NOI18N
        getContentPane().add(lblIconF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed

    GestionProductos productos = new GestionProductos();
    productos.setVisible(true); // Muestra la ventana de gestión de productos
    
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed

    GestionClientes clientes = new GestionClientes();
    clientes.setVisible(true); // Muestra la ventana de gestión de clientes
    }//GEN-LAST:event_btClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed

    GestionVentas ventas = new GestionVentas();
    ventas.setVisible(true); // Muestra la ventana de gestión de ventas
    
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

    GestionUsuarios usuarios = new GestionUsuarios();
    usuarios.setVisible(true); // Muestra la ventana de gestión de usuarios
    
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea salir?", "Confirmación de salida", 
        javax.swing.JOptionPane.YES_NO_OPTION, 
        javax.swing.JOptionPane.WARNING_MESSAGE
    );

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0); // Cierra la aplicación si selecciona "Sí"
    }
    // Si selecciona "No", no se hace nada y se regresa a la ventana actual
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReporteFinancieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteFinancieroActionPerformed

        poo.ReporteFinanciero reporte = new poo.ReporteFinanciero();
        reporte.mostrarTotalVentasDiarias();
        

    }//GEN-LAST:event_btnReporteFinancieroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReporteFinanciero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel lblIconF;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panGestion;
    // End of variables declaration//GEN-END:variables
}
