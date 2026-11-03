import java.util.*;
public class Podometro_main
{
    public static void main(String []args){
        Podometro uno = new Podometro("Asus");
        // uno.registrarCaminata(100,6,2200,2350);
        int opcion =0;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("*PODOMETRO*");
            System.out.println("1. CONFIGURAR ");
            System.out.println("2. REGISTRAR");
            System.out.println("3. MOSTRAR CONFIGURACION y ESTADISTICAS");
            System.out.println("4. REINICIAR INDICADORES");
            System.out.println("0. SALIR");
            int eleccion=scan.nextInt();
            opcion=eleccion;
            
            switch(opcion){
                case 1:
                    System.out.println("indicar altura");
                    double regAltura= scan.nextDouble();
                    System.out.println("indicar genero (M/H)");
                    char regGenero= scan.next().charAt(0);
                    uno.configurar(regAltura,regGenero);
                    System.out.println("Agregando configuracion ....");
                    break;
                case 2:
                    System.out.println("registrar pasos");
                    int regPasos = scan.nextInt();
                    System.out.println("registrar dia(formato martes=2)");
                    int regDia = scan.nextInt();
                    System.out.println("registrar hora de inicio(formato 21:00 = 2100)");
                    int regHoraInicio = scan.nextInt();
                    System.out.println("registrar hora de fin(formato 21:00 = 2100)");
                    int regHoraFin = scan.nextInt();
                    uno.registrarCaminata(regPasos, regDia, regHoraInicio,regHoraFin);
                    System.out.println("Registro EXITOSO!");
                    break;
                case 3:
                    uno.printConfiguracion();
                    uno.printEstadísticas();
                    break;
                case 4:
                    uno.reset();
                    System.out.println("Reiniciando a valores predeterminados.....");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
        }while(opcion!=0);
    }
}
