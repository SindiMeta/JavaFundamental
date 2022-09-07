import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Jepni nje numer");
        int numri=scanner.nextInt();
        int paraardhes=0,aktual=1, fibonaci=0;

        for(int i=1; i<numri; i++){
            fibonaci=paraardhes+aktual;
            paraardhes=aktual;
            aktual=fibonaci;
        }
        System.out.println(fibonaci);
    }
}
