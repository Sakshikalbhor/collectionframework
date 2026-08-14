import java.util.LinkedList;

public class LinkedlistSearch {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int search = 30;

        if (numbers.contains(search)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}