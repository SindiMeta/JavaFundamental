import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje fjale");
        String fjalaPerdoruesit = scanner.nextLine();
        char[] vektori = fjalaPerdoruesit.toCharArray();
        double counter = 0;
        for(char i:vektori){
            if(Character.isSpaceChar(i)){
                counter+=1;
            }
        }
        double percentage = (counter/fjalaPerdoruesit.length())*100;
        System.out.println(counter);
        System.out.println("Perqindja eshte " + percentage);
    }
}
