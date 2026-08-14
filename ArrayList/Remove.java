import java.util.ArrayList;
public class Remove{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        numbers.remove(Integer.valueOf(30));
     System.out.println(numbers);

    }
}