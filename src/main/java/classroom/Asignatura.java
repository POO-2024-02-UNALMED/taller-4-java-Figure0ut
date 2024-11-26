package classroom;

public class Asignatura {

    public String nombre; // Atributo que representa el nombre de la asignatura
    public double codigoInterno; // Identificador interno con precisión decimal
    public int codigoExterno; // Código de identificación externa
    public Tipo tipo; // Tipo de asignatura según clasificación

    public Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION); // Constructor por defecto con nombre genérico
    }

    public Asignatura(Tipo tipo,int codigoInterno) {
        this("Sin nombre", codigoInterno, 0,tipo); // Constructor con tipo y código interno
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", 0, codigoExterno,tipo); // Constructor con código externo y tipo
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo); // Constructor con nombre y tipo
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        // Constructor completo que inicializa todos los atributos
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        // Método para actualizar todos los datos de la asignatura
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(double codigoInterno) {
        // Método para actualizar solo el código interno con valor decimal
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(int codigoExterno) {
        // Método para actualizar solo el código externo
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        // Método para actualizar solo el nombre de la asignatura
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        // Setter para código interno de tipo entero
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        // Setter para código interno de tipo decimal, convirtiendo a entero
        this.codigoInterno = (int) codigoInterno;
    }
}