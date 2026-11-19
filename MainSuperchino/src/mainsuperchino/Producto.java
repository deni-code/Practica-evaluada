/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainsuperchino;

/**
 *
 * @author devig
 */
public class Producto {
    
    public String nombreProducto;
    public String ingresoProductos;
    public int alimentos = 4000;
    public int bebidas = 5000;
    public int higiene = 3000;
    public int limpieza = 2000;

    public Producto(String nombreProducto, String ingresoProductos) {
        this.nombreProducto = nombreProducto;
        this.ingresoProductos = ingresoProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", ingresoProductos=" + ingresoProductos + ", Alimentos=" + alimentos + ", Bebidas=" + bebidas + ", Higiene=" + higiene + ", Limpieza=" + limpieza + '}';
    }
    
    
            
}
