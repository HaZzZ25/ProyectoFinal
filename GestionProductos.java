package vista;

import conexion.ConectarBD;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author achit
 */
public class GestionProductos extends javax.swing.JFrame {

    ConectarBD con = new ConectarBD();

    public GestionProductos() {
        initComponents();
        setLocationRelativeTo(null);//Centra la ventana
        mostrarVideojuegos(); // Mostrar videojuegos al iniciar
        mostrarConsolas(); // Mostrar consolas al iniciar

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panVideojuegos = new javax.swing.JPanel();
        lclStockV = new javax.swing.JLabel();
        lblPlataformaV = new javax.swing.JLabel();
        lblGeneroV = new javax.swing.JLabel();
        lblNombreV = new javax.swing.JLabel();
        lblPrecioV = new javax.swing.JLabel();
        txtNombreV = new javax.swing.JTextField();
        txtPlataformaV = new javax.swing.JTextField();
        txtPrecioV = new javax.swing.JTextField();
        txtGeneroV = new javax.swing.JTextField();
        txtStockV = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVideojuegos = new javax.swing.JTable();
        btnAgregarV = new javax.swing.JButton();
        btnModificarV = new javax.swing.JButton();
        btnEliminarV = new javax.swing.JButton();
        panConsola = new javax.swing.JPanel();
        lblNombreC = new javax.swing.JLabel();
        lblMarcaC = new javax.swing.JLabel();
        lblPrecioC = new javax.swing.JLabel();
        lblStockC = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtMarcaC = new javax.swing.JTextField();
        txtPrecioC = new javax.swing.JTextField();
        txtStockC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsola = new javax.swing.JTable();
        btnAgregarC = new javax.swing.JButton();
        btnModificarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        btnRegresarP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panVideojuegos.setBackground(new java.awt.Color(255, 255, 255));
        panVideojuegos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Videojuegos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panVideojuegos.setPreferredSize(new java.awt.Dimension(250, 250));

        lclStockV.setBackground(new java.awt.Color(255, 0, 0));
        lclStockV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lclStockV.setForeground(new java.awt.Color(0, 0, 0));
        lclStockV.setText("Stock");

        lblPlataformaV.setBackground(new java.awt.Color(255, 0, 0));
        lblPlataformaV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblPlataformaV.setForeground(new java.awt.Color(0, 0, 0));
        lblPlataformaV.setText("Plataforma");

        lblGeneroV.setBackground(new java.awt.Color(255, 0, 0));
        lblGeneroV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblGeneroV.setForeground(new java.awt.Color(0, 0, 0));
        lblGeneroV.setText("Genero");

        lblNombreV.setBackground(new java.awt.Color(255, 0, 0));
        lblNombreV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblNombreV.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreV.setText("Nombre");

        lblPrecioV.setBackground(new java.awt.Color(255, 0, 0));
        lblPrecioV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblPrecioV.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioV.setText("Precio");

        txtNombreV.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreV.setForeground(new java.awt.Color(0, 0, 0));

        txtPlataformaV.setBackground(new java.awt.Color(255, 255, 255));
        txtPlataformaV.setForeground(new java.awt.Color(0, 0, 0));

        txtPrecioV.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioV.setForeground(new java.awt.Color(0, 0, 0));

        txtGeneroV.setBackground(new java.awt.Color(255, 255, 255));
        txtGeneroV.setForeground(new java.awt.Color(0, 0, 0));

        txtStockV.setBackground(new java.awt.Color(255, 255, 255));
        txtStockV.setForeground(new java.awt.Color(0, 0, 0));

        jtVideojuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Genero", "Plataforma", "Precio", "Stock"
            }
        ));
        jtVideojuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtVideojuegosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtVideojuegos);

        btnAgregarV.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnAgregarV.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        btnAgregarV.setText("Agregar");
        btnAgregarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVActionPerformed(evt);
            }
        });

        btnModificarV.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnModificarV.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuraciones.png"))); // NOI18N
        btnModificarV.setText("Modificar");
        btnModificarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVActionPerformed(evt);
            }
        });

        btnEliminarV.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnEliminarV.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        btnEliminarV.setText("Eliminar");
        btnEliminarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVideojuegosLayout = new javax.swing.GroupLayout(panVideojuegos);
        panVideojuegos.setLayout(panVideojuegosLayout);
        panVideojuegosLayout.setHorizontalGroup(
            panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panVideojuegosLayout.createSequentialGroup()
                .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVideojuegosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGeneroV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlataformaV)
                            .addComponent(lblPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreV)
                            .addComponent(txtPrecioV)
                            .addComponent(txtPlataformaV)
                            .addComponent(txtGeneroV)))
                    .addGroup(panVideojuegosLayout.createSequentialGroup()
                        .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarV, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panVideojuegosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lclStockV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panVideojuegosLayout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addComponent(btnModificarV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtStockV))))
                .addContainerGap())
            .addGroup(panVideojuegosLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnEliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panVideojuegosLayout.setVerticalGroup(
            panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVideojuegosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreV)
                    .addComponent(txtNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeneroV)
                    .addComponent(txtGeneroV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlataformaV)
                    .addComponent(txtPlataformaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioV)
                    .addComponent(txtPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lclStockV)
                    .addComponent(txtStockV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panVideojuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarV)
                    .addComponent(btnModificarV))
                .addGap(18, 18, 18)
                .addComponent(btnEliminarV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panVideojuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        panConsola.setBackground(new java.awt.Color(255, 0, 0));
        panConsola.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consola", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panConsola.setPreferredSize(new java.awt.Dimension(250, 250));

        lblNombreC.setBackground(new java.awt.Color(255, 0, 0));
        lblNombreC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblNombreC.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreC.setText("Nombre");

        lblMarcaC.setBackground(new java.awt.Color(255, 0, 0));
        lblMarcaC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblMarcaC.setForeground(new java.awt.Color(0, 0, 0));
        lblMarcaC.setText("Marca");

        lblPrecioC.setBackground(new java.awt.Color(255, 0, 0));
        lblPrecioC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblPrecioC.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioC.setText("Precio");

        lblStockC.setBackground(new java.awt.Color(255, 0, 0));
        lblStockC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblStockC.setForeground(new java.awt.Color(0, 0, 0));
        lblStockC.setText("Stock");

        txtNombreC.setBackground(new java.awt.Color(255, 0, 0));
        txtNombreC.setForeground(new java.awt.Color(0, 0, 0));

        txtMarcaC.setBackground(new java.awt.Color(255, 0, 0));
        txtMarcaC.setForeground(new java.awt.Color(0, 0, 0));

        txtPrecioC.setBackground(new java.awt.Color(255, 0, 0));
        txtPrecioC.setForeground(new java.awt.Color(0, 0, 0));

        txtStockC.setBackground(new java.awt.Color(255, 0, 0));
        txtStockC.setForeground(new java.awt.Color(0, 0, 0));

        jtConsola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Marca", "Precio", "Stock"
            }
        ));
        jtConsola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtConsolaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtConsola);

        btnAgregarC.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnAgregarC.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        btnAgregarC.setText("Agregar");
        btnAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCActionPerformed(evt);
            }
        });

        btnModificarC.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnModificarC.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuraciones.png"))); // NOI18N
        btnModificarC.setText("Modificar");
        btnModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCActionPerformed(evt);
            }
        });

        btnEliminarC.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnEliminarC.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        btnEliminarC.setText("Eliminar");
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panConsolaLayout = new javax.swing.GroupLayout(panConsola);
        panConsola.setLayout(panConsolaLayout);
        panConsolaLayout.setHorizontalGroup(
            panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsolaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panConsolaLayout.createSequentialGroup()
                        .addComponent(lblStockC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtStockC))
                    .addGroup(panConsolaLayout.createSequentialGroup()
                        .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarcaC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarcaC)
                            .addComponent(txtPrecioC)
                            .addComponent(txtNombreC)))
                    .addGroup(panConsolaLayout.createSequentialGroup()
                        .addComponent(btnAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panConsolaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panConsolaLayout.setVerticalGroup(
            panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsolaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreC)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarcaC)
                    .addComponent(txtMarcaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioC)
                    .addComponent(txtPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStockC)
                    .addComponent(txtStockC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(panConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarC)
                    .addComponent(btnModificarC))
                .addGap(18, 18, 18)
                .addComponent(btnEliminarC)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panConsola, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 640));

        btnRegresarP.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresarP.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnRegresarP.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarP.setText("Regresar");
        btnRegresarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 343, 98, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo13.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVActionPerformed
        agregarVideojuego();
    }//GEN-LAST:event_btnAgregarVActionPerformed

    private void btnModificarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVActionPerformed
        modificarVideojuego();
    }//GEN-LAST:event_btnModificarVActionPerformed

    private void btnEliminarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVActionPerformed
        eliminarVideojuego();
    }//GEN-LAST:event_btnEliminarVActionPerformed

    private void btnAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCActionPerformed
        agregarConsola();
    }//GEN-LAST:event_btnAgregarCActionPerformed

    private void btnModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCActionPerformed
        modificarConsola();
    }//GEN-LAST:event_btnModificarCActionPerformed

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        eliminarConsola();
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnRegresarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPActionPerformed

        // Crear una instancia de la pantalla principal
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

        // Hacer visible la pantalla principal
        paginaPrincipal.setVisible(true);

        // Cerrar la ventana actual (GestionClientes)
        this.dispose();
    }//GEN-LAST:event_btnRegresarPActionPerformed

    private void jtVideojuegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVideojuegosMouseClicked
        int seleccion = jtVideojuegos.getSelectedRow();
        this.txtNombreV.setText(jtVideojuegos.getValueAt(seleccion, 0).toString());
        this.txtGeneroV.setText(jtVideojuegos.getValueAt(seleccion, 1).toString());
        this.txtPlataformaV.setText(jtVideojuegos.getValueAt(seleccion, 2).toString());
        this.txtPrecioV.setText(jtVideojuegos.getValueAt(seleccion, 3).toString());
        this.txtStockV.setText(jtVideojuegos.getValueAt(seleccion, 4).toString());
    }//GEN-LAST:event_jtVideojuegosMouseClicked

    private void jtConsolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtConsolaMouseClicked
        int seleccion = jtConsola.getSelectedRow();
        this.txtNombreC.setText(jtConsola.getValueAt(seleccion, 0).toString());
        this.txtMarcaC.setText(jtConsola.getValueAt(seleccion, 1).toString());
        this.txtPrecioC.setText(jtConsola.getValueAt(seleccion, 2).toString());
        this.txtStockC.setText(jtConsola.getValueAt(seleccion, 3).toString());
    }//GEN-LAST:event_jtConsolaMouseClicked

    private void agregarVideojuego() {
        try {
            con.conectarBDOracle();

            // Obtener el siguiente valor de la secuencia seq_videojuegos
            String obtenerIdVideojuego = "SELECT seq_videojuegos.nextval FROM dual";
            con.rs = con.stmt.executeQuery(obtenerIdVideojuego);
            con.rs.next();
            int idVideojuego = con.rs.getInt(1);

            String nombre = txtNombreV.getText();
            String genero = txtGeneroV.getText();
            String plataforma = txtPlataformaV.getText();
            double precio = Double.parseDouble(txtPrecioV.getText());
            int stock = Integer.parseInt(txtStockV.getText());

            // Validaciones (puedes agregar más)
            if (nombre.isEmpty() || genero.isEmpty() || plataforma.isEmpty()
                    || txtPrecioV.getText().isEmpty() || txtStockV.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            String insertarVideojuego = "INSERT INTO videojuegos (id_videojuego, nombre, genero, plataforma, precio, stock) VALUES ("
                    + idVideojuego + ", '" + nombre + "', '" + genero + "', '" + plataforma + "', " + precio + ", " + stock + ")";
            con.stmt.executeUpdate(insertarVideojuego);

            JOptionPane.showMessageDialog(this, "Videojuego agregado correctamente.");
            limpiarCamposVideojuegos();
            mostrarVideojuegos(); // Actualiza la tabla

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al agregar videojuego: " + e.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para precio y stock.");
        }
    }

    private void modificarVideojuego() {
        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Obtener la fila seleccionada de la tabla
            int filaSeleccionada = jtVideojuegos.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione un videojuego para modificar.");
                return;
            }

            // Obtener el nombre original del videojuego de la fila seleccionada
            String nombreOriginal = (String) jtVideojuegos.getValueAt(filaSeleccionada, 0);

            // Obtener los valores de los campos
            String nombre = txtNombreV.getText().trim();
            String genero = txtGeneroV.getText().trim();
            String plataforma = txtPlataformaV.getText().trim();
            String precioTexto = txtPrecioV.getText().trim();
            String stockTexto = txtStockV.getText().trim();

            // Validar que los campos no estén vacíos
            if (nombre.isEmpty() || genero.isEmpty() || plataforma.isEmpty()
                    || precioTexto.isEmpty() || stockTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            // Validar que los valores de precio y stock sean numéricos
            double precio;
            int stock;
            try {
                precio = Double.parseDouble(precioTexto);
                stock = Integer.parseInt(stockTexto);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para precio y stock.");
                return;
            }

            // Crear consulta preparada para actualizar el videojuego
            String modificarVideojuego = "UPDATE videojuegos "
                    + "SET nombre = ?, genero = ?, plataforma = ?, precio = ?, stock = ? "
                    + "WHERE nombre = ?";
            PreparedStatement pstmt = con.cn.prepareStatement(modificarVideojuego);
            pstmt.setString(1, nombre);
            pstmt.setString(2, genero);
            pstmt.setString(3, plataforma);
            pstmt.setDouble(4, precio);
            pstmt.setInt(5, stock);
            pstmt.setString(6, nombreOriginal);

            // Ejecutar la consulta
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Videojuego modificado correctamente.");
                limpiarCamposVideojuegos();
                mostrarVideojuegos(); // Actualiza la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el videojuego a modificar.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar videojuego: " + e.getMessage());
        }

    }

    private void eliminarVideojuego() {
        try {
            con.conectarBDOracle();

            // Obtener la fila seleccionada de la tabla
            int filaSeleccionada = jtVideojuegos.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione un videojuego para eliminar.");
                return;
            }

            // Obtener el nombre del videojuego de la fila seleccionada
            String nombre = (String) jtVideojuegos.getValueAt(filaSeleccionada, 0);

            // Mostrar mensaje de confirmación
            int opcion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el videojuego " + nombre + "?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                String eliminarVideojuego = "DELETE FROM videojuegos WHERE nombre = '" + nombre + "'";
                con.stmt.executeUpdate(eliminarVideojuego);

                JOptionPane.showMessageDialog(this, "Videojuego eliminado correctamente.");
                mostrarVideojuegos(); // Actualiza la tabla
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar videojuego: " + e.getMessage());
        }
    }

    private void agregarConsola() {
        try {
            con.conectarBDOracle();

            // Obtener el siguiente valor de la secuencia seq_consolas
            String obtenerIdConsola = "SELECT seq_consolas.nextval FROM dual";
            con.rs = con.stmt.executeQuery(obtenerIdConsola);
            con.rs.next();
            int idConsola = con.rs.getInt(1);

            String nombre = txtNombreC.getText();
            String marca = txtMarcaC.getText();
            double precio = Double.parseDouble(txtPrecioC.getText());
            int stock = Integer.parseInt(txtStockC.getText());

            // Validaciones (puedes agregar más)
            if (nombre.isEmpty() || marca.isEmpty()
                    || txtPrecioC.getText().isEmpty() || txtStockC.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            String insertarConsola = "INSERT INTO consolas (id_consola, nombre, marca, precio, stock) VALUES ("
                    + idConsola + ", '" + nombre + "', '" + marca + "', " + precio + ", " + stock + ")";
            con.stmt.executeUpdate(insertarConsola);

            JOptionPane.showMessageDialog(this, "Consola agregada correctamente.");
            limpiarCamposConsolas();
            mostrarConsolas(); // Actualiza la tabla

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al agregar consola: " + e.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para precio y stock.");
        }
    }

    private void modificarConsola() {
        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Obtener la fila seleccionada de la tabla
            int filaSeleccionada = jtConsola.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una consola para modificar.");
                return;
            }

            // Obtener el nombre original de la consola de la fila seleccionada
            String nombreOriginal = (String) jtConsola.getValueAt(filaSeleccionada, 0);

            // Obtener los valores de los campos
            String nombre = txtNombreC.getText().trim();
            String marca = txtMarcaC.getText().trim();
            String precioTexto = txtPrecioC.getText().trim();
            String stockTexto = txtStockC.getText().trim();

            // Validar que los campos no estén vacíos
            if (nombre.isEmpty() || marca.isEmpty() || precioTexto.isEmpty() || stockTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            // Validar que precio y stock sean numéricos
            double precio;
            int stock;
            try {
                precio = Double.parseDouble(precioTexto);
                stock = Integer.parseInt(stockTexto);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para precio y stock.");
                return;
            }

            // Crear consulta preparada para modificar la consola
            String modificarConsola = "UPDATE consolas SET nombre = ?, marca = ?, precio = ?, stock = ? WHERE nombre = ?";
            PreparedStatement pstmt = con.cn.prepareStatement(modificarConsola);
            pstmt.setString(1, nombre);
            pstmt.setString(2, marca);
            pstmt.setDouble(3, precio);
            pstmt.setInt(4, stock);
            pstmt.setString(5, nombreOriginal);

            // Ejecutar la consulta
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Consola modificada correctamente.");
                limpiarCamposConsolas();
                mostrarConsolas(); // Actualiza la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la consola a modificar.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar consola: " + e.getMessage());
        }

    }

    private void eliminarConsola() {
        try {
            con.conectarBDOracle();

            // Obtener la fila seleccionada de la tabla
            int filaSeleccionada = jtConsola.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una consola para eliminar.");
                return;
            }

            // Obtener el nombre de la consola de la fila seleccionada
            String nombre = (String) jtConsola.getValueAt(filaSeleccionada, 0);

            // Mostrar mensaje de confirmación
            int opcion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar la consola " + nombre + "?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                String eliminarConsola = "DELETE FROM consolas WHERE nombre = '" + nombre + "'";
                con.stmt.executeUpdate(eliminarConsola);

                JOptionPane.showMessageDialog(this, "Consola eliminada correctamente.");
                mostrarConsolas(); // Actualiza la tabla
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar consola: " + e.getMessage());
        }
    }

    private void mostrarVideojuegos() {
        try {
            con.conectarBDOracle();

            String consulta = "SELECT * FROM videojuegos";
            con.rs = con.stmt.executeQuery(consulta);

            // Obtener el modelo de la tabla jtVideojuegos
            DefaultTableModel modelo = (DefaultTableModel) jtVideojuegos.getModel();
            modelo.setRowCount(0); // Limpiar la tabla

            while (con.rs.next()) {
                Object[] fila = {
                    con.rs.getString("nombre"),
                    con.rs.getString("genero"),
                    con.rs.getString("plataforma"),
                    con.rs.getDouble("precio"),
                    con.rs.getInt("stock")
                };
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar videojuegos: " + e.getMessage());
        }
    }

    private void mostrarConsolas() {
        try {
            con.conectarBDOracle();

            String consulta = "SELECT * FROM consolas";
            con.rs = con.stmt.executeQuery(consulta);

            // Obtener el modelo de la tabla jtConsola
            DefaultTableModel modelo = (DefaultTableModel) jtConsola.getModel();
            modelo.setRowCount(0); // Limpiar la tabla

            while (con.rs.next()) {
                Object[] fila = {
                    con.rs.getString("nombre"),
                    con.rs.getString("marca"),
                    con.rs.getDouble("precio"),
                    con.rs.getInt("stock")
                };
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar consolas: " + e.getMessage());
        }
    }

    private void limpiarCamposVideojuegos() {
        txtNombreV.setText("");
        txtGeneroV.setText("");
        txtPlataformaV.setText("");
        txtPrecioV.setText("");
        txtStockV.setText("");
    }

    private void limpiarCamposConsolas() {
        txtNombreC.setText("");
        txtMarcaC.setText("");
        txtPrecioC.setText("");
        txtStockC.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarC;
    private javax.swing.JButton btnAgregarV;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnEliminarV;
    private javax.swing.JButton btnModificarC;
    private javax.swing.JButton btnModificarV;
    private javax.swing.JButton btnRegresarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtConsola;
    private javax.swing.JTable jtVideojuegos;
    private javax.swing.JLabel lblGeneroV;
    private javax.swing.JLabel lblMarcaC;
    private javax.swing.JLabel lblNombreC;
    private javax.swing.JLabel lblNombreV;
    private javax.swing.JLabel lblPlataformaV;
    private javax.swing.JLabel lblPrecioC;
    private javax.swing.JLabel lblPrecioV;
    private javax.swing.JLabel lblStockC;
    private javax.swing.JLabel lclStockV;
    private javax.swing.JPanel panConsola;
    private javax.swing.JPanel panVideojuegos;
    private javax.swing.JTextField txtGeneroV;
    private javax.swing.JTextField txtMarcaC;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreV;
    private javax.swing.JTextField txtPlataformaV;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioV;
    private javax.swing.JTextField txtStockC;
    private javax.swing.JTextField txtStockV;
    // End of variables declaration//GEN-END:variables
}
