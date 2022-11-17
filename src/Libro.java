import java.util.Date;
import java.util.PrimitiveIterator;

public class Libro {

    private Integer Code;
    private String Titulo;
    private String Isbn;
    private String Autor;
    private String Genero;
    private Date FechaPublicacion;

    public void setCode(Integer code) {
        Code = code;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public Integer getCode(){
        return Code;
    }
    public String getAutor() {
        return Autor;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public String getGenero() {
        return Genero;
    }

    public String getIsbn() {
        return Isbn;
    }

    public String getTitulo() {
        return Titulo;
    }
}
