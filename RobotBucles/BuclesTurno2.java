import java.util.Random;
/**
 *  
 * @author - 
 *  
 */
public class BuclesTurno2
{
    Random rand;
    /**
     * Constructor  
     */
    public BuclesTurno2()    {
        rand = new Random();
    }
    /**
     *  Devuelve una cadena formada por n asteriscos
     *  Asumimos n positivo
     *  Hacer con for
     */
    public String generarAsteriscos(int n)   {
        String resultado="";
        for(int i=1;i<=n;i++){
            resultado = resultado +"*";
        }
        return resultado;
    }      
    /**
        genera nºs aleatorios en el intervalo [min, max]  (incluidos).
        El proceso termina cuando sale el valor min o cuando se han generado un máximo de 20 valores.
        Al lado de cada nº se escribe una cadena con tantos asteriscos como indique el número de múltiplos de 3 que existan entre el min y él incluidos.
        En la tercera columna se deberá mostrar la suma de estos múltiplos de 3.
        Entre columnas se deberá tabular.
        Usa bucles while.
     */
    
    public void generarAleatorios(int min, int max)    {
        int contador=0;
        int numeroAlt;
        do{
            numeroAlt = rand.nextInt(min,max+1);
            int suma=0;
            int contadorAst =0;
            for(int j=min;j<=numeroAlt;j++){
                if(j%3==0){
                    suma+=j;
                    contadorAst++;
                }
            }
            System.out.println(numeroAlt+"\t" + generarAsteriscos(contadorAst)+"\t"+suma);
            contador++;
        }while(numeroAlt !=min && contador < 20);
    }
}