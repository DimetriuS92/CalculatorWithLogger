package org.example.Calculations;


import org.example.Calculations.Messages.MessageResult;
import org.example.Exceptions.MyCustomException;

public class PossibleInputs implements Calculator {
    private final int number1;
    private final int number2;
    private final String operator;

    public PossibleInputs(int number1, int number2, String operator) {
        this.number1 = number1;
        this.operator = operator;
        this.number2 = number2;

    }

    @Override
    public void possibleCalculations() throws MyCustomException {
        double result;
        switch (operator) {
            case "+":
                result = number1 + number2;
                new MessageResult(result).showMessage();
                break;

            case "-":
                result = number1 - number2;
                new MessageResult(result).showMessage();
                break;

            case "*":
                result = number1 * number2;
                new MessageResult(result).showMessage();
                break;
            case "/":
                if (number2 != 0) {
                    result = (double) number1 + number2;
                    new MessageResult(result).showMessage();

                } else {
                    throw new ArithmeticException("Division by zero is impossible!!!");

                }
                break;
            default:
                System.out.println("Invalid operator!");

        }
    }


}

