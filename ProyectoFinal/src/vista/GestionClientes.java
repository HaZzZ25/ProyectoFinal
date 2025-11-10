package vista;

import conexion.ConectarBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author achit
 */
public class GestionClientes extends javax.swing.JFrame {

    public GestionClientes() {
        initComponents();
        setLocationRelativeTo(null);//Centra la ventana
         mostrarClientes(); // Mostrar clientes al iniciar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAgregar = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JTextField();
        txtDirecion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnCliente = new javax.swing.JButton();
        panModificar = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtModificar = new javax.swing.JTextField();
        btnBuscarM = new javax.swing.JButton();
        lblNombreM = new javax.swing.JLabel();
        lblDireccionM = new javax.swing.JLabel();
        lblTelefonoM = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JTextField();
        txtDireccionM = new javax.swing.JTextField();
        txtTelefonoM = new javax.swing.JTextField();
        btnGuardarM = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtBuscarM = new javax.swing.JTable();
        panBuscarC = new javax.swing.JPanel();
        lblNombreB = new javax.swing.JLabel();
        txtNombreB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuscar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        panEliminar = new javax.swing.JPanel();
        txtIDE = new javax.swing.JTextField();
        lbIIDE = new javax.swing.JLabel();
        btnEliminarC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtEliminarC = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panAgregar.setBackground(new java.awt.Color(255, 255, 255));
        panAgregar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panAgregar.setPreferredSize(new java.awt.Dimension(390, 380));

        lblDireccion.setBackground(new java.awt.Color(255, 255, 255));
        lblDireccion.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Direccion");

        lblNombre3.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre3.setText("Nombre");

        lblTelefono.setBackground(new java.awt.Color(255, 255, 255));
        lblTelefono.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Telefono");

        txtNombre3.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre3.setForeground(new java.awt.Color(0, 0, 0));

        txtDirecion.setBackground(new java.awt.Color(255, 255, 255));
        txtDirecion.setForeground(new java.awt.Color(0, 0, 0));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));

        btnCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnCliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btnCliente.setText("Agregar Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAgregarLayout = new javax.swing.GroupLayout(panAgregar);
        panAgregar.setLayout(panAgregarLayout);
        panAgregarLayout.setHorizontalGroup(
            panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgregarLayout.createSequentialGroup()
                .addGroup(panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAgregarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDirecion)
                            .addComponent(txtNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtTelefono)))
                    .addGroup(panAgregarLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        panAgregarLayout.setVerticalGroup(
            panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgregarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre3)
                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnCliente)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(panAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panModificar.setBackground(new java.awt.Color(0, 0, 153));
        panModificar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panModificar.setPreferredSize(new java.awt.Dimension(390, 380));

        lblID.setBackground(new java.awt.Color(0, 0, 153));
        lblID.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("Selecciona el ID");

        txtModificar.setBackground(new java.awt.Color(0, 0, 153));
        txtModificar.setForeground(new java.awt.Color(255, 255, 255));

        btnBuscarM.setBackground(new java.awt.Color(0, 0, 153));
        btnBuscarM.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBuscarM.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial1.png"))); // NOI18N
        btnBuscarM.setText("Buscar");
        btnBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMActionPerformed(evt);
            }
        });

        lblNombreM.setBackground(new java.awt.Color(0, 0, 153));
        lblNombreM.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblNombreM.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreM.setText("Nombre");

        lblDireccionM.setBackground(new java.awt.Color(0, 0, 153));
        lblDireccionM.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblDireccionM.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccionM.setText("Direccion");

        lblTelefonoM.setBackground(new java.awt.Color(0, 0, 153));
        lblTelefonoM.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblTelefonoM.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefonoM.setText("Telefono");

        txtNombreM.setBackground(new java.awt.Color(0, 0, 153));
        txtNombreM.setForeground(new java.awt.Color(255, 255, 255));

        txtDireccionM.setBackground(new java.awt.Color(0, 0, 153));
        txtDireccionM.setForeground(new java.awt.Color(255, 255, 255));

        txtTelefonoM.setBackground(new java.awt.Color(0, 0, 153));
        txtTelefonoM.setForeground(new java.awt.Color(255, 255, 255));

        btnGuardarM.setBackground(new java.awt.Color(0, 0, 153));
        btnGuardarM.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnGuardarM.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuraciones.png"))); // NOI18N
        btnGuardarM.setText("Guardar");
        btnGuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMActionPerformed(evt);
            }
        });

        jtBuscarM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Telefono"
            }
        ));
        jScrollPane3.setViewportView(jtBuscarM);

        javax.swing.GroupLayout panModificarLayout = new javax.swing.GroupLayout(panModificar);
        panModificar.setLayout(panModificarLayout);
        panModificarLayout.setHorizontalGroup(
            panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModificarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panModificarLayout.createSequentialGroup()
                        .addComponent(lblDireccionM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDireccionM, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModificarLayout.createSequentialGroup()
                        .addComponent(lblTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panModificarLayout.createSequentialGroup()
                        .addComponent(lblNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModificarLayout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(panModificarLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarM)
                    .addComponent(btnBuscarM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panModificarLayout.setVerticalGroup(
            panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModificarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarM)
                .addGap(18, 18, 18)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreM)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionM)
                    .addComponent(txtDireccionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoM)
                    .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 392, -1, -1));

        panBuscarC.setBackground(new java.awt.Color(0, 0, 0));
        panBuscarC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panBuscarC.setPreferredSize(new java.awt.Dimension(390, 380));

        lblNombreB.setBackground(new java.awt.Color(0, 0, 0));
        lblNombreB.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblNombreB.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreB.setText("Nombre");

        txtNombreB.setBackground(new java.awt.Color(0, 0, 0));
        txtNombreB.setForeground(new java.awt.Color(255, 255, 255));

        jtBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jtBuscar);

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial1.png"))); // NOI18N
        btnBuscar.setText("Buscar Cliente");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBuscarCLayout = new javax.swing.GroupLayout(panBuscarC);
        panBuscarC.setLayout(panBuscarCLayout);
        panBuscarCLayout.setHorizontalGroup(
            panBuscarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panBuscarCLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBuscarCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(106, 106, 106))
        );
        panBuscarCLayout.setVerticalGroup(
            panBuscarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscarCLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panBuscarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreB)
                    .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panBuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        panEliminar.setBackground(new java.awt.Color(255, 0, 0));
        panEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panEliminar.setPreferredSize(new java.awt.Dimension(390, 380));

        txtIDE.setBackground(new java.awt.Color(255, 0, 0));
        txtIDE.setForeground(new java.awt.Color(0, 0, 0));

        lbIIDE.setBackground(new java.awt.Color(255, 0, 0));
        lbIIDE.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbIIDE.setForeground(new java.awt.Color(0, 0, 0));
        lbIIDE.setText("Selecciona el ID");

        btnEliminarC.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnEliminarC.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        btnEliminarC.setText("Eliminar Cliente");
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        jtEliminarC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(jtEliminarC);

        javax.swing.GroupLayout panEliminarLayout = new javax.swing.GroupLayout(panEliminar);
        panEliminar.setLayout(panEliminarLayout);
        panEliminarLayout.setHorizontalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGroup(panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbIIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txtIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnEliminarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEliminarLayout.setVerticalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIIDE)
                    .addComponent(txtIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnEliminarC)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(panEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 392, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 373, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoCR1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        agregarCliente();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        eliminarCliente();
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMActionPerformed
        buscarClienteParaModificar();
    }//GEN-LAST:event_btnBuscarMActionPerformed

    private void btnGuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMActionPerformed
        try {
            modificarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(GestionClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarMActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    // Crear una instancia de la pantalla principal
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal(); 

    // Hacer visible la pantalla principal
    paginaPrincipal.setVisible(true); 

    // Cerrar la ventana actual (GestionClientes)
    this.dispose(); 

    }//GEN-LAST:event_btnRegresarActionPerformed

    
private void agregarCliente() {
    try {
        ConectarBD con = new ConectarBD();
        con.conectarBDOracle();

        // Obtener el siguiente valor de la secuencia
        String obtenerIdCliente = "SELECT seq_clientes.nextval FROM dual";
        con.rs = con.stmt.executeQuery(obtenerIdCliente);
        con.rs.next();
        int idCliente = con.rs.getInt(1);

        String nombre = txtNombre3.getText();
        String direccion = txtDirecion.getText();
        String telefono = txtTelefono.getText();

        // Validaciones (puedes agregar más)
        if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // Insertar el cliente con el ID obtenido de la secuencia
        String insertarCliente = "INSERT INTO clientes (id_cliente, nombre, direccion, telefono) VALUES (" 
                + idCliente + ", '" + nombre + "', '" + direccion + "', '" + telefono + "')";
        con.stmt.executeUpdate(insertarCliente);

        JOptionPane.showMessageDialog(this, "Cliente agregado correctamente.");
        limpiarCamposAgregar();
        mostrarClientes(); // Actualiza la tabla

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al agregar cliente: " + e.getMessage());
    }
}
    private void buscarCliente() {
        try {
            ConectarBD con = new ConectarBD();
            con.conectarBDOracle();

            String nombre = txtNombreB.getText();
            String buscarCliente = "SELECT * FROM clientes WHERE nombre LIKE '%" + nombre + "%'";
            con.rs = con.stmt.executeQuery(buscarCliente);

            // Obtener el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) jtBuscar.getModel();
            modelo.setRowCount(0); // Limpiar la tabla

            while (con.rs.next()) {
                Object[] fila = {
                    con.rs.getString("nombre"),
                    con.rs.getString("direccion"),
                    con.rs.getString("telefono")
                };
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar cliente: " + e.getMessage());
        }
    }

    private void eliminarCliente() {
        try {
            ConectarBD con = new ConectarBD();
            con.conectarBDOracle();

            int idCliente = Integer.parseInt(txtIDE.getText());

            // Mostrar mensaje de confirmación
            int opcion = JOptionPane.showConfirmDialog(this, 
                    "¿Está seguro que desea eliminar al cliente con ID " + idCliente + "?", 
                    "Confirmar eliminación", 
                    JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                String eliminarCliente = "DELETE FROM clientes WHERE id_cliente = " + idCliente;
                con.stmt.executeUpdate(eliminarCliente);

                JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
                limpiarCamposEliminar();
                mostrarClientes(); // Actualiza la tabla
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar cliente: " + ex.getMessage());
        }
    }

    private void buscarClienteParaModificar() {
        try {
            ConectarBD con = new ConectarBD();
            con.conectarBDOracle();

            int idCliente = Integer.parseInt(txtModificar.getText());
            String buscarCliente = "SELECT * FROM clientes WHERE id_cliente = " + idCliente;
            con.rs = con.stmt.executeQuery(buscarCliente);

            // Obtener el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) jtBuscarM.getModel();
            modelo.setRowCount(0); // Limpiar la tabla

            if (con.rs.next()) {
                txtNombreM.setText(con.rs.getString("nombre"));
                txtDireccionM.setText(con.rs.getString("direccion"));
                txtTelefonoM.setText(con.rs.getString("telefono"));

                // Habilitar campos para edición
                txtNombreM.setEnabled(true);
                txtDireccionM.setEnabled(true);
                txtTelefonoM.setEnabled(true);
                btnGuardarM.setEnabled(true);

                // Mostrar datos en la tabla
                Object[] fila = {
                    con.rs.getInt("id_cliente"),
                    con.rs.getString("nombre"),
                    con.rs.getString("direccion"),
                    con.rs.getString("telefono")
                };
                modelo.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un cliente con ese ID.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar cliente: " + ex.getMessage());
        }
    }

    private void modificarCliente() throws SQLException {
        try {
            ConectarBD con = new ConectarBD();
            con.conectarBDOracle();

            int idCliente = Integer.parseInt(txtModificar.getText());
            String nombre = txtNombreM.getText();
            String direccion = txtDireccionM.getText();
            String telefono = txtTelefonoM.getText();

            // Validaciones (puedes agregar más)
            if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            String modificarCliente = "UPDATE clientes SET nombre = '" + nombre 
                    + "', direccion = '" + direccion + "', telefono = '" 
                    + telefono + "' WHERE id_cliente = " + idCliente;
            con.stmt.executeUpdate(modificarCliente);

            JOptionPane.showMessageDialog(this, "Cliente modificado correctamente.");
            limpiarCamposModificar();
            mostrarClientes(); // Actualiza la tabla

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al modificar cliente: " + ex.getMessage());
        }
    }

    private void mostrarClientes() {
        try {
            ConectarBD con = new ConectarBD();
            con.conectarBDOracle();

            String consulta = "SELECT * FROM clientes";
            con.rs = con.stmt.executeQuery(consulta);

            // Obtener el modelo de la tabla jtEliminarC
            DefaultTableModel modelo = (DefaultTableModel) jtEliminarC.getModel();
            modelo.setRowCount(0); // Limpiar la tabla

            while (con.rs.next()) {
                Object[] fila = {
                    con.rs.getInt("id_cliente"),
                    con.rs.getString("nombre"),
                    con.rs.getString("direccion"),
                    con.rs.getString("telefono")
                };
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar clientes: " + e.getMessage());
        }
    }

    private void limpiarCamposAgregar() {
        txtNombre3.setText("");
        txtDirecion.setText("");
        txtTelefono.setText("");
    }

    private void limpiarCamposEliminar() {
        txtIDE.setText("");
    }

    private void limpiarCamposModificar() {
        txtModificar.setText("");
        txtNombreM.setText("");
        txtDireccionM.setText("");
        txtTelefonoM.setText("");
        txtNombreM.setEnabled(false);
        txtDireccionM.setEnabled(false);
        txtTelefonoM.setEnabled(false);
        btnGuardarM.setEnabled(false);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarM;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnGuardarM;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtBuscar;
    private javax.swing.JTable jtBuscarM;
    private javax.swing.JTable jtEliminarC;
    private javax.swing.JLabel lbIIDE;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionM;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombreB;
    private javax.swing.JLabel lblNombreM;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoM;
    private javax.swing.JPanel panAgregar;
    private javax.swing.JPanel panBuscarC;
    private javax.swing.JPanel panEliminar;
    private javax.swing.JPanel panModificar;
    private javax.swing.JTextField txtDireccionM;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtIDE;
    private javax.swing.JTextField txtModificar;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoM;
    // End of variables declaration//GEN-END:variables
}
