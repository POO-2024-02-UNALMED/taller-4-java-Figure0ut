package classroom;

public class Persona {

    final long cedula; // Identificación única e inmutable de la persona
    String nombre; // Nombre de la persona
    static int totalPersonas; // Contador estático del número total de personas creadas
    
    // Bloque estático para inicializar variables de clase
    static {
        totalPersonas = 0; // Inicialización del contador de personas
    }

    // Constructor con cédula y nombre
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++; // Incrementa el contador de personas
    }
    
    // Constructor con nombre y cédula en diferente orden
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++; // Incrementa el contador de personas
    }

    // Constructor solo con cédula
    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = ""; // Nombre por defecto vacío
        totalPersonas++; // Incrementa el contador de personas
    }

    // Constructor solo con nombre
    public Persona(String nombre) {
        this.nombre = nombre; // Asigna el nombre proporcionado
        cedula = 1; // Inicialización de cédula por defecto
        totalPersonas++; // Incrementa el contador de personas
    }

    // Constructor sin argumentos
    public Persona() {
        cedula = 0; // Cédula por defecto
        totalPersonas++; // Incrementa el contador de personas
    }
    
    // Método para obtener la cédula
    public long getCedula() {
        return cedula;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}