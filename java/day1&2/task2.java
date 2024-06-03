/*Task 2: Operators
Create a program that simulates a simple calculator using command-line arguments to 
perform and print the result of addition, subtraction, multiplication, and division.. */
public class task2 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Addition: "+(a+b));
        System.out.println("Substraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));

    }
}
