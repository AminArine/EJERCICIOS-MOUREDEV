import java.util.Scanner;

public class  ConteoDeDivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            /* Código
            Introduce un número: 12
            Divisores: 1 2 3 4 6 12
            Total: 6 divisores */
        int numero, divisores=0;
        System.out.println("Introduce un numero :");
        numero = sc.nextInt();
        System.out.println("Divisores: ");
        for (int i=1;i<numero;i++){
            if(numero%i==0){
                System.out.print(i+" ");
                divisores++;
            }
        }
        System.out.println("                   ");
        System.out.println("Total : "+divisores);

        sc.close();
    }
}