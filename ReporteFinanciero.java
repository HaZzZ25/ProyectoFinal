package poo;

import conexion.ConectarBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReporteFinanciero {
    
    ConectarBD con = new ConectarBD();

    public void mostrarTotalVentasDiarias() {
        double totalDia = 0.0;
        try {
            con.conectarBDOracle();
            // Suma ventas del día de hoy
            String sql = "SELECT SUM(total) FROM ventas WHERE TRUNC(fecha) = TRUNC(SYSDATE)";
            con.rs = con.stmt.executeQuery(sql);
            
            if (con.rs.next()) {
                totalDia = con.rs.getDouble(1);
            }
            
            // Cálculos
            double impuestos = totalDia * 0.16;
            double utilidad = totalDia / 1.16;

            // Formato correcto a 2 decimales
            String mensaje = "=== REPORTE FINANCIERO DIARIO ===\n\n"
                           + "Total Vendido Hoy: $" + String.format("%.2f", totalDia) + "\n"
                           + "Impuestos estimados (16%): $" + String.format("%.2f", impuestos) + "\n"
                           + "Utilidad bruta estimada: $" + String.format("%.2f", utilidad) + "\n\n"
                           + "=================================";
                           
            JOptionPane.showMessageDialog(null, mensaje, "Reporte Financiero", JOptionPane.INFORMATION_MESSAGE);
            con.cn.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte: " + e.getMessage());
        }
    }
}