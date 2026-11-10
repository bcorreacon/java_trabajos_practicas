/**
 * Un objeto de esta clase está asociado con una unidad de trabajo
 * y guarda la nota que un estudiante ha sacado en los controles, actividades y
 * proyectos de esa unidad
 */
public class NotaEstudianteUnidad {
    private UnidadTrabajo unidad;
    private double notaControles;
    private double notaActividades;
    private double notaProyectos;

    /**
     * Constructor
     */
    public NotaEstudianteUnidad(UnidadTrabajo unidad, double notaControles,
                                double notaActividades,
                                double notaProyectos) {
        this.unidad = unidad;
        this.notaControles = notaControles;
        this.notaActividades = notaActividades;
        this.notaProyectos = notaProyectos;
    }

    /**
     * Accesor para la UT
     */
    public UnidadTrabajo getUnidad() {
        return unidad;
    }

    /**
     * Accesor para la UT
     */
    public void setUnidad(UnidadTrabajo unidad) {
        this.unidad = unidad;
    }

    /**
     * Accesor para nota controles
     */
    public double getNotaControles() {
        return notaControles;
    }

    /**
     * Mutador para nota controles
     */
    public void setNotaControles(double notaControles) {
        this.notaControles = notaControles;
    }

    /**
     * Accesor para nota actividades
     */
    public double getNotaActividades() {
        return notaActividades;
    }

    /**
     * Mutador para nota actividades
     */
    public void setNotaActividades(double notaActividades) {
        this.notaActividades = notaActividades;
    }

    /**
     * Accesor para nota proyectos
     */
    public double getNotaProyectos() {
        return notaProyectos;
    }

    /**
     * Mutador para nota proyectos
     */
    public void setNotaProyectos(double notaProyectos) {
        this.notaProyectos = notaProyectos;
    }

    /**
     * Calcula y devuelve la nota obtenida en la UT teniendo
     * en cuenta la ponderación de los instrumentos de evaluación
     */
    public double calcularNotaUnidad() {
        double a;
        double b;
        double c;
        
        PonderacionInstrumentos pond = unidad.getPonderacion();
        
        a=notaControles * (pond.getControles()/100);
        b=notaActividades *(pond.getActividades()/100);
        c=notaProyectos *(pond.getProyectos()/100);
        return a+b+c;

    }

    /**
     * Representación textual del objeto (ver enunciado)
     */
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Controles: " + this.notaControles + "\t");
        sb.append("Actividades clase: " + this.notaActividades + "\t");
        sb.append("Proyectos: " + this.notaProyectos + "\n");
        sb.append("Nota final obtenida en Unidad de Trabajo" + calcularNotaUnidad() + "\n");
        sb.append("-------------------------------------------------------------------------");
        return sb.toString();
    
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

   

}
