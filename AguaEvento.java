import java.util.Scanner;

public clase AguaEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Short lotes=0,equipos=0;
        final short BOTELLAS=15;
        System.out.print("Introduce cuántos cajas han llegado :");
        lotes=sc.nextShort();
        System.out.print("Introduce cuántos equipos hay en el centro :");
        equipos=sc.nextShort();


        System.out.println("Total de Botellas : "+(BOTELLAS*lotes) +
    	"\n Por equipo : "+((BOTELLAS*lotes)/equipos) +
    	"\n Sobran :"+((BOTELLAS*lotes)%equipos)+ );



        sc.close();
    }
}