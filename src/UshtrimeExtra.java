import java.util.Scanner;

public class UshtrimeExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ushtrimi1");
        System.out.println("---------Array shume dimensionale----------");
        String[][] menu = new String[3][];
        menu[0] = new String[]{"Spageti me tartuf", "Spageti me fruta deti", "Spageti"};
        menu[1] = new String[]{"Pica chicken barbeque", "Pica Margarita"};
        menu[2] = new String[]{"Cheesecake", "Bakllava"};

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu " + (i + 1));
            String[] rreshtiAktual = menu[i];
            for (int j = 0; j < rreshtiAktual.length; j++) {
                System.out.println("\t" + (j + 1) + " - " + rreshtiAktual[j]);
            }
        }

        System.out.println("Zgjidhni menune qe deshironi");
        int menuEPerzgjedhur = scanner.nextInt();

        //menuja e zgjedhur
        String[] menuZgj = menu[menuEPerzgjedhur - 1];
        for (int m = 0; m < menuZgj.length; m++) {
            if(menuEPerzgjedhur<=menuZgj.length) {

                System.out.println("Produkti " + (m + 1));
                System.out.println(menuZgj[m]);
            }
            else{
                System.out.println("Nuk ka menu te tille");
            }

        }
        System.out.println("Zgjidhni produktin qe deshironi nga menuja");
        int produktIPerzgjedhur = scanner.nextInt();

        if(produktIPerzgjedhur <= menuZgj.length) {
            System.out.println(menuZgj[produktIPerzgjedhur - 1]);
        }
        else{
            System.out.println("Ky produkt nuk eshte ne menu");
        }

                //ushtrimi 2
        System.out.println("Ushtrimi 2");

        System.out.println("Vendosni nje numer te plote");
        int numer = scanner.nextInt();
        for (int i = 1; i <= numer; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

                //ushtrimi 3
        System.out.println("Ushtrimi 3");

        int number2 = 4;
        for (int i = 1; i <= number2; i++) {
            for (int j = 1; j <= number2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}


