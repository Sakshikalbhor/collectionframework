import java.util.LinkedList;

public class LinkedListIteration {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int i=0;
        while(i<numbers.size()){
            System.out.println(numbers.get(i));
        i++;
        }

    }
}
