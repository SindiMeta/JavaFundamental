import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni numrat");
        int[] numbers = new int[10];

        for(int i=0; i<numbers.length; i++) {

            int numri = scanner.nextInt();
            numbers[i] = numri;
        }
        for(int j=0; j<numbers.length; j++){
            for(int k=j+1; k<numbers.length; k++){
                /*if(numbers[j] == numbers[k]){
                    System.out.println(numbers[k]);*/


                int n1 = numbers[j];
                int n2 = numbers[k];
                if(n1==n2){
                    System.out.println(n2);
                }
            }
        }
    }
}
