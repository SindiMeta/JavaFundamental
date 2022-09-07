import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni numrin e pare");
        float nr1 = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Vendosni nje simbol");
        String veprimi = scanner.nextLine();

        System.out.println("Vendosni numrin e dyte");
        float nr2 = scanner.nextInt();

        float rezultati = 0;
        boolean veprimiISakte = true;
        switch (veprimi){
            case "+": rezultati = nr1+nr2;
                break;
            case "-": rezultati = nr1-nr2;
                break;
            case "*": rezultati = nr1*nr2;
                break;
            case "/": rezultati = nr1/nr2;
                break;
            default: {
                System.out.println("Vendosni nje veprim te sakte");
                veprimiISakte = false;
            }
            break;
        }
        if(veprimiISakte)
            System.out.println(rezultati);
    }
}
