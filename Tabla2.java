import java.util.Scanner;

public class Tabla2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla ,i=10;
        System.out.println("Dime tabla de multiplicar :");
        tabla=sc.nextInt();
        while(i>=0){

        	System.out.println(tabla +" *"+i+"="+(tabla*i));
        	i++;
        }
        

        sc.close();
    }
}