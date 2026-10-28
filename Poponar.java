import java.util.Scanner;

public class Poponar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<10;i++){
        	System.out.println("MIGUEL ES UN PÒPONAR");
        }
        System.out.println("DIME QUE TABLA TE SACO :");
        int numero=sc.nextInt();
          for(int i=1;i<11;i++){
          	System.out.println(numero +"*"+i+" = "+numero*i);
          }

        sc.close();
    }
}