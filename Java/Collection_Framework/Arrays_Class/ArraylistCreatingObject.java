package Arrays_Class;

import java.util.*;

public class ArraylistCreatingObject {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(45);
        list.add(90);
        list.add(67);
        System.out.println(list);
        System.out.println("using for loop");
        for(int elementnumber=0;elementnumber<list.size();elementnumber++){
            System.out.println(list.get(elementnumber));
        }
        System.out.println("by using foreach loop");
        for (Integer number:list){
            System.out.println(number);
        }
        System.out.println("using iterator");
       Iterator it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
