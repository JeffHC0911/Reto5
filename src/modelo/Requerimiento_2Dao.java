/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.JDBCUtilities;

/**
 *
 * @author USUARIO
 */
public class Requerimiento_2Dao {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> respuesta = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String consulta = "SELECT Constructora , Ciudad , Porcentaje_Cuota_Inicial , t.Area_Max || ' ' || t.Estrato Tipo FROM Proyecto p inner join Tipo t on (p.ID_Tipo = t.ID_Tipo) WHERE Ciudad  = 'Armenia' ORDER BY t.Area_Max, t.Estrato;";
            try (Statement statement = conexion.createStatement(); ResultSet resultSet = statement.executeQuery(consulta)) {
                while (resultSet.next()) {
                    Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                    requerimiento_2.setConstructora(resultSet.getString("Constructora"));
                    requerimiento_2.setCiudad(resultSet.getString("Ciudad"));
                    requerimiento_2.setPorcentaje_Cuota_Inicial(resultSet.getDouble("Porcentaje_Cuota_Inicial"));
                    requerimiento_2.setTipo(resultSet.getString("Tipo"));
                    respuesta.add(requerimiento_2);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error consultando Concatenación: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;
    }
}
