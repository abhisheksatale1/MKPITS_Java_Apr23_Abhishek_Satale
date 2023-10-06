package StringAPIEmployPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList <EmployClass>emplylist= new ArrayList<EmployClass>();
        EmployClass[] employClass= new EmployClass[3];
       employClass[0]= new EmployClass("abhishek",10000);
       employClass[1]=new EmployClass("Pranay",20000);
       employClass[2]=new EmployClass("Swpnil",40000);
        emplylist.addAll(Arrays.asList(employClass));
        System.out.println(emplylist);
        List<EmployClass> Arraylist= Arrays.stream(employClass).map(c->c).collect(Collectors.toList());
        System.out.println(Arraylist);

    }
}
