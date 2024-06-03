package com.example;

/**
 * Hello world!
 */
public final class App {
    App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    int sum(int a,int b){
        return a+b;
    }
    boolean checkEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    
}
