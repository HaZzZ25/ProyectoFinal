package vista;

import javax.swing.*;
import conexion.ConectarBD;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        setLocationRelativeTo(null);//Centra la ventana
        btnIngresar.setEnabled(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLogin = new javax.swing.JPanel();
        lblIconL = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        CheckTyC = new javax.swing.JCheckBox();
        panFondo = new javax.swing.JPanel();
        lblIconLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panLogin.setBackground(new java.awt.Color(255, 255, 255));

        lblIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login-square-arrow-button-outline_icon-icons.com_73220.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        lblUsuario.setText("Usuario");

        lblContraseña.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/password.png"))); // NOI18N
        lblContraseña.setText("Contraseña");

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1-02_icon-icons.com_69186.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setOpaque(true);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        CheckTyC.setForeground(new java.awt.Color(0, 0, 0));
        CheckTyC.setText("Terminos y Condiciones");
        CheckTyC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTyCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
        panLogin.setLayout(panLoginLayout);
        panLoginLayout.setHorizontalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContraseña)
                            .addComponent(lblUsuario))
                        .addGap(28, 28, 28)
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnIngresar)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CheckTyC)
                .addGap(76, 76, 76))
        );
        panLoginLayout.setVerticalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(CheckTyC)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(panLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 310, 390));

        panFondo.setBackground(new java.awt.Color(0, 0, 0));

        lblIconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Videojuegos FJH");

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIconLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblIconLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblTitulo)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(panFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 430));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login.jpg"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 270, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    String usuario = txtUsuario.getText().trim();
    String contrasena = String.valueOf(txtPassword.getPassword()).trim();

    if (usuario.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un usuario y contraseña válidos.");
        return;
    }

    try {
        ConectarBD conexion = new ConectarBD();
        conexion.conectarBDOracle();

        String sql = "SELECT rol FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
        java.sql.PreparedStatement ps = conexion.cn.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, contrasena);

        java.sql.ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String rol = rs.getString("rol");
            JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso! Rol: " + rol);

            // Realizar acciones según el rol
            if (rol.equalsIgnoreCase("administrador")) {
                // Abrir ventana de administrador (PaginaPrincipal)
                JOptionPane.showMessageDialog(this, "Bienvenido, Administrador.");

                PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
                paginaPrincipal.setVisible(true); 

                this.dispose();

            } else if (rol.equalsIgnoreCase("vendedor")) {
                // Abrir ventana de vendedor (GestionVentas)
                JOptionPane.showMessageDialog(this, "Bienvenido, Vendedor.");

                GestionVentas gestionVentas = new GestionVentas();
                gestionVentas.setVisible(true); 

                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
        }

        // Cerrar recursos
        rs.close();
        ps.close();
        conexion.cn.close();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
    }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void CheckTyCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTyCActionPerformed
        
        if (CheckTyC.isSelected()){
            
            String txtTerminos = "TERMINOS Y CONDICIONES DE USO VIDEOJUEGOSCR\n"
                    + "1. LICENCIA DE USO: El sistema es propiedad exclusiva de VideojuegosCR.\n"
                    + " Se otorga una licencia no transferible para su uso\n"
                    + "2. PRIVACIDAD: Los datos ingresados seran utilizados unicamente\n"
                    + " para fines de gestion de ventas y facturacion.\n"
                    + "3. RESPONSABILIDAD: El usuario es responsable de mantener la \n"
                    + " confidencialidad de sus credenciales de acceso.\n"
                    + "¿Declara usted haber leido y aceptado estos terminos?";
            
            int resp = JOptionPane.showConfirmDialog(this, 
                    txtTerminos, 
                    "Contrato de Licencia de Usuario Final",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            
            if (resp == JOptionPane.YES_OPTION){
                btnIngresar.setEnabled(true);
            } else {
                CheckTyC.setSelected(false);
                btnIngresar.setSelected(false);
            }
            } else {
            btnIngresar.setEnabled(false);   
        }
    }//GEN-LAST:event_CheckTyCActionPerformed

    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckTyC;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIconL;
    private javax.swing.JLabel lblIconLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
