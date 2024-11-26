package classroom;

public class Grupo {

    public Persona[] estudiantes; // Arreglo de estudiantes en el grupo
    public Persona profesor; // Profesor asignado al grupo
    public Asignatura asignatura; // Asignatura correspondiente al grupo
    public final int codigo; // Código único de identificación del grupo
    public String horario; // Horario de clases del grupo

    // Constructor completo que inicializa todos los atributos del grupo
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    // Constructor que crea un arreglo de estudiantes basado en la cantidad especificada
    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Persona[] personas  = new Persona[cantidadEstudiantes];
        this.estudiantes = personas;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    // Constructor que inicializa grupo sin código específico
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = 0; // Inicialización por defecto del código de grupo
    }

    // Método para reemplazar un estudiante existente por otro basado en su cédula
    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    // Método para reemplazar un estudiante en una posición específica del arreglo
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}