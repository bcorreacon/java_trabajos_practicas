
/**
 *  Punto de entrada a la aplicación
 * 
 * @author - 
 *  
 */
public class AppPersonaje
{

    /**
     *      • crea un Personaje de nombre “Super Mario·, posición inicial (15,40) y movimiento hacia arriba.
     *      • muestra el estado del personaje
     *      • mueve el personaje 2 veces 
     *      • muestra el estado del personaje
     *      • cambia la dirección de movimiento del personaje
     *      • mueve el personaje otras 2 veces  
     *      • muestra el estado del personaje
     *      •  
     *      • crea una copia del personaje actual y muéstrala
     */
    public static void main(String[] args)
    {
        //TODO
        Personaje sup = new Personaje("Super Mario",15,40,new Movimiento(2));
        System.out.println(sup.toString());
        sup.mover();
        sup.mover();
        System.out.println();
        System.out.println(sup.toString());
        sup.cambiarMovimiento();
        sup.mover();
        sup.mover();
        System.out.println();
        System.out.println(sup.toString());
        
    }
}
