import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendosni nje fjale");
        String word = scanner.nextLine();
        String wordMax = "";
        do {
            if(word.isEmpty()) {
                System.out.println("No text provided");
            }

            System.out.println("Vendosni nje fjale");
            word = scanner.nextLine();
            if(wordMax.length()<word.length() && !word.equals("Enough!")){
                wordMax = word;
            }

        }
        while(!word.equals("Enough!"));
        System.out.println("Ju vendoset fjalen enough!");

        scanner.close();
        System.out.println(wordMax);
    }
}
