import java.util.Scanner;


    public class Task1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vendosni nje numer per diametrin");
            int diameter = scanner.nextInt();

            float perimeter = (float)Math.PI * diameter;
            System.out.println("Perimetri i rrethit tuaj eshte: " + perimeter);

        }
    }
