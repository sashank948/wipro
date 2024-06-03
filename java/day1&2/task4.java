/*Task 4: Constructors
Implement a Matrix class that has a constructor which initializes the dimensions of a matrix and 
a method to fill the matrix with values. */
import java.util.*;
public class task4 {
    int x;
    int y;
    task4(int x,int y){
        this.x=x;
        this.y=y;

    }
    public void fill(){
        Scanner sc=new Scanner(System.in);
        int m[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
               System.out.println(m[i][j]);
            }
        }
       
    }
    public static void main(String[] args) {
        task4 t=new task4(3,3);
        t.fill();
    }
}
