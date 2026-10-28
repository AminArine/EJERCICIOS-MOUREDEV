import java.util.Scanner;

public class HuertoFamiliar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double METROCUADRADO =120;
        final double  METROVALLA=8.25;
        double ancho=0,largo=0,miembro=0,area=0,tajada=0,total=0,perimetro=0,valla=0,terreno=0;
        System.out.println("Introduce el largo del terreno :");
        largo=sc.nextDouble();
        System.out.println("Introduce el ancho del terreno :");
        ancho=sc.nextDouble();
        System.out.println("Introduce numero de miembros en la familia :");
        miembro=sc.nextDouble();
        area=largo*ancho;
        perimetro=largo*2+ancho*2;
        valla=perimetro *METROVALLA;
        terreno=area*METROCUADRADO;
        total=valla+METROCUADRADO*area;
        tajada=total/miembro;
        System.out.println("El perimetro es el siguiente :"+perimetro);
        System.out.println("El area es el siguiente :"+area);
        System.out.println("El coste de la valla es el siguiente :"+valla);
        System.out.println("El coste del terreno  :"+terreno);
        System.out.println("El total es de  :"+total);
        System.out.println("Por miembro :"+tajada);        

        sc.close();
    }
}