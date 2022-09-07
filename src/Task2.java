import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {
            Scanner scanner  = new Scanner(System.in);
            System.out.println("Vendos gjatesine tuaj ne cm");
            int gjatesiaCM = scanner.nextInt();
            float gjatesiaM = (float)gjatesiaCM/100;
            System.out.println("Vendos peshen tende");
            float pesha = scanner.nextFloat();

            float bmi = pesha/(gjatesiaM*gjatesiaM);
            System.out.println("BMI juaj eshte: " + bmi);
            if(bmi>18.5 && bmi<24.9){
                System.out.println("Ju jeni ne peshe ideale");
            } else if(bmi<18.5){
                System.out.println("Ju jeni nen peshe");
            } else{
                System.out.println("Ju jeni mbi peshe");
            }

        }

        public static float calculateBMI(int gjatesia, float pesha){

            float gjatesiaM = (float)gjatesia/100;
            float bmi = pesha/(gjatesiaM*gjatesiaM);
            return bmi;
        }
    }
