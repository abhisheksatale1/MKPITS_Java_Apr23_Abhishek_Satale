package AssignmentPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek","pranay","Avanish","Shubham","Ashish","Shreyash");
        List list1= names.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);
    }
}
