import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(44);
        numbers.add(30);
        numbers.add(50);
        int i = 1;
        int max = numbers.get(0);
        while(i<numbers.size());
         if(numbers.get(i)>max){
            max = numbers.get(i);
         }
         i++;
         System.out.println("Elements=" + max);


        
        
        
}}
