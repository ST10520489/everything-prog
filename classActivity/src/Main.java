//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            //code that may cause an exception
            int number1 = 10;
            int number2 = 1

























































































                    ;

            int result = number1 / number2;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            //Handles division by zero
            System.out.println("Error: You cannot divide by zero.");
        }
        finally {
            //This block always executes
            System.out.println("Program execution completed.");
        }
    }
}