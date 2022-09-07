import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje numer");
        int nr = scanner.nextInt();

        float shuma = 0;
        for(int i=1; i<=nr; i++){
            shuma = shuma + (float)1/i;
        }
        System.out.println(shuma);
    }
}
