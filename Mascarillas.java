import java.util.Scanner;

public class Mascarillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Short lotes=0,equipos=0;
        final short paquete=50;
        System.out.print("Introduce cuántos paquetes han llegado :");
        lotes=sc.nextShort();
        System.out.print("Introduce cuántos consultorios hay en el centro :");
        consultorio=sc.nextShort();


        System.out.println("Total de Mascarillas: "+(BOTELLAS*lotes) +
    	"\n Por consultorio : "+((BOTELLAS*lotes)/equipos) +
    	"\n Sobran :"+((BOTELLAS*lotes)%equipos)+ );



        

        sc.close();
    }
}