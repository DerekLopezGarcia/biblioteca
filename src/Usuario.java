public class Usuario {
    private String Nombre;
    private String Apellidos;
    private String Dni;
    private Integer Telefono;
    private String Direccion;
    private String Poblacion;

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDni() {
        return Dni;
    }

    public String getDireccion() {
        return Direccion;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public String getPoblacion() {
        return Poblacion;
    }
}
