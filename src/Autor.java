import java.util.Date;

public class Autor {
    private Integer Code;
    private String Nombre;
    private String Apellidos;
    private Date FechaNacimiento;
    private String LocalidadNacimiento;

    public void setCode(Integer code) {
        Code = code;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public void setLocalidadNacimiento(String localidadNacimiento) {
        LocalidadNacimiento = localidadNacimiento;
    }

    public Integer getCode() {
        return Code;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getLocalidadNacimiento() {
        return LocalidadNacimiento;
    }
}
