package Clases;

public class Libro {
    private String autor;
    private int paginas;
    private String titulo;
    private String fecha;

    public Libro(String autor, int paginas, String titulo, String fecha) {
        this.autor = autor;
        this.paginas = paginas;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }
    
    
}
