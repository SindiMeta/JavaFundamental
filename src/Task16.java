import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje date ne formatin yyyy-MM--dd: ");
        String data = scanner.nextLine();
        LocalDate dt = LocalDate.parse(data);
        LocalDate dataSot = LocalDate.now();
        long ditetENgelura = ChronoUnit.DAYS.between(dataSot, dt);
        System.out.println("Ditet e ngelura: " + ditetENgelura);
    }
}
