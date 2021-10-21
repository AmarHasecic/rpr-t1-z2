package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    static int sumaCifara(int n)
    {
        int s=0;
        while(n!=0)
        {
            s=s+(n%10);
            n /= 10;
        }

        return s;
    }


    public static void main(String[] args) {

        System.out.println("Unesite granicu n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        for(int i=1; i<=n; i++)
        {
            if(i%sumaCifara(i)==0) System.out.print(i + " ");
        }


    }
}
