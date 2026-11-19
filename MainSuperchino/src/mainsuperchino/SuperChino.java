/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainsuperchino;

/**
 *
 * @author devig
 */
public class SuperChino {
    public int id;
    public String nombre;
    public String[] producto;// Alimentos, Bebidas, Higiene y limpieza
    public String codigoProducto;// numero de verificacion del producto
    public String empleado;// para identificar el empleado
    public int cedulaEmpleado; //numero cedula del trabajador

    public SuperChino(String nombre, String[] producto, String codigoProducto) {
        
        this.nombre = nombre;
        this.producto = producto;
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getProducto() {
        return producto;
    }

    public void setProducto(String[] producto) {
        this.producto = producto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    @Override
    public String toString() {
        return "SuperChino{" + "nombre=" + nombre + ", producto=" + producto + ", codigoProducto=" + codigoProducto + ", empleado=" + empleado + ", cedulaEmpleado=" + cedulaEmpleado + '}';
    }

    
    }
    
    

