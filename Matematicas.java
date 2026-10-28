import java.util.Scanner;

public class Matematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero,base,exponente,potencia,raiz,redondeo;
        System.out.println("Introduce un número :");
        numero=teclado.nextDouble();
        //ejemplos de uso de la clase Math
        redondeo=Math.round(numero); //Redondeo
        raiz=Math.sqrt(numero); //raiz cuadrada
        System.out.println("Introduce la base de la potencia ");
        base=sc.nextDouble();
        System.out.println("Introduce el exponente de la potencia ");
        eponente=sc.nextDouble();
        potencia=Math.pow(base ,exponente)//POTENCIA DE BASE ELEVADO A EXPONENTE
        System.out.println(base +"elevado a "+exponente +"="+ potencia);



        sc.close();
    }
}