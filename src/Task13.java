import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje germe te alfabetit latin: ");
        char c1 = sc.next().toLowerCase().charAt(0);
        System.out.println("Vendosni nje germe te alfabetit latin");
        char c2 = sc.next().toLowerCase().charAt(0);

        int k1 = c1;
        int k2 = c2;
        System.out.println("Karakteri 1: " + k1);
        System.out.println("Karakeri 2: "  + k2);
        System.out.println(k2-k1-1);
    }
}
