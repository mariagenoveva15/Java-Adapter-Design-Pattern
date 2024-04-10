import java.util.InputMismatchException;
import java.util.Scanner; // user input

import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        OldList object=new OldList();

        StackAdapter stackAdapter=new StackAdapter(object);

        boolean _DeLaNasuMare=false;

        while (true) {

            try {
                int element;
                Scanner scanner = new Scanner(System.in);
                System.out.println(" ");
                System.out.print("Introduceti elementul: ");
                element=scanner.nextInt();
                stackAdapter.push(element);
                while (element != 0) {
                    System.out.print("Introduceti elementul: ");
                    element = scanner.nextInt();
                    stackAdapter.push(element);
                }

                stackAdapter.afisare();
                stackAdapter.cautareElement(6);
                stackAdapter.cautareElement(3);
                stackAdapter.pop();
                stackAdapter.afisare();
                stackAdapter.pop();
                stackAdapter.afisare();
                stackAdapter.pop();
                stackAdapter.afisare();
                stackAdapter.pop();
                stackAdapter.afisare();

            } catch (IllegalStateException e) {

                System.out.println("Exceptie: " + e.getMessage()); //afisez mesajul din exceptia aruncata
                e.printStackTrace(); //pentru necredinciosi, dovada ca exceptia se arunca
                sleep(50);

            } catch (InputMismatchException e) {

                System.out.println("Valoare non-integer introdusa.");
                e.printStackTrace();
                sleep(50);

            }
        }
    }
}
