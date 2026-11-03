/**
 * La clase modela un sencillo podómetro que registra información
 * acerca de los pasos, distancia, ..... que una persona
 * ha dado en una semana. 
 * 
 * @author    - pon aquí tu nombre - 
 */
public class Podometro {
    private final char HOMBRE='H';
    private final char MUJER='M';
    private final double ZANCADA_HOMBRE = 0.45;
    private final double ZANCADA_MUJER = 0.41;
    private final int SABADO= 6;
    private final int DOMINGO=7;
    // atributos
    private String marca;
    private double altura;//metros
    private char sexo;
    private int longitudZancada;//centimetros
    private int totalPasosLaborables;
    private int totalPasosSabado;
    private int totalPasosDomingo;
    private double totalDistanciaSemana;//kilometros
    private double totalDistanciaFinSemana;//kilometros
    private int tiempo;//minutos
    private int caminatasNoche;//a partir de las 21
    
    /**
     * Inicializa el podómetro con la marca indicada por el parámetro.
     * El resto de atributos se ponen a 0 y el sexo, por defecto, es mujer
     */
    public Podometro(String marca) {
        this.marca=marca;
        sexo=MUJER;
    }

    /**
     * accesor para la marca
     *  
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Simula la configuración del podómetro.
     * Recibe como parámetros la altura y el sexo de una persona
     * y asigna estos valores a los atributos correspondiente.
     * Asigna además el valor adecuado al atributo longitudZancada
     * 
     * (leer enunciado)
     *  
     */
    public void configurar(double queAltura, char queSexo) {
        altura=queAltura;
        sexo=queSexo;
        if(queSexo==HOMBRE){
            longitudZancada=(int)Math.ceil(ZANCADA_HOMBRE*altura*100);
        } else{
            longitudZancada=(int)Math.floor(ZANCADA_MUJER*altura*100);
        }
        
    }

     /**
     *  Recibe cuatro parámetros que supondremos correctos:
     *    pasos - el nº de pasos caminados
     *    dia - nº de día de la semana en que se ha hecho la caminata 
     *              (1 - Lunes, 2 - Martes - .... - 6 - Sábado, 7 - Domingo)
     *    horaInicio – hora de inicio de la caminata
     *    horaFin – hora de fin de la caminata
     *    
     *    A partir de estos parámetros el método debe realizar ciertos cálculos
     *    y  actualizará el podómetro adecuadamente  
     *   
     *   (leer enunciado del ejercicio)
     */
    public void registrarCaminata(int pasos, int dia, int horaInicio,int horaFin) {
        int minutosInicio= (horaInicio/100)*60 + (horaInicio%100);
        int minutosFinal = (horaFin/100)*60+ (horaFin%100);
        
        if( horaInicio >=2100 || horaFin>2100){
            caminatasNoche++;
        }
        switch(dia){
            case 1:
            case 2:
            case 3:
            case 4:    
            case 5:
                totalPasosLaborables+=pasos;
                totalDistanciaSemana+=pasos*longitudZancada/100.0;
                break;
            case 6:
                totalPasosSabado+=pasos;
                totalDistanciaFinSemana+=pasos*longitudZancada/100.0;
                break;
            case 7:
                totalPasosDomingo+=pasos;
                totalDistanciaFinSemana+=pasos*longitudZancada/100.0;
                break;
  
        }
        if(minutosFinal<minutosInicio){
            tiempo+=(minutosFinal +1440) - minutosInicio;
        }else{
            tiempo+=minutosFinal - minutosInicio;
        }
    }
    
     /**
     * Muestra en pantalla la configuración del podómetro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
    public void printConfiguracion() {
        System.out.println("CONFIGURACION DEL PODOMETRO");
        System.out.println("***************************");
        System.out.println();
        System.out.println("Altura: "+ altura+"mtos");
        System.out.println("Sexo: "+sexo);
        System.out.println("Longitud zancada: "+ longitudZancada+" cm");
        

    }

    /**
     * Muestra en pantalla información acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstadísticas() {
        int horas = tiempo/60;
        int mins = tiempo % 60;
        System.out.println("ESTADISTICAS");
        System.out.println("***************************");
        System.out.println();
        System.out.println("Distancia recorrida toda la semana: "+totalDistanciaSemana+"km");
        System.out.println("Distancia recorrida fin de semana: "+ totalDistanciaFinSemana+"km");
        System.out.println();
        System.out.println("N pasos dias laborables: "+totalPasosLaborables);
        System.out.println("N pasos SABADO: "+totalPasosSabado);
        System.out.println("N pasos DOMINGO: "+totalPasosDomingo);
        System.out.println("N caminatas realazadas a partide de las 21h: "+caminatasNoche);
        System.out.println();
        System.out.println("Tiempo total caminando en la semana: "+horas+"h.y "+mins+"m.");
        System.out.println("dias con mas pasos caminados: "+diaMayorNumeroPasos());
    
    
    
    
    }   

   

    /**
     *  Calcula y devuelve un String que representa el nombre del día
     *  en el que se ha caminado más pasos - "SÁBADO"   "DOMINGO" o  "LABORABLES"
     */
    public String diaMayorNumeroPasos() {
        if(totalPasosLaborables>=totalPasosSabado && totalPasosLaborables>= totalPasosDomingo){
            return"LABORABLE";
        }else if(totalPasosSabado>=totalPasosDomingo){
            return"SABADO";
        }else {
            return"DOMINGO";
        }
         

    }
    
    
    /**
     * Restablecer los valores iniciales del podómetro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no varía
     *  
     */    
    public void reset() {
        totalPasosLaborables= 0;
        totalPasosSabado=0;
        totalPasosDomingo=0;
        totalDistanciaSemana=0;//kilometros
        totalDistanciaFinSemana=0;//kilometros
        tiempo=0;//minutos
        caminatasNoche=0;
        

    }

}
