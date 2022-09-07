import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task17 {

    public static void main(String[] args) {
        String patternP = "[A-aC-cH-h][O-o]{1,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje fjale");
        String word = scanner.nextLine();
        Pattern pattern = Pattern.compile(patternP);
        Matcher matcher = pattern.matcher(word);
        boolean patternEshteISakte = matcher.matches();
        if (patternEshteISakte) {
            System.out.println("Ju teshtite");
        } else {
            System.out.println("Ju nuk teshtite");
        }
    }
}

