package points;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
    }
    String quaterCheck(int x, int y) {
        if (x > 0 && y > 0) {
            return "I ";
        } else if (x < 0 && y > 0) {
            return "II ";
        } else if (x < 0 && y < 0) {
            return "III ";
        } else {
            return "IV ";
        }

    }

    Scanner scanner = new Scanner(System.in);
    Point point = new Point();
    LSOutput
    
}










//    point.setX(scanner.nextInt());
//    int x = scanner.nextInt();
//    scanner.nextLine();
//    System.out.println("podaj liczbe Y: ");
//    int y = scanner.nextInt();
//    scanner.nextLine();
//    scanner.close();
//    System.out.println("Punkt leży na: " + point.quaterCheck() +" cwiartka");



