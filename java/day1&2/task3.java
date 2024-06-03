/*Task 3: Control Flow
Write a Java program that reads an integer and 
prints whether it is a prime number using a for loop and if statements. */
public class task3 {
    public static void main(String[] args) {
        int n=5;
        int c=0;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                c++;
            }

        }
        if(c==0){
            System.out.println("prime");
        }
        else{
            System.out.println("no prime");
        }
    }
}
