import java.util.Scanner;

public class  ClasificaciónPorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte edad;

    do {
        System.out.println("Introduce edad: ");
        edad=sc.nextByte();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Resultado: Niño ");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Resultado: Adolescente ");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Resultado:Adulto ");
        } else if (edad >= 65) {
            System.out.println("Resultado: Mayor ");
        }

    }while(edad<0);
        sc.close();
    }
}