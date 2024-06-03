/*
Task 7: Basic Exception Handling
Write a program that attempts to divide by zero, catches the ArithmeticException, 
and provides a custom error message. 
*/
public class task7 {
    public static void main(String[] args) {
        try {
            int a=10,b=0;
            int c=a/b;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("arithametic exception");
        }
    }
}
