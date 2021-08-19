/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorRequerimientos;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Requerimiento_1;

/**
 *
 * @author USUARIO
 */
public class VistaRequerimientos {
    public static ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("25 Proyectos Clasificados por Casa");
        try {
            System.out.println("Clasificación por Casa");
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();
            requerimiento1.forEach(req1 -> {
                System.out.printf("%s %s %s %s %s %s %n",
                        req1.getFecha_Inicio(),
                        req1.getConstructora(),
                        req1.getCiudad(),
                        req1.getAcabados(),
                        req1.getBanco_Vinculado(),
                        req1.getSerial());
            });

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
