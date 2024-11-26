package classroom;

public class Persona {

    private final long cedula; // Cambiado a privado para respetar encapsulación
    private String nombre;
    private static int totalPersonas;

    // Bloque estático para inicialización de variables estáticas
    static {
        totalPersonas = 0;
    }

    // Constructor principal
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        incrementarTotalPersonas();
    }

    // Constructor alternativo con parámetros invertidos
    public Persona(String nombre, long cedula) {
        this(cedula, nombre); // Llama al constructor principal
    }

    // Constructor con solo cédula
    public Persona(long cedula) {
        this(cedula, "Desconocido"); // Usa un nombre predeterminado
    }

    // Constructor con solo nombre
    public Persona(String nombre) {
        this(1, nombre); // Usa una cédula predeterminada
    }

    // Constructor por defecto
    public Persona() {
        this(0, "No asignado"); // Usa valores predeterminados
    }

    // Métodos de acceso y modificación
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    // Método para obtener el total de personas
    public static int getTotalPersonas() {
        return totalPersonas;
    }

    // Método para incrementar el total de personas
    private static void incrementarTotalPersonas() {
        totalPersonas++;
    }
}
