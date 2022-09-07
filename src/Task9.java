import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje numer");
        int numer = scanner.nextInt();
        int shuma = 0;
        do{
            int mbetja = numer %10;
            shuma = shuma + mbetja;
            numer = (numer-mbetja)/10;

        }
        while(numer>0);
        System.out.println(shuma);
    }
}
