package points;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
    }

    Point point = new Point();
    int quaterCheck (int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("I ");
        } else if (x < 0 && y > 0) {
            System.out.println("II ");
        } else if (x < 0 && y < 0) {
            System.out.println("III ");
        } else  {
            System.out.println("IV ");
        }

    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj liczbe X: ");
    int x = scanner.nextInt();
    scanner.nextLine();
    System.out.println("podaj liczbe Y: ");
    int y = scanner.nextInt();
    scanner.nextLine();
    scanner.close();
    System.out.println("Punkt leży na: " + point.quaterCheck() +" cwiartka");


}
