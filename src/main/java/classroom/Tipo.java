package classroom;

public enum Tipo {
    // Definición de tipos de asignatura con código y nombre asociados
    DISCIPLINAR(10, "Disciplinar"), // Tipo de asignatura disciplinar
    FUNDAMENTACION(20, "Fundamentacion"), // Tipo de asignatura de fundamentación
    ELECTIVA(30, "Electiva"); // Tipo de asignatura electiva
    
    private int codigo; // Código identificador del tipo de asignatura
    private String nombre; // Nombre descriptivo del tipo de asignatura
    
    // Constructor privado para inicializar cada constante del enum
    private Tipo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}