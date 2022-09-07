import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Vendosni nr a");
            int a = scanner.nextInt();

            System.out.println("Vendosni nr b");
            int b = scanner.nextInt();

            System.out.println("Vendosni nr c");
            int c = scanner.nextInt();

            int dallor = (b*b) - 4*a *c;
            System.out.println("Dallori eshte: " + dallor);
            if(dallor<0){
                System.out.println("Dallor negative");
            }
            else {
                float x1 = (float) ((-b) - Math.sqrt(dallor))/(2*a);
                float x2 = (float) ((-b) + Math.sqrt(dallor))/(2*a);
                if(x1==x2){
                    System.out.println("Ekuacioni ka nje zgjidhje" + x1);
                }
                else{
                    System.out.println("Ekuacioni ka dy zgjidhje dhe jane: " + x1 + " " + x2);
                }
            }
        }
    }

