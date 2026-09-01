package logic;

public class Recurso {
    private String id;
    private String descripcion;
    private Categoria categoria;

    public Recurso() {
    }

    public Recurso(String id, String descripcion, Categoria categoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // --- MÉTODOS AGREGADOS PARA RESOLVER EL ERROR DE COMPILACIÓN ---
    public String getNombre() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.descripcion = nombre;
    }
    // ----------------------------------------------------------------

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
