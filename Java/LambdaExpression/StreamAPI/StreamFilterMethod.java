package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMethod {
    public static void main(String[] args) {
        System.out.println("-----------------------Filter method---------------------");
        List <Integer>list1= Arrays.asList(3,46,77,34,56,23,45,67,23);
            list1.stream().filter(c ->c%2==0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("-----------------skip method----------------");
        List list2=list1.stream().skip(2).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("--------------------reduce method------------");
       int sumofnumber= list1.stream().reduce(0,(sum,n)->sum+n);
        System.out.println(sumofnumber);

        System.out.println("----------------reduce method substraction");
        int substractionofnumber=list1.stream().reduce(0,(sub,n)->sub-n);
        System.out.println(substractionofnumber);

    }
}
