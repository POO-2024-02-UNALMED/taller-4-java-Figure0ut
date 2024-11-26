package classroom;

public enum Tipo {
    DISCIPLINAR(10, "Disciplinar"),
    FUNDAMENTACION(20, "Fundamentación"),
    ELECTIVA(30, "Electiva");

    private final int codigo; // Atributos ahora son finales para respetar la inmutabilidad de enums
    private final String nombre;

    // Constructor para inicializar valores
    private Tipo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Métodos de acceso para obtener los valores de los atributos
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
