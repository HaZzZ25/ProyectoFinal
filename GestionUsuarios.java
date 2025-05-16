package vista;

import conexion.ConectarBD;
import javax.swing.JOptionPane;
import poo.Usuario;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author achit
 */
public class GestionUsuarios extends javax.swing.JFrame {

    ConectarBD con = new ConectarBD();

    public GestionUsuarios() {
        initComponents();
        setLocationRelativeTo(null);//Centra la ventana
        cargarUsuariosEnTabla(); // Carga los usuarios al iniciar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAlta = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblContraseñaC = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtContraseñaC = new javax.swing.JPasswordField();
        cbxRol = new javax.swing.JComboBox<>();
        btnConfirmar = new javax.swing.JButton();
        panBaja = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBaja = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        panModifica = new javax.swing.JPanel();
        lblUsuario2 = new javax.swing.JLabel();
        lblContraseña2 = new javax.swing.JLabel();
        lblContraseñaC2 = new javax.swing.JLabel();
        cbxRol2 = new javax.swing.JComboBox<>();
        txtUsuario2 = new javax.swing.JTextField();
        txtContraseña2 = new javax.swing.JPasswordField();
        txtContraseñaC2 = new javax.swing.JPasswordField();
        btnModificar = new javax.swing.JButton();
        btnRegresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panAlta.setBackground(new java.awt.Color(0, 0, 0));
        panAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");

        lblContraseña.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");

        lblContraseñaC.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblContraseñaC.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseñaC.setText("Confirmar Contraseña");

        cbxRol.setBackground(new java.awt.Color(0, 0, 0));
        cbxRol.setForeground(new java.awt.Color(255, 255, 255));
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rol", "Administrador", "Vendedor" }));
        cbxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo-cliente.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaLayout = new javax.swing.GroupLayout(panAlta);
        panAlta.setLayout(panAltaLayout);
        panAltaLayout.setHorizontalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblContraseña)
                    .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseñaC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(txtContraseña))
                    .addComponent(txtContraseñaC, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(58, 58, 58))
        );
        panAltaLayout.setVerticalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseñaC)
                    .addComponent(txtContraseñaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(41, 41, 41))
        );

        getContentPane().add(panAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panBaja.setBackground(new java.awt.Color(204, 0, 0));
        panBaja.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baja Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jtBaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Rol"
            }
        ));
        jtBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBajaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBaja);

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBajaLayout = new javax.swing.GroupLayout(panBaja);
        panBaja.setLayout(panBajaLayout);
        panBajaLayout.setHorizontalGroup(
            panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBajaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBajaLayout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(129, 129, 129))))
        );
        panBajaLayout.setVerticalGroup(
            panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEliminar)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        getContentPane().add(panBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 0, -1, 287));

        panModifica.setBackground(new java.awt.Color(255, 255, 255));
        panModifica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modifica Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        lblUsuario2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario2.setText("Usuario");

        lblContraseña2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblContraseña2.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña2.setText("Contraseña");

        lblContraseñaC2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblContraseñaC2.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseñaC2.setText("Confirmar Contraseña");

        cbxRol2.setBackground(new java.awt.Color(255, 255, 255));
        cbxRol2.setForeground(new java.awt.Color(0, 0, 0));
        cbxRol2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rol", "Administrador", "Vendedor" }));
        cbxRol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRol2ActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuraciones.png"))); // NOI18N
        btnModificar.setText("Modificicar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panModificaLayout = new javax.swing.GroupLayout(panModifica);
        panModifica.setLayout(panModificaLayout);
        panModificaLayout.setHorizontalGroup(
            panModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModificaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cbxRol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModificaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panModificaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar))
                    .addGroup(panModificaLayout.createSequentialGroup()
                        .addComponent(lblContraseñaC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(txtContraseñaC2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panModificaLayout.createSequentialGroup()
                        .addComponent(lblContraseña2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panModificaLayout.createSequentialGroup()
                        .addComponent(lblUsuario2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        panModificaLayout.setVerticalGroup(
            panModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModificaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario2)
                    .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña2)
                    .addComponent(txtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseñaC2)
                    .addComponent(txtContraseñaC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(cbxRol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(panModifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, 270));

        btnRegresar1.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnRegresar1.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btnRegresar1.setText("Regresar");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo12.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 770, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolActionPerformed
    }//GEN-LAST:event_cbxRolActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        int id_usuario = (int) (Math.random() * 10000); // Generamos un ID de usuario de manera aleatoria (puedes mejorar esto con un valor secuencial o autoincremental desde la base de datos)
        String nombre_usuario = txtUsuario.getText();  // Tomamos el nombre de usuario desde el campo de texto
        String contrasena = new String(txtContraseña.getPassword()); // Tomamos la contraseña desde el campo de contraseña
        String contrasenaC = new String(txtContraseñaC.getPassword()); // Confirmación de la contraseña
        String rol = cbxRol.getSelectedItem().toString(); // Tomamos el rol desde el combo box

        // Verificamos que la contraseña y la confirmación coincidan
        if (contrasena.equals(contrasenaC)) {
            // Creamos un objeto de tipo Usuario para registrar
            Usuario nuevoUsuario = new Usuario(id_usuario, nombre_usuario, contrasena, rol);

            // Mostramos los datos del usuario ingresado
            JOptionPane.showMessageDialog(null, "Datos Usuario:\n"
                    + "\nNombre Usuario: " + nuevoUsuario.getNombreUsuario()
                    + "\nID Usuario: " + nuevoUsuario.getIdUsuario()
                    + "\nRol: " + nuevoUsuario.getRol());

            try {
                con.conectarBDOracle(); // Establecemos la conexión a la base de datos

                // Consulta SQL para insertar el nuevo usuario
                String altaUsuario = "INSERT INTO usuarios (id_usuario, nombre_usuario, contrasena, rol) "
                        + "VALUES (" + nuevoUsuario.getIdUsuario() + ", '"
                        + nuevoUsuario.getNombreUsuario() + "', '"
                        + nuevoUsuario.getContrasena() + "', '"
                        + nuevoUsuario.getRol() + "')";

                // Ejecutamos la sentencia de inserción
                con.stmt.executeUpdate(altaUsuario);
                JOptionPane.showMessageDialog(null, "Usuario registrado con éxito!");
            } catch (SQLException e) {
                // En caso de error en la inserción, mostramos el mensaje de error
                JOptionPane.showMessageDialog(null, "Error al registrar el usuario. " + e.getMessage());
            }
        } else {
            // Si las contraseñas no coinciden, mostramos un mensaje de error
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden. Intente nuevamente.");
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int filaSeleccionada = jtBaja.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idUsuario = Integer.parseInt(jtBaja.getValueAt(filaSeleccionada, 0).toString());
            try {
                con.conectarBDOracle();
                String eliminarUsuario = "DELETE FROM usuarios WHERE id_usuario = " + idUsuario;
                con.stmt.executeUpdate(eliminarUsuario);
                JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito.");
                cargarUsuariosEnTabla(); // Actualiza la tabla
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario para eliminar.");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbxRol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRol2ActionPerformed


    }//GEN-LAST:event_cbxRol2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        String usuario = txtUsuario2.getText();
        String contraseña = new String(txtContraseña2.getPassword());
        String contraseñaC = new String(txtContraseñaC2.getPassword());
        String rol = (String) cbxRol2.getSelectedItem();

        // Verificar que los campos no estén vacíos y que las contraseñas coincidan
        if (usuario.isEmpty() || contraseña.isEmpty() || contraseñaC.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        if (!contraseña.equals(contraseñaC)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            return;
        }

        // Verificar si se ha seleccionado un usuario en la tabla
        int filaSeleccionada = jtBaja.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un usuario para modificar.");
            return;
        }

        // Obtener el ID del usuario seleccionado
        int idUsuarioSeleccionado = (int) jtBaja.getValueAt(filaSeleccionada, 0);

        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Crear consulta preparada
            String sql = "UPDATE usuarios SET contrasena = ?, rol = ? WHERE id_usuario = ?";
            PreparedStatement pstmt = con.cn.prepareStatement(sql);
            pstmt.setString(1, contraseña);
            pstmt.setString(2, rol);
            pstmt.setInt(3, idUsuarioSeleccionado);

            // Ejecutar la consulta
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuario modificado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el usuario a modificar.");
            }

            // Recargar los usuarios en la tabla
            cargarUsuariosEnTabla();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el usuario: " + e.getMessage());
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        // Crear una instancia de la pantalla principal
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

        // Hacer visible la pantalla principal
        paginaPrincipal.setVisible(true);

        // Cerrar la ventana actual (GestionClientes)
    this.dispose();     }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void jtBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBajaMouseClicked
        int seleccion = jtBaja.getSelectedRow();
        this.txtUsuario2.setText(jtBaja.getValueAt(seleccion, 1).toString());
    }//GEN-LAST:event_jtBajaMouseClicked

    private void cargarUsuariosEnTabla() {
        try {
            con.conectarBDOracle();
            String consultaUsuarios = "SELECT id_usuario, nombre_usuario, rol FROM usuarios";
            con.rs = con.stmt.executeQuery(consultaUsuarios);

            javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    new Object[]{"ID", "Usuario", "Rol"}, 0
            );

            while (con.rs.next()) {
                modelo.addRow(new Object[]{
                    con.rs.getInt("id_usuario"),
                    con.rs.getString("nombre_usuario"),
                    con.rs.getString("rol")
                });
            }

            jtBaja.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar usuarios: " + e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JComboBox<String> cbxRol2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBaja;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña2;
    private javax.swing.JLabel lblContraseñaC;
    private javax.swing.JLabel lblContraseñaC2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JPanel panAlta;
    private javax.swing.JPanel panBaja;
    private javax.swing.JPanel panModifica;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JPasswordField txtContraseñaC;
    private javax.swing.JPasswordField txtContraseñaC2;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario2;
    // End of variables declaration//GEN-END:variables
}
