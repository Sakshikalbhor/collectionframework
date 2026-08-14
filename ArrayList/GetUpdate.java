import java.util.ArrayList;
public class GetUpdate{
     public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Element =" +numbers.get(2));
        numbers.set(2,100);
        System.out.println(numbers);
}
    
}
