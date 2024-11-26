package classroom;

public class Grupo {

    private Persona[] estudiantes; // Cambiado a privado para cumplir con principios de encapsulación
    private Persona profesor;
    private Asignatura asignatura;
    private final int codigo; // Mantengo como constante y aseguro inicialización
    private String horario;

    // Constructor principal
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    // Constructor alternativo con cantidad de estudiantes
    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(new Persona[cantidadEstudiantes], profesor, asignatura, codigo, horario); // Llamo al constructor principal directamente
    }

    // Constructor con estudiantes, profesor y asignatura únicamente
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this(estudiantes, profesor, asignatura, 0, "No asignado"); // Inicializo código y horario por defecto
    }

    // Método para cambiar un estudiante por otro basándose en la cédula
    public void reemplazarEstudiante(Persona estudianteAntiguo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getCedula() == estudianteAntiguo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                return;
            }
        }
    }

    // Método para cambiar un estudiante según índice
    public void reemplazarEstudiante(int indice, Persona nuevoEstudiante) {
        if (indice >= 0 && indice < estudiantes.length) {
            estudiantes[indice] = nuevoEstudiante;
        }
    }

    // Métodos de acceso para encapsulación
    public Persona[] getEstudiantes() {
        return estudiantes;
    }

    public Persona getProfesor() {
        return profesor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getHorario() {
        return horario;
    }

    // Métodos para modificar propiedades no finales
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
