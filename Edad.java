import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Dime tu edad  :");
        int numero=sc.nextInt();
          for(int i=1;i<=numero ;i++){
          	System.out.println("Has cumplido :"+i);
          }

        sc.close();
    }
}