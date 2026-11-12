/**
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
       PonderacionInstrumentos ponde= new PonderacionInstrumentos(70,10,20);
        Fecha fech = new Fecha(21,9,2000);  
        UnidadTrabajo und = new UnidadTrabajo("brian",fech,70,ponde);
        NotaEstudianteUnidad not = new NotaEstudianteUnidad(und,7,8,9);
        not.print();
        
       

       
       
       
    }
}
