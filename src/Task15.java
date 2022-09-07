import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni numrat");
        int[] numrat = new int[10];
        for(int i=0; i<numrat.length; i++){
            numrat[i] = scanner.nextInt();
        }
        int n = getLongestSequence(numrat);
        System.out.println("Sekuenca me e gjate " + n);
    }

    public static int getLongestSequence(int[] numrat) {
        int longest = 0;
        int temp = 0;
        for(int i=0; i<numrat.length-1; i++){
            if(numrat[i]< numrat[i]+1){
                longest++;
            }
            else{
                if(longest>1)
                    temp = longest;
                longest = 0;
            }
        }
        if(longest<temp)
            longest = temp;

        if(longest>0)
            longest++;

        return longest;
    }
}
