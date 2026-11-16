package model;

/**
 * Representa un tour del catálogo de Llanquihue Tour.
 * Sus datos se cargan desde el archivo resources/tours.txt
 *
 * @author Elizabeth Pettersen
 */
public class Tour {
    private String nombre;
    private String tipo;
    private int precio;
    private int cupos;


    /**
     * Crea un tour validando cada dato
     *
     * @param nombre nombre del tour (no puede estar vacío)
     * @param tipo   tipo de tour, por ejemplo Gastronómico (no puede estar vacío)
     * @param precio precio en pesos (no puede ser negativo)
     * @param cupos  cupos disponibles (no puede ser negativo)
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public Tour(String nombre, String tipo, int precio, int cupos) {
        setNombre(nombre);
        setTipo(tipo);
        setPrecio(precio);
        setCupos(cupos);
    }

    /**
     * @return el nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre (no puede ser nulo ni vacío)
     * @throws IllegalArgumentException si el nombre es nulo o vacío
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    /**
     * @return el tipo de tour
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo nuevo tipo (no puede ser nulo ni vacío)
     * @throws IllegalArgumentException si el tipo es nulo o vacío
     */
    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío");
        }
        this.tipo = tipo.trim();
    }

    /**
     * @return el precio en pesos
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio nuevo precio (no puede ser negativo)
     * @throws IllegalArgumentException si el precio es negativo
     */
    public void setPrecio(int precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    /**
     * @return los cupos disponibles
     */
    public int getCupos() {
        return cupos;
    }

    /**
     * @param cupos nuevos cupos (no pueden ser negativos)
     * @throws IllegalArgumentException si los cupos son negativos
     */
    public void setCupos(int cupos) {
        if (cupos < 0) {
            throw new IllegalArgumentException("Los cupos no pueden ser negativos");
        }
        this.cupos = cupos;
    }

    @Override
    public String toString() {
        return "Tour: " + nombre + " | Tipo: " + tipo + " | Precio: $" + precio + " | Cupos: " + cupos;
    }
}
