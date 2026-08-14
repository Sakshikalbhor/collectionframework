import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        linkedList.addFirst(5);
        linkedList.addLast(40);

        System.out.println("LinkedList after adding: " + linkedList);
    }
}