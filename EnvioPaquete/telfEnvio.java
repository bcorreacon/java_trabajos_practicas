
/**
 * Write a description of class telfEnvio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class telfEnvio
{
    public static void main(String[] args){
        Paquete paquete1= new Paquete();
        Paquete paquete2= new Paquete();
        
        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();
        
        Dimension dim3 = new Dimension(50, 50, 70);
        Paquete paquete3= new Paquete(dim3,13);
        
        envio.addPaquete(paquete3);
        envio.print();
        
        paquete copiaPaquete2 =paquete.obtenerCopia();
        envio.addPaquete(copiaPaquete2);
    }
}