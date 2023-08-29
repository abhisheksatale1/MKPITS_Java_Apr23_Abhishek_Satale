package MapInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hash_mapclass {
    public static void main (String args[]){
        HashMap hashMap = new HashMap();
        hashMap.put(101, "Abhishek");
        hashMap.put(102,"shubham");
        System.out.println("Put method in Hashmap");
        System.out.println(hashMap); // by using put method
        System.out.println("clear method");
        hashMap.entrySet();
        Set set = hashMap.entrySet();
        System.out.println("set method");// it print as it is
        System.out.println(set);
        System.out.println();
        System.out.println("perticular key");
        System.out.println(hashMap.get(102));
        HashMap hashMap2= new HashMap();
        hashMap2.putAll(hashMap);
        System.out.println(hashMap2);
        System.out.println("here we only print integer");
        HashMap<Integer,String> hashMap3 = new HashMap<Integer,String>();
        System.out.println("contains method");
        boolean set1 = hashMap3.containsValue(hashMap3);
        System.out.println(hashMap3.containsValue(hashMap2));
        System.out.println(hashMap3);
        System.out.println(set1);
        System.out.println("Entery method in java");
        System.out.println(hashMap3.equals(hashMap2));
        System.out.println("replace method");
        hashMap2.replace(101,"pranay");
        System.out.println(hashMap2);
        System.out.println("getorDefalult method ");
        System.out.println (hashMap2.getOrDefault(105,"defalut value"));
        System.out.println(hashMap2);


    }
}
