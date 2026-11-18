import java.util.Random;
/**
 *  
 * @author  
 *  
 */
public class BuclesTurno1 {
    Random rand = new Random();
    /**
     * Constructor  
     */
    public BuclesTurno1()    {
        
    }
     /**
     *  Devuelve una cadena formada por n caracteres c
     *  Asumimos n positivo
     *  Hacer con for
     */
    public String generarCadena(int n, char c)    {
        //TODO
        String resultado="";
        c ='+';
        for(int i=1;i<=n;i++){
                resultado = resultado + c;
        }
        return resultado;
    }
    
    
    
    /**
    *  Calcula y devuelve la suma de los divisores propios de un nº.
    *  Los divisores propios de un nº son todos los divisores menores que él, incluidos él mismo y el uno.
    */
    public int sumarDivisoresPropios(int numero){
        //TODO
        int sumaDivisores=0;
        for(int i=numero - 1;i>=1;i--){
            if(numero%i==0){
                sumaDivisores+= i;
            }
        }
        return sumaDivisores;
    }
    /**
     *  Generar nºs aleatorios entre 0 y 100 (incluidos).
     *  Parar cuando salga un 0 o cuando se hayan generado un máximo de 15 valores
     *  Por cada nº se muestra:
     *      - la suma de sus divisores propios
     *      - el tipo de nº que es: "Abundante" si la suma de los divisores propios  es mayor que el nº  
     *              (12, 18, 20 son abundantes)
     *             "Deficiente" si la suma de los divisores propios es menor que el nº 
     *             (7, 8, 10 son deficientes)
     *             "Perfecto" si el nº es igual a la suma de los divisores propios  
     *                  (6 y 28 son perfectos)
     *       - si el nº es abundante al lado se muestra el carácter +
     *       - si el nº es deficiente al lado se muestra el carácter -
     *       - si el nº es perfecto al lado no se muestra nada
     *           
     *  
     */
    public void generarNumeros()    {
        //TODO
        String condicion="";
        int contador=0;
        int numeroAleatorio=0;
        System.out.println("N Suma Tipo");
        while(numeroAleatorio!=0 || contador<=15){
            numeroAleatorio=rand.nextInt(101);
            int suma=sumarDivisoresPropios(numeroAleatorio);
            if(suma>numeroAleatorio){
                condicion="Abundante";
            }else if(suma<numeroAleatorio){
                condicion="deficiente";
            }else if(suma==numeroAleatorio){
                condicion="Perfecto";
            }
            System.out.println(numeroAleatorio+" "+sumarDivisoresPropios(numeroAleatorio)+" "+condicion);
            System.out.print("  "+generarCadena(int n,'+'))
            contador++;
        }
    }

   


 
}
