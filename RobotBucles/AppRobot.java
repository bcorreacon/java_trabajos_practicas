
/**
 *  
 * Punto de entrada a la aplicación
 * 
 * @author -  
 */
public class AppRobot
{
     

    /**
     *      • crea un robot de nombre “R2D2·, posición inicial (50,50) y dirección sur.
     *      • muestra el estado del robot
     *      • mueve el robot una distancia de 12
     *      • mueve el robot una distancia de 10
     *      • cambia la dirección del robot
     *      • mueve el robot una distancia de 7, 2 y 3
     *      • muestra el estado final del robot
     *      • crea una réplica del robot y muéstrala
     */
    public static void main(String[] args)
    {
         Robot rob = new Robot("R2D2",50,50, new Direccion(2));
         System.out.println(rob.toString());
         System.out.println();
         rob.mover(12);
         rob.mover(10);
         rob.cambiarDireccion();
         rob.mover(7);
         rob.mover(2);
         rob.mover(3);
         System.out.println();
         System.out.println("Situacion final");
         System.out.println(rob.toString());
         System.out.println();
         System.out.println("Replicada del robot");
         System.out.println(rob.obtenerReplica());
         
    }
}
