/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Requerimiento_3 {
    private String Nombre_Material;
    private int Precio_Unidad;

    public Requerimiento_3(){

    }
    
    public Requerimiento_3(String nombreMaterial, int precioUnidad) {
        this.Nombre_Material = nombreMaterial;
        this.Precio_Unidad = precioUnidad;
    }

    public String getNombre_Material() {
        return Nombre_Material;
    }

    public void setNombre_Material(String nombreMaterial) {
        this.Nombre_Material = nombreMaterial;
    }

    public int getPrecio_Unidad() {
        return this.Precio_Unidad;
    }

    public void setPrecio_Unidad(int precioUnidad) {
        this.Precio_Unidad = precioUnidad;
    }
}
