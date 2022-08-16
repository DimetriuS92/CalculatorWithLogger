package org.example;

import org.example.Calculations.Input;
import org.example.Calculations.PossibleInputs;
import org.example.Exceptions.MyCustomException;




class Main {
    public Main() {



    }

    public static void main(String[] args) throws MyCustomException {
        Input input = new Input();
        input.input();
        PossibleInputs possibleInputs = new PossibleInputs(input.getNumber1(), input.getNumber2(), input.getOperator());
        possibleInputs.possibleCalculations();



       /* String operator;
        int number1, number2;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        number1 = input.nextInt();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next();

        System.out.println("Enter second number");
        number2 = input.nextInt();

        switch (operator) {

            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case "/":
                result = (double) number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();*/
    }
}