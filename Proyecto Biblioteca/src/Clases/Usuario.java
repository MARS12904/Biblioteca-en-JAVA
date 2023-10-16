package Clases;

public class Usuario {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String domicilio;
    private String telefono;

    public Usuario(String nombre, String apellidoP, String apellidoM, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
    
}