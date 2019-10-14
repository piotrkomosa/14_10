package calc;

public class Calculator {
    int check (int firstNumber, int secondNumber) {
        if       (firstNumber > secondNumber) {
            return (firstNumber + secondNumber);
        } else if (firstNumber < secondNumber) {
            return (firstNumber * secondNumber);
        } else  {
            return firstNumber * firstNumber;
        }
    }
}