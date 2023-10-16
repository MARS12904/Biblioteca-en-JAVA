package Clases;

public class Libro {
    private String autor;
    private int paginas;
    private String titulo;
    private String descripcion;
    private String fechaDePub;
    private String categoria;
    private String idioma;

    public Libro(int id, int stock, String autor, int paginas, String titulo, String descripcion, String fechaDePub, String categoria, String idioma) {
        super(id, stock);
        this.autor = autor;
        this.paginas = paginas;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDePub = fechaDePub;
        this.categoria = categoria;
        this.idioma = idioma;
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

    public String getFechaDePub() {
        return fechaDePub;
    }
    
    
}
