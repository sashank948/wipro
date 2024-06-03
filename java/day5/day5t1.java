/*
Task 4: Lambda Expressions
Implement a Comparator for a Person class using a lambda expression, and 
sort a list of Person objects by their age.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day5t1 {
    public static void main(String[] args) {
        List<person> l=new ArrayList<>();
        person p1=new person("sashank", 20);
        person p2=new person("raj", 3);

        l.add(p1);
        l.add(p2);
        Collections.sort(l, (l1, l2) -> l1.age - l2.age);

        
        for (person person : l) {
            System.out.println(person);
        }
    }
    
}
class person{
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String toString() {
        return "name: "+name+"   "+"age: "+age;

    }
}