import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje numer pozitiv");
        int nr = scanner.nextInt();
        for(int i=2; i<nr; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                    break;
                if(i-j==1)
                    System.out.println(i + " Eshte prim");
            }
        }
    }
}
