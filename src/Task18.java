import java.util.Random;
import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Random random = new Random();
        int nrRandom = random.nextInt(101);
        System.out.println(nrRandom);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje numer");
        int number = scanner.nextInt();


        if(number<nrRandom){
            System.out.println("Too little");
        }
        else if(number>nrRandom){
            System.out.println("Too much");
        } else {
            System.out.println("Congratulations");
        }

        /*
          Random r = new Random();
        int nrRandom = r.nextInt(101);
        System.out.println(nrRandom);
        Scanner scanner=new Scanner(System.in);
        int numri;
        do{
            numri=scanner.nextInt();
            if(numri>nrRandom){
                System.out.println("Too high");
            }
            else if(numri<nrRandom){
                System.out.println("Too little");
            }
        }
        while(nrRandom!=numri);
        System.out.println("Congratulations");

        */

    }
}
