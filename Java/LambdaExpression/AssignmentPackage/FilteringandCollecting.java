package AssignmentPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringandCollecting {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Mansi","Durgeshwari","Payal","Shreya","Sneha","Abhishek","Avanish");
        List list1=names.stream().filter(c->c.contains("A")).collect(Collectors.toList());
        System.out.println(list1);
    }
}
