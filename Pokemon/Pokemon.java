import java.util.Random;
/**
 * Clase Pokemon: un pokemon con su tipo, vida, energía y tres poderes.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pokemon
{
    // TODO: declara los atributos (todos private):
    //   - nombre (String): nombre del pokemon. Ejemplo: "Squirtle".
    //   - tipo (String): "Agua", "Fuego" o "Tierra".
    //   - vida (int): puntos de vida. Cuando llega a 0, el pokemon pierde el combate.
    //   - energia (int): energía disponible para usar poderes.
    //   - poder1, poder2, poder3 (Poder): los tres poderes del pokemon.
    //     Recuerda: NO se pueden usar arrays, usa tres atributos separados.
    private String nombre;
    private String tipo;
    private int vida;
    private int energia;
    private Poder poder1;
    private Poder poder2;
    private Poder poder3;
    

    /**
     * Constructor con los cuatro datos del pokemon.
     */
    public Pokemon(String nombre, String tipo, int vida, int energia){
        // TODO: asigna los cuatro atributos con los valores recibidos.
        this.nombre= nombre;
        this.tipo = tipo;
        this.vida=vida;
        this.energia=energia;
        obtenerPoderes();
        // TODO: al final, llama al método obtenerPoderes().
    }

    /**
     * Constructor sin energía.
     */
    public Pokemon(String nombre, String tipo, int vida){
        // TODO: asigna nombre, tipo y vida con los valores recibidos.
        // TODO: la energía vale cuatro quintos de la vida (4 * vida / 5).
        this.nombre=nombre;
        this.tipo=tipo;
        this.vida=vida;
        energia= (4*vida/5);
        obtenerPoderes();
        // TODO: al final, llama al método obtenerPoderes().
    }

    /**
     * Constructor solo con nombre y tipo.
     */
    public Pokemon(String nombre, String tipo){
        // TODO: asigna nombre y tipo con los valores recibidos.
        // TODO: la vida vale 100 y la energía vale 80.
        this.nombre=nombre;
        this.tipo=tipo;
        vida=100;
        energia=80;
        obtenerPoderes();
        // TODO: al final, llama al método obtenerPoderes().
    }

    /**
     * Crea los tres poderes del pokemon según su tipo.
     */
    public void obtenerPoderes(){
        // TODO: crea un objeto Random.
        Random rand= new Random();
        int ataq1=rand.nextInt(50) + 51;
        int ataq2=rand.nextInt(30) + 71;
        int ataq3=rand.nextInt(15) + 86;
    switch(tipo){
        case "Fuego":
            poder1 = new Poder("llamarada",tipo,ataq1);
            poder2 = new Poder("lanzallamas",tipo,ataq2);
            poder3 = new Poder("lluvia ignea",tipo,ataq3);
            return ;
        case "Agua":
            poder1 = new Poder("Empapar",tipo,ataq1);
            poder2 = new Poder("Chorro de vapor",tipo,ataq2);
            poder3 = new Poder("Hidrocañon",tipo,ataq3);            
            return; 
        case "Tierra":
            poder1 = new Poder("Ataque arena ",tipo,ataq1);
            poder2 = new Poder("Disparo lodo",tipo,ataq2);
            poder3 = new Poder("Bomba fango ",tipo,ataq3);
            return;    
        default :
            System.out.println("Error, elegir un tipo disponible");
            return;
    }
        // TODO: usa un switch sobre el atributo tipo para crear poder1, poder2 y poder3.
        //       Usa el constructor de Poder con tres parámetros (nombre, tipo, potencia).
        //       La potencia es aleatoria:
        //
        //       Tipo     | poder1 (51 a 100) | poder2 (71 a 100) | poder3 (86 a 100)
        //       ---------+-------------------+-------------------+------------------
        //       "Fuego"  | Llamarada         | Lanzallamas       | Lluvia Ígnea
        //       "Agua"   | Empapar           | Chorro de vapor   | Hidrocañón
        //       "Tierra" | Ataque arena      | Disparo lodo      | Bomba fango
        //
        //       Pista: random.nextInt(50) + 51 devuelve un número entre 51 y 100.
        // TODO: en el default del switch, muestra un mensaje de error por consola
        //       indicando que el tipo no está disponible.
    }

    public String getNombre(){
        // TODO: devuelve el nombre del pokemon.
        return nombre;
    }

    public String getTipo(){
        // TODO: devuelve el tipo del pokemon.
        return tipo;
    }

    public int getVida(){
        // TODO: devuelve la vida del pokemon.
        return vida;
    }

    public int getEnergia(){
        // TODO: devuelve la energía del pokemon.
        return energia;
    }

    public Poder getPoder1(){
        // TODO: devuelve el primer poder.
        return poder1;
    }

    public Poder getPoder2(){
        // TODO: devuelve el segundo poder.
        return poder2;
    }

    public Poder getPoder3(){
        // TODO: devuelve el tercer poder.
        return poder3;
    }

    /**
     * Resta vida al pokemon. La vida nunca baja de 0.
     */
    public void recibirDanio(int danio){
        if(danio==0){
            return;
        }
        vida-=danio;
        if(vida<0){
            vida=0;
        }
        // TODO: si la vida queda por debajo de 0, déjala en 0.
    }

    /**
     * Resta al pokemon la energía que consume el poder usado.
     */
    public void consumirEnergia(int cantidad){
        // TODO: resta la cantidad a la energía.
        energia-=cantidad;
        
    }

    /**
     * Suma energía al pokemon.
     */
    public void ganarEnergia(int cantidad){
        // TODO: suma la cantidad a la energía.
        energia +=cantidad;
    }

    /**
     * Devuelve true si el pokemon se ha quedado sin vida.
     */
    public boolean estaDebilitado(){
        // TODO: devuelve true si la vida es 0 o menos, y false en caso contrario.
        return (vida<=0);
        
    }
}
