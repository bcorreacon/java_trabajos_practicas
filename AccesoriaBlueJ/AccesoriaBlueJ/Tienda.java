public class Tienda {

    private Almacen almacen;
    private Caja caja;

    /* TODO ******************************
    DESARROLLE LOS CONSTRUCTORES QUE SE PIDEN
     */
    public Tienda(){
        almacen = new Almacen();
        caja= new Caja();
    }
    public Tienda(int numeroBolsos,int numeroSombreros, int numeroCinturones){
        almacen= new Almacen(numeroBolsos,numeroSombreros,numeroCinturones);
        caja= new Caja();
    }
    //*************************************

    public Almacen getAlmacen() {
        return almacen;
    }

    public Caja getCaja() {
        return caja;
    }

       /* TODO ****************************
    DESARROLLE LOS METODOS QUE SE PIDEN
     */
    public void realizarVenta(Accesorios venta){
        
        venderBolsos(venta.getNumBolsos());
        venderCinturones(venta.getNumSombreros());
        venderSombreros(venta.getNumCinturones());
    }
    public void cargarAccesorios(Accesorios carga){
        almacen.almacenarBolsos(carga.getNumBolsos());
        almacen.almacenarCinturones(carga.getNumCinturones());
        almacen.almacenarSombreros(carga.getNumSombreros());
    }
    public void venderBolsos(int numBolsos){
        if(almacen.eliminarBolsos(numBolsos)){
            caja.aumentarVentasBolsos(numBolsos);
            
        }else{
            System.out.print("No se ha podido ejecutar la operacion de venta");
        }
    }
    public void venderCinturones(int numCinturones){
        if(almacen.eliminarCinturones(numCinturones)){
            caja.aumentarVentasBolsos(numCinturones);
            
        }else{
            System.out.print("No se ha podido ejecutar la operacion de venta");
        }
    }
    public void venderSombreros(int numSombreros){
        if(almacen.eliminarSombreros(numSombreros)){
            caja.aumentarVentasSombreros(numSombreros);
            
        }else{
            System.out.print("No se ha podido ejecutar la operacion de venta");
        }
    }

    //**************************************

}
