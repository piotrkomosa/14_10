package points;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
    }
    void String (int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("I quater");
        } else if (x < 0 && y > 0) {
            System.out.println("II quater");
        } else if (x < 0 && y < 0) {
            System.out.println("III quater");
        } else if (x < 0 && y < 0) {
            System.out.println("IV quater");
        }

    }
    Scanner scanner = new Scanner(System.in);
    Point point1 = new Point();
    System.out.println("podaj liczbe X: ");
    int x = scanner.nextInt();
    scanner.nextLine();
    System.out.println("podaj liczbe Y: ");
    int secondNumber = scanner.nextInt();
    scanner.nextLine();
    scanner.close();
    System.out.println("wynik to: " + point1.check(x, y));


}
