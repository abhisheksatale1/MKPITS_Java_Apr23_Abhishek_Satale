package AssignmentPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvennumber {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(34,56,34,24,56,34,55,33,21);
        List list = number.stream().filter(c->c%2==0).collect(Collectors.toList());
        System.out.println(list);
        List list2 = number.stream().filter(c ->c%2!=0).collect(Collectors.toList());
        System.out.println(list2);
        int list3 = number.stream().map(c->c*2).reduce(0,(sum,n)->sum+n);
        System.out.println(list3);

        List list1 = Collections.singletonList(number.stream().filter(c -> c % 2 == 0).reduce(0, (sum, n) -> sum + n));
        System.out.println(list1);
    }
}
