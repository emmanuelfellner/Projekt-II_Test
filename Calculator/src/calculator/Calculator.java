package calculator;

import calculator.operations.Addition;
import calculator.operations.Subtraction;

public class Calculator {

    public double calculate(double a, double b, String operator) {

        switch (operator) {
            case "+":
                return Addition.calculate(a, b);

            case "-":
                return Subtraction.calculate(a, b);

            default:
                System.out.println("Ungültiger Operator!");
                return 0;
        }
    }
}
