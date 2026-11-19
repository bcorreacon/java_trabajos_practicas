import java.util.Scanner;

public class Ejecucion {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Creando almacen nuevo...");
        Tienda accesoria = new Tienda(18, 32, 22);

        realizarVariasVentas(accesoria);

        int opcion = 0;
        do{
            System.out.println("********* MENÚ ACCESORIA *******");
            System.out.println("1 - Ver almacen");
            System.out.println("2 - Vender accesorios");
            System.out.println("3 - Recibir cargamento");
            System.out.println("4 - Ver facturación");
            System.out.println("5 - Ver IVA");
            System.out.println("6 - Ver datos de ventas");
            System.out.println("7 - Salir");
            System.out.println("********************************");

            opcion = teclado.nextInt();

              /* TODO **************************
            DESARROLLE A CONTINUACION LA LOGICA QUE SE PIDE
            */
            switch(opcion){
                case 1:
                    verAlmacen(accesoria);
                    break;
                case 2:
                    break;    
                case 3:
                    break;   
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;    
                    
            }
            //**********************************

        }
        while (opcion != 7);
    }

        /* TODO ****************************
    DESARROLLE LOS METODOS QUE SE PIDEN
     */


    //**************************************

    private static void realizarVariasVentas(Tienda tienda){
        tienda.realizarVenta(new Accesorios(12, 22, 15));
    }
    private static void verAlmacen(Tienda tienda){
        tienda.getAlmacen().mostrarInfoAlmacen();
    }
    private static void venderAccesorios(Tienda tienda){
        System.out.println("Indique el numero")
    }
}