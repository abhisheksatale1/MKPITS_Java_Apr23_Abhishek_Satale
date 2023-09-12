package HashmapMethod;

import javax.naming.ldap.SortKey;
import javax.swing.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Hashmapclass {
    public  void hashmapmethod() {
        HashMap hashMap = new HashMap();
        hashMap.put(73, "abhi");
        hashMap.put(92, "pranay");
        hashMap.put(11, "kedar");
        hashMap.put(74, "suresh");
        hashMap.put(90, "dhoni");
        System.out.println(hashMap);
//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.values());
//        Set s = hashMap.entrySet();
//        System.out.println(s);
        TreeMap<Integer, String> tree = new TreeMap<Integer, String>(hashMap);

        System.out.println(tree); // treemap is sorted
    }
    public static void main (String args[]){
        Hashmapclass has = new Hashmapclass();
        has.hashmapmethod();



    }
}
