package vista;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.ConectarBD;
import java.awt.Desktop;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.*;


public class GestionVentas extends javax.swing.JFrame {
    
    ConectarBD con = new ConectarBD();
    
    private ArrayList<Object[]> carrito;
    private double totalVenta;
    
    private Stack<Object[]> pilaProductos; // Cambiado a Object[] para manejar productos
    private Queue<Object[]> colaProductos;


    public GestionVentas() {
        initComponents();
        setLocationRelativeTo(null);
        carrito = new ArrayList<>();
        totalVenta = 0.0;
        cargarClientesEnComboBox();
        cargarProductosEnComboBox();
        
        pilaProductos = new Stack<>();
        colaProductos = new LinkedList<>();
        
        // Deshabilitar la edición de subtotal y total
        txtTotalGV.setEditable(false);

        // Agregar ItemListener al ComboBox de productos
        cbxProductoGV.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        mostrarPrecioProducto(); // Método que deberías implementar
        }
    }
});

    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panVentas = new javax.swing.JPanel();
        lblClienteGV = new javax.swing.JLabel();
        lblCantidadGV = new javax.swing.JLabel();
        lblPrecioGV = new javax.swing.JLabel();
        lblTotalGV = new javax.swing.JLabel();
        lblProductoGV = new javax.swing.JLabel();
        btnAgregarGV = new javax.swing.JButton();
        btnFacturarGV = new javax.swing.JButton();
        txtPrecioGV = new javax.swing.JTextField();
        txtTotalGV = new javax.swing.JTextField();
        txtCantidadGV = new javax.swing.JTextField();
        cbxClientesGV = new javax.swing.JComboBox<>();
        cbxProductoGV = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVentas = new javax.swing.JTable();
        btnRegresarGV = new javax.swing.JButton();
        btnPila = new javax.swing.JButton();
        btnCola = new javax.swing.JButton();
        lblTituloGV = new javax.swing.JLabel();
        lblIconGV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panVentas.setBackground(new java.awt.Color(255, 0, 0));
        panVentas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        lblClienteGV.setBackground(new java.awt.Color(255, 0, 0));
        lblClienteGV.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblClienteGV.setForeground(new java.awt.Color(0, 0, 0));
        lblClienteGV.setText("Cliente");

        lblCantidadGV.setBackground(new java.awt.Color(255, 0, 0));
        lblCantidadGV.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblCantidadGV.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidadGV.setText("Cantidad");

        lblPrecioGV.setBackground(new java.awt.Color(255, 0, 0));
        lblPrecioGV.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblPrecioGV.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioGV.setText("Precio");

        lblTotalGV.setBackground(new java.awt.Color(255, 0, 0));
        lblTotalGV.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblTotalGV.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalGV.setText("Total");

        lblProductoGV.setBackground(new java.awt.Color(255, 0, 0));
        lblProductoGV.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblProductoGV.setForeground(new java.awt.Color(0, 0, 0));
        lblProductoGV.setText("Producto");

        btnAgregarGV.setBackground(new java.awt.Color(255, 0, 0));
        btnAgregarGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnAgregarGV.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        btnAgregarGV.setText("Agregar");
        btnAgregarGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGVActionPerformed(evt);
            }
        });

        btnFacturarGV.setBackground(new java.awt.Color(255, 0, 0));
        btnFacturarGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnFacturarGV.setForeground(new java.awt.Color(0, 0, 0));
        btnFacturarGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte1.png"))); // NOI18N
        btnFacturarGV.setText("Ticket");
        btnFacturarGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarGVActionPerformed(evt);
            }
        });

        txtPrecioGV.setBackground(new java.awt.Color(255, 0, 0));
        txtPrecioGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txtPrecioGV.setForeground(new java.awt.Color(0, 0, 0));

        txtTotalGV.setBackground(new java.awt.Color(255, 0, 0));
        txtTotalGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txtTotalGV.setForeground(new java.awt.Color(0, 0, 0));

        txtCantidadGV.setBackground(new java.awt.Color(255, 0, 0));
        txtCantidadGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txtCantidadGV.setForeground(new java.awt.Color(0, 0, 0));

        cbxClientesGV.setBackground(new java.awt.Color(255, 255, 255));
        cbxClientesGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cbxClientesGV.setForeground(new java.awt.Color(0, 0, 0));
        cbxClientesGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes" }));

        cbxProductoGV.setBackground(new java.awt.Color(255, 255, 255));
        cbxProductoGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cbxProductoGV.setForeground(new java.awt.Color(0, 0, 0));
        cbxProductoGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto" }));
        cbxProductoGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductoGVActionPerformed(evt);
            }
        });

        jtVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(jtVentas);

        btnRegresarGV.setBackground(new java.awt.Color(255, 0, 0));
        btnRegresarGV.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnRegresarGV.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresarGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btnRegresarGV.setText("Regresar");
        btnRegresarGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarGVActionPerformed(evt);
            }
        });

        btnPila.setBackground(new java.awt.Color(255, 0, 0));
        btnPila.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnPila.setForeground(new java.awt.Color(0, 0, 0));
        btnPila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        btnPila.setText("Pila");
        btnPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilaActionPerformed(evt);
            }
        });

        btnCola.setBackground(new java.awt.Color(255, 0, 0));
        btnCola.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnCola.setForeground(new java.awt.Color(0, 0, 0));
        btnCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        btnCola.setText("Cola");
        btnCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVentasLayout = new javax.swing.GroupLayout(panVentas);
        panVentas.setLayout(panVentasLayout);
        panVentasLayout.setHorizontalGroup(
            panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVentasLayout.createSequentialGroup()
                        .addComponent(lblProductoGV, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addGap(189, 189, 189))
                    .addGroup(panVentasLayout.createSequentialGroup()
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panVentasLayout.createSequentialGroup()
                                .addComponent(btnAgregarGV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFacturarGV))
                            .addGroup(panVentasLayout.createSequentialGroup()
                                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblClienteGV, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecioGV, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotalGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCantidadGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVentasLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxClientesGV, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panVentasLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbxProductoGV, javax.swing.GroupLayout.Alignment.TRAILING, 0, 157, Short.MAX_VALUE)
                                            .addComponent(txtCantidadGV)
                                            .addComponent(txtPrecioGV)
                                            .addComponent(txtTotalGV))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panVentasLayout.createSequentialGroup()
                        .addComponent(btnPila)
                        .addGap(42, 42, 42)
                        .addComponent(btnCola)))
                .addGap(15, 15, 15))
            .addGroup(panVentasLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnRegresarGV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panVentasLayout.setVerticalGroup(
            panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentasLayout.createSequentialGroup()
                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVentasLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClienteGV)
                            .addComponent(cbxClientesGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductoGV)
                            .addComponent(cbxProductoGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidadGV)
                            .addComponent(txtCantidadGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioGV)
                            .addComponent(txtPrecioGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalGV)
                            .addComponent(txtTotalGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panVentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVentasLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarGV)
                            .addComponent(btnFacturarGV)))
                    .addGroup(panVentasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCola)
                            .addComponent(btnPila))))
                .addGap(18, 18, 18)
                .addComponent(btnRegresarGV)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(panVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, -1, -1));

        lblTituloGV.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloGV.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTituloGV.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloGV.setText("Gestion Ventas");
        getContentPane().add(lblTituloGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 8, 275, -1));

        lblIconGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoCR15.png"))); // NOI18N
        getContentPane().add(lblIconGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxProductoGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductoGVActionPerformed

    }//GEN-LAST:event_cbxProductoGVActionPerformed

    private void btnAgregarGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGVActionPerformed
        agregarProductoAVenta();
    }//GEN-LAST:event_btnAgregarGVActionPerformed

    private void btnFacturarGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarGVActionPerformed
       try {
           facturarVenta();
       } catch (IOException ex) {
           Logger.getLogger(GestionVentas.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnFacturarGVActionPerformed

    private void btnRegresarGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarGVActionPerformed
    
    // Crear una instancia de la pantalla principal
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal(); 

    // Hacer visible la pantalla principal
    paginaPrincipal.setVisible(true); 

    // Cerrar la ventana actual (GestionClientes)
    this.dispose(); 
    }//GEN-LAST:event_btnRegresarGVActionPerformed

    private void btnPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilaActionPerformed
    manejarPila();
    }//GEN-LAST:event_btnPilaActionPerformed

    private void btnColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaActionPerformed
    manejarCola();
    }//GEN-LAST:event_btnColaActionPerformed

    private void cargarClientesEnComboBox() {
        try {
            con.conectarBDOracle();
            String consulta = "SELECT nombre FROM clientes";
            con.rs = con.stmt.executeQuery(consulta);

            while (con.rs.next()) {
                String nombreCliente = con.rs.getString("nombre");
                cbxClientesGV.addItem(nombreCliente);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar clientes: " + e.getMessage());
        }
    }

    private void cargarProductosEnComboBox() {
        try {
            con.conectarBDOracle();

            // Cargar Videojuegos
            String consultaVideojuegos = "SELECT nombre FROM videojuegos";
            con.rs = con.stmt.executeQuery(consultaVideojuegos);
            while (con.rs.next()) {
                String nombreVideojuego = con.rs.getString("nombre");
                cbxProductoGV.addItem(nombreVideojuego);
            }

            // Cargar Consolas
            String consultaConsolas = "SELECT nombre FROM consolas";
            con.rs = con.stmt.executeQuery(consultaConsolas);
            while (con.rs.next()) {
                String nombreConsola = con.rs.getString("nombre");
                cbxProductoGV.addItem(nombreConsola);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar productos: " + e.getMessage());
        }
    }

    private void mostrarPrecioProducto() {
        String productoSeleccionado = (String) cbxProductoGV.getSelectedItem();
        try {
            con.conectarBDOracle();

            double precio = 0.0;
            // Buscar el precio en la tabla de videojuegos o consolas
            String consultaVideojuegos = "SELECT precio FROM videojuegos WHERE nombre = '" + productoSeleccionado + "'";
            con.rs = con.stmt.executeQuery(consultaVideojuegos);
            if (con.rs.next()) {
                precio = con.rs.getDouble("precio");
            } else {
                String consultaConsolas = "SELECT precio FROM consolas WHERE nombre = '" + productoSeleccionado + "'";
                con.rs = con.stmt.executeQuery(consultaConsolas);
                if (con.rs.next()) {
                    precio = con.rs.getDouble("precio");
                }
            }
            txtPrecioGV.setText(String.valueOf(precio));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el precio del producto: " + e.getMessage());
        }
    }

    private void agregarProductoAVenta() {
        try {
            String producto = (String) cbxProductoGV.getSelectedItem();
            int cantidad = Integer.parseInt(txtCantidadGV.getText());
            double precio = Double.parseDouble(txtPrecioGV.getText());

            // Calcular subtotal
            double subtotal = cantidad * precio;

            // Agregar producto al carrito
            Object[] productoAgregado = {producto, cantidad, precio, subtotal};
            carrito.add(productoAgregado);

            // Actualizar tabla
            DefaultTableModel modelo = (DefaultTableModel) jtVentas.getModel();
            modelo.addRow(productoAgregado);

            // Actualizar total de la venta
            totalVenta += subtotal;
            txtTotalGV.setText(String.valueOf(totalVenta));

            // Limpiar campos
            txtCantidadGV.setText("");
            txtPrecioGV.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para cantidad y precio.");
        }
    }

    private void facturarVenta() throws IOException {
        try {
            con.conectarBDOracle();

            // Obtener el nombre del cliente
            String nombreCliente = (String) cbxClientesGV.getSelectedItem();

            // Obtener el ID del cliente
            String obtenerIdCliente = "SELECT id_cliente FROM clientes WHERE nombre = '" + nombreCliente + "'";
            con.rs = con.stmt.executeQuery(obtenerIdCliente);
            con.rs.next();
            int idCliente = con.rs.getInt("id_cliente");

            // Obtener el siguiente valor de la secuencia seq_ventas
            String obtenerIdVenta = "SELECT seq_ventas.nextval FROM dual";
            con.rs = con.stmt.executeQuery(obtenerIdVenta);
            con.rs.next();
            int idVenta = con.rs.getInt(1);

            // Insertar la venta con el ID obtenido de la secuencia
            String insertarVenta = "INSERT INTO ventas (id_venta, fecha, id_cliente, total) VALUES ("
                    + idVenta + ", SYSDATE, " + idCliente + ", " + totalVenta + ")";
            con.stmt.executeUpdate(insertarVenta);

            // Insertar los detalles de la venta en la tabla "detalle_ventas"
            for (Object[] producto : carrito) {
                String nombreProducto = (String) producto[0];
                int cantidad = (int) producto[1];
                double precioUnitario = (double) producto[2];
                String tipoProducto = "";

                // Determinar si el producto es videojuego o consola
                String consultaVideojuegos = "SELECT id_videojuego FROM videojuegos WHERE nombre = '" + nombreProducto + "'";
                con.rs = con.stmt.executeQuery(consultaVideojuegos);
                if (con.rs.next()) {
                    tipoProducto = "videojuego";
                } else {
                    tipoProducto = "consola";
                }

                // Obtener el siguiente valor de la secuencia seq_detalle_ventas
                String obtenerIdDetalle = "SELECT seq_detalle_ventas.nextval FROM dual";
                con.rs = con.stmt.executeQuery(obtenerIdDetalle);
                con.rs.next();
                int idDetalle = con.rs.getInt(1);

                String insertarDetalleVenta = "INSERT INTO detalle_ventas (id_detalle, id_venta, tipo_producto, id_producto, cantidad, precio_unitario) VALUES ("
                        + idDetalle + ", " + idVenta + ", '" + tipoProducto + "', "
                        + "(SELECT id_" + tipoProducto + " FROM " + tipoProducto + "s WHERE nombre = '" + nombreProducto + "'), "
                        + cantidad + ", " + precioUnitario + ")";
                con.stmt.executeUpdate(insertarDetalleVenta);
            }

            // Generar el ticket en PDF
            generarTicketPDF(idVenta, nombreCliente, carrito, totalVenta);

            JOptionPane.showMessageDialog(this, "Venta facturada con éxito.");

            // Limpiar el carrito, la tabla y reiniciar el total
            carrito.clear();
            DefaultTableModel modelo = (DefaultTableModel) jtVentas.getModel();
            modelo.setRowCount(0);
            totalVenta = 0.0;
            txtTotalGV.setText("0.0");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al facturar la venta: " + e.getMessage());
        }
    }

private void generarTicketPDF(int idVenta, String nombreCliente, ArrayList<Object[]> carrito, double totalVenta) throws IOException {
    try {
        Document documento = new Document();
        FileOutputStream archivo = new FileOutputStream("ticket_venta_" + idVenta + ".pdf");
        PdfWriter.getInstance(documento, archivo);
        documento.open();

        // Formato de fecha y hora para México
        SimpleDateFormat formatoFechaHoraMexico = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("es", "MX"));
        String fechaHoraMexico = formatoFechaHoraMexico.format(new Date());

        // Título
        Font fuenteTitulo = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
        Paragraph titulo = new Paragraph("Ticket de Venta", fuenteTitulo);
        titulo.setAlignment(Element.ALIGN_CENTER);
        documento.add(titulo);

        // Información general
        documento.add(new Paragraph("ID de Venta: " + idVenta));
        documento.add(new Paragraph("Cliente: " + nombreCliente));
        documento.add(new Paragraph("Fecha y hora: " + fechaHoraMexico));
        documento.add(new Paragraph(" ")); // Espacio en blanco

        // Tabla de productos
        PdfPTable tabla = new PdfPTable(4); // 4 columnas
        tabla.setWidthPercentage(100);
        Font fuenteEncabezados = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        tabla.addCell(new Phrase("Producto", fuenteEncabezados));
        tabla.addCell(new Phrase("Cantidad", fuenteEncabezados));
        tabla.addCell(new Phrase("Precio unitario", fuenteEncabezados));
        tabla.addCell(new Phrase("Subtotal", fuenteEncabezados));
        for (Object[] producto : carrito) {
            tabla.addCell((String) producto[0]);
            tabla.addCell(String.valueOf((int) producto[1]));
            tabla.addCell(String.valueOf((double) producto[2]));
            tabla.addCell(String.valueOf((double) producto[3]));
        }
        documento.add(tabla);

        // Total
        documento.add(new Paragraph(" "));
        Font fuenteTotal = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
        Paragraph total = new Paragraph("Total: $" + totalVenta, fuenteTotal);
        total.setAlignment(Element.ALIGN_RIGHT);
        documento.add(total);

        documento.close();

        // Abrir el PDF automáticamente
        if (Desktop.isDesktopSupported()) {
            try {
                File ticketPDF = new File("ticket_venta_" + idVenta + ".pdf");
                Desktop.getDesktop().open(ticketPDF);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al abrir el ticket PDF: " + ex.getMessage());
            }
        }

    } catch (DocumentException | FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "Error al generar el ticket PDF: " + e.getMessage());
    }
}
    private void manejarPila() {
        pilaProductos.clear();
        for (Object[] producto : carrito) {
            pilaProductos.push(producto);
        }

        StringBuilder mensaje = new StringBuilder("Productos en la pila:\n");
        for (Object[] producto : pilaProductos) {
            mensaje.append("Producto: ").append(producto[0])
                   .append(", Cantidad: ").append(producto[1]).append("\n");
        }

        JOptionPane.showMessageDialog(this, mensaje.toString());
    }
    private void manejarCola() {
        colaProductos.clear();
        for (Object[] producto : carrito) {
            colaProductos.add(producto);
        }

        StringBuilder mensaje = new StringBuilder("Productos en la cola:\n");
        for (Object[] producto : colaProductos) {
            mensaje.append("Producto: ").append(producto[0])
                   .append(", Cantidad: ").append(producto[1]).append("\n");
        }

        JOptionPane.showMessageDialog(this, mensaje.toString());
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarGV;
    private javax.swing.JButton btnCola;
    private javax.swing.JButton btnFacturarGV;
    private javax.swing.JButton btnPila;
    private javax.swing.JButton btnRegresarGV;
    private javax.swing.JComboBox<String> cbxClientesGV;
    private javax.swing.JComboBox<String> cbxProductoGV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtVentas;
    private javax.swing.JLabel lblCantidadGV;
    private javax.swing.JLabel lblClienteGV;
    private javax.swing.JLabel lblIconGV;
    private javax.swing.JLabel lblPrecioGV;
    private javax.swing.JLabel lblProductoGV;
    private javax.swing.JLabel lblTituloGV;
    private javax.swing.JLabel lblTotalGV;
    private javax.swing.JPanel panVentas;
    private javax.swing.JTextField txtCantidadGV;
    private javax.swing.JTextField txtPrecioGV;
    private javax.swing.JTextField txtTotalGV;
    // End of variables declaration//GEN-END:variables
}
