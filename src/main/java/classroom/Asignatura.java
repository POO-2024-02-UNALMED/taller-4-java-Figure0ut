package classroom;

public class Asignatura {

    private String nombre; // Cambiado a privado para encapsulación
    private int codigoInterno; // Cambiado a entero, ya que en la lógica interna se maneja como int
    private int codigoExterno;
    private Tipo tipo;

    // Constructor principal que inicializa todos los atributos
    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    // Constructor por defecto
    public Asignatura() {
        this("Sin nombre", 0, 0, Tipo.FUNDAMENTACION);
    }

    // Constructor con tipo y código interno
    public Asignatura(Tipo tipo, int codigoInterno) {
        this("Sin nombre", codigoInterno, 0, tipo);
    }

    // Constructor con código externo y tipo
    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", 0, codigoExterno, tipo);
    }

    // Constructor con nombre y tipo
    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo);
    }

    // Métodos para cambiar los datos, reorganizados y unificados
    public void actualizarDatos(int codigoInterno, int codigoExterno, String nombre, Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void actualizarCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void actualizarCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno; // Conversión explícita
    }

    public void actualizarCodigoExterno(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void actualizarNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso para cumplir principios de encapsulación
    public String getNombre() {
        return nombre;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
