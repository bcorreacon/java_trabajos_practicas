public class Almacen {

    private int numeroBolsos;
    private int numeroCinturones;
    private int numeroSombreros;
    
    /* TODO ++++++++++++++++++++++++++
    DESARROLLE LOS CONSTRUCTORES QUE SE PIDEN
     */
    // ++++++++++++++++++++++++++++++++
    public Almacen(){
        numeroBolsos=0;
        numeroCinturones=0;
        numeroSombreros=0;
    }
    public Almacen(int numeroBolsos,int numeroCinturones, int numeroSombreros){
        this.numeroBolsos=numeroBolsos;
        this.numeroCinturones=numeroCinturones;
        this.numeroSombreros=numeroSombreros;
    }
    public int getNumeroBolsos() {
        return numeroBolsos;
    }

    public void setNumeroBolsos(int numeroBolsos) {
        this.numeroBolsos = numeroBolsos;
    }

    public int getNumeroCinturones() {
        return numeroCinturones;
    }

    public void setNumeroCinturones(int numeroCinturones) {
        this.numeroCinturones = numeroCinturones;
    }

    public int getNumeroSombreros() {
        return numeroSombreros;
    }

    public void setNumeroSombreros(int numeroSombreros) {
        this.numeroSombreros = numeroSombreros;
    }

        /* TODO ++++++++++++++++++++++++++
    DESARROLLE LOS METODOS QUE SE PIDEN
     */
    public boolean almacenarBolsos(int numero){
        
        if(numeroBolsos+numero<Constantes.CAPACIDAD_BOLSOS){
            numeroBolsos=numeroBolsos+numero;
            return true;
        }else {
            System.out.println("Se excede la capacidad máxima");
            return false; 
        }
    }
    public boolean almacenarCinturones(int numero){
        if(numeroCinturones+numero<Constantes.CAPACIDAD_CINTURONES){
            numeroCinturones=numeroCinturones+numero;
            return true;
        }else {
            System.out.println("Se excede la capacidad máxima");
            return false; 
        }
    }
    public boolean almacenarSombreros(int numero){
        if(numeroSombreros+numero<Constantes.CAPACIDAD_SOMBREROS){
            numeroSombreros=numeroSombreros+numero;
            return true;
        }else {
            System.out.println("Se excede la capacidad máxima");
            return false; 
        }
    }
    public boolean eliminarBolsos( int numero){
        if(numeroBolsos-numero>=0){
            numeroBolsos -= numero;
            return true;
        }else{
            System.out.println("No hay existencias");
            return false;
        }
    }
    public boolean eliminarSombreros( int numero){
        if(numeroSombreros-numero>=0){
            numeroSombreros -= numero;
            return true;
        }else{
            System.out.println("No hay existencias");
            return false;
        }
    }
    public boolean eliminarCinturones( int numero){
        if(numeroCinturones-numero>=0){
            numeroCinturones -= numero;
            return true;
        }else{
            System.out.println("No hay existencias");
            return false;
        }
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("**** INFORMACION DEL ALMACEN ****");
        str.append("  Numero de bolsos: "+numeroBolsos);
        str.append("  Numero de sombreros: "+numeroSombreros);
        str.append("  Numero de cinturones: "+numeroCinturones);
        str.append("*".repeat(33));
        return str.toString();
    }
    // ++++++++++++++++++++++++++++++++



    public void mostrarInfoAlmacen(){
        System.out.print(toString());
    }
}
