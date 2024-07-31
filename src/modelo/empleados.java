/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author melis
 */
public class empleados extends persona{
    private String codigo_Empleado, puesto;
    
    public empleados(){};
    public empleados(String codigo_Empleado, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo_Empleado = codigo_Empleado;
        this.puesto = puesto;
    }
    
    public String getCodigo_Empleado() {
        return codigo_Empleado;
    }

    public void setCodigo_Empleado(String codigo_Empleado) {
        this.codigo_Empleado = codigo_Empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
    System.out.println("Codigo_Empleado: "+ getCodigo_Empleado() );
    System.out.println("Puesto: "+ getPuesto() );
    System.out.println("Nombres: " + getNombres() );
    System.out.println("Apellidos: " + getApellidos() );
    System.out.println("Direccion: " + getDireccion() );
    System.out.println("Telefono: " + getTelefono() );
    System.out.println("Fecha Nacimiento: " + getFecha_nacimiento());
    }

}
