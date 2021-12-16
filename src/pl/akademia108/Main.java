package pl.akademia108;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Wprowadź wyraz:");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println("Kra, " + word);

        System.out.println("Wprowadź wyraz:");
        String word2 = scan.next();
        System.out.println("Papuga, " + word2);

        System.out.println("Autorem programu jest Krystian");
        scan.close();
    }
}
