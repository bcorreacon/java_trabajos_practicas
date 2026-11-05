import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - 
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        dimension = new Dimension(40.0,30.0,50.0);
        peso= 8.0;

    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        dimension = new Dimension(alto,ancho,largo);
        generador= new Random();
        peso=generador.nextInt(2,9);
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        this.dimension=dimension;
        this.peso=peso;
    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double calcularVolumen() {
       
       return this.dimension.getAlto()*this.dimension.getAncho()*this.dimension.getLargo();
        
    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double calcularPesoVolumetrico() {
        
       return calcularVolumen()/5000;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
       if(peso>calcularPesoVolumetrico()){
       return peso;
        }else{
            return calcularPesoVolumetrico();
        }
    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete obtenerCopia() {
        
       return new Paquete(this.dimension,this.peso);

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Descripcion del paquete");
        str.append("Alto:     "+dimension.getAlto()+"(cm)\n");
        str.append("Ancho:     "+dimension.getAncho()+"(cm)\n");
        str.append("Largo:     "+dimension.getLargo()+"(cm)\n");
        str.append("Peso real:     "+this.peso+"(kg)\n");
        str.append("volumen:  "+calcularVolumen()+"(cm)\n");
        str.append("Peso volumentrico:     "+calcularPesoVolumetrico()+"(cm)\n");
       return str.toString();

    }
    
    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }

    

}
