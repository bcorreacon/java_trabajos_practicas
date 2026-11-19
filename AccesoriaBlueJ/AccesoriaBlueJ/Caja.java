public class Caja {

    private int numeroVentas;
    private int numeroBolsosVendidos;
    private int numeroCinturonesVendidos;
    private int numeroSombrerosVendidos;
    private double facturacion;

    /* TODO ++++++++++++++++++++++++++
    DESARROLLE EL CONSTRUCTOR QUE SE PIDE
     */
    public Caja(){
        numeroVentas=0;
        numeroBolsosVendidos=0;
        numeroCinturonesVendidos=0;
        numeroSombrerosVendidos=0;
        facturacion=0.0;
    }


    //+++++++++++++++++++++++++++++++++

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public int getNumeroSombrerosVendidos() {
        return numeroSombrerosVendidos;
    }

    public int getNumeroBolsosVendidos() {
        return numeroBolsosVendidos;
    }

    public int getNumeroCinturonesVendidos() {
        return numeroCinturonesVendidos;
    }

    public double getFacturacion() {
        return facturacion;
    }

    /* TODO **************************
    DESARROLLE LOS METODOS QUE SE PIDEN
     */
    public void actualizarNumeroVentas(){
        numeroVentas=numeroBolsosVendidos+numeroCinturonesVendidos+numeroSombrerosVendidos;
    }
    public void aumentarVentasBolsos(int ventas){
        numeroBolsosVendidos+=ventas;
    }
    public void aumentarVentasCinturones(int ventas){
        numeroCinturonesVendidos+=ventas;
    }
    public void aumentarVentasSombreros(int ventas){
        numeroSombrerosVendidos+=ventas;
    }
    public void aumentarFacturacion(double dinero){
        facturacion+=dinero;
    }
    public double obtenerIVAAcumulado(){
        return facturacion*Constantes.IVA/100;
    }
    //********************************


}
