import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje fjali");
        String fjaliPerdouesi = scanner.nextLine();

        //menyra e pare
        /*String[] textIDhene = fjaliPerdouesi.split(" ");
        String perseritje = "";
        for(String st: textIDhene){
            //String perseritje =(st + " ").repeat(2); //se di pse nuk e njeh repeat
            perseritje += " " + st + " " + st;
        }
        System.out.println(perseritje);*/

        //menyre tjeter
        String fjaliaEPerseritur = repeatSentence(fjaliPerdouesi);

        System.out.println(fjaliaEPerseritur);
    }

    private static String repeatSentence(String fjaliPerdoruesi){
        String[] fjaliaArray = fjaliPerdoruesi.split(" ");
        String perseritje = "";
        for(String st:fjaliaArray){
            perseritje += st + " " + st  + " ";
        }
        return perseritje;

       /* String str = "geekss@for@geekss";
        String[] arrOfStr = str.split(" ", 9);

        for (String a : arrOfStr)
            System.out.println(a);
    */
    }
}

