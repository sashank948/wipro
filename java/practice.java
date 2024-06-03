import java.util.*;

public class practice {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(55);
        l.forEach(e->System.out.println(e));
        l.forEach(System.out::println);

    }
}
