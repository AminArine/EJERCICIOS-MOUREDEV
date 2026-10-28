import java.util.Scanner;

public class RecogerChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char  letra='a';
        System.out.println ("Dime una Letra");
        letra=sc.next().charAt(0);
        System.out.print("Has introducido la letra :"+letra);

        sc.close();
    }
}