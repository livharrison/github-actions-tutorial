import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("  Welcome to the calculator!  ");
        System.out.println("     Enter 'quit' to stop.    ");
        System.out.println("------------------------------\n");

        while (true) {
            System.out.println("Enter your calculation: ");
            String request = scanner.nextLine();
            String[] arguments = request.split(" ");

            if (arguments[0].equals("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            int num1 = Integer.parseInt(arguments[1]);
            String result = "";

            if (arguments[0].equals("fibonacci")) {
                result = Integer.toString(calculator.fibonacciNumberFinder(num1));
            } else if (arguments[0].equals("binary")) {
                result = calculator.intToBinaryNumber(num1);
            } else {
                int num2 = Integer.parseInt(arguments[2]);
                int intResult = -1;
                if (arguments[0].equals("add")) {
                    intResult = calculator.add(num1, num2);
                } else if (arguments[0].equals("subtract")) {
                    intResult = calculator.subtract(num1, num2);
                } else if (arguments[0].equals("multiply")) {
                    intResult = calculator.multiply(num1, num2);
                } else if (arguments[0].equals("divide")) {
                    intResult = calculator.divide(num1, num2);
                }
                result = Integer.toString(intResult);
            }

            System.out.println(result);
        }
    }
}
