package HomeWork7;

import HomeWork7.Operation;

public class Main {

    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 3f);
        ComplexNumber number2 = new ComplexNumber(5, -7f);

        Decorator example = new Decorator(number1);
        Object calculator = example.add(number2);

        System.out.println("The result is: " + calculator.toString());
    }
}
