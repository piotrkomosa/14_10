package calc;

import java.util.Scanner;
public class CalcTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("podaj pierwsza liczbe X: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("podaj druga liczbe Y: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println("wynik to: " + calc.check(firstNumber, secondNumber));
    }
}