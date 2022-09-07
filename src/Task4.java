import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje numer pozitiv");
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++){
            if(i%3==0 && i%7==0)
                System.out.println("Fizz Buzz");
            else if(i%3==0)
                System.out.println("Fizz");    //mund edhe ti heqim kllapat meqe kemi vtm nje instruksion
            else if(i%7==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

    }
}
