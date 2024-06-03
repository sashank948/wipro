/*Task 1: Data Types/Variables
Write a program that declares two integer variables, swaps their values without using a third variable, and prints the result.
*/
public class task1{
    public static void main(String args[]){
        int a=7,b=19;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}