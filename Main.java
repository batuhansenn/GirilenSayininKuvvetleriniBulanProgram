import javax.net.ssl.SSLContextSpi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz: ");
        n = inp.nextInt();

        for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5){
            System.out.println(i +"\t" +  j);
        }
    }

}