package Set;

import java.util.Arrays;
import java.util.HashSet;

public class Addtwoset {
    public static void main(String args[]){
        Integer[]numArray1={34,65,67,66};
        Integer[]numArray2={44,65,67,68,12};

        HashSet hashSet1=new HashSet(Arrays.asList(numArray1));
        HashSet hashSet2= new HashSet(Arrays.asList(numArray2));
        System.out.println(hashSet1);
        System.out.println(hashSet2);
        HashSet unionofset1andset2= new HashSet();
        unionofset1andset2.addAll(hashSet1);
        unionofset1andset2.addAll(hashSet2);
        System.out.println("union of two set");
        System.out.println(unionofset1andset2);
        HashSet intersectionofset1ofsent2= new HashSet(hashSet1);
        intersectionofset1ofsent2.retainAll(hashSet2);
        System.out.println("intersection of two");
        System.out.println(intersectionofset1ofsent2);
        System.out.println(hashSet1.retainAll(hashSet2));
        HashSet differencebetweenset1ofset2= new HashSet(hashSet1);
        differencebetweenset1ofset2.addAll(hashSet2);
        System.out.println(differencebetweenset1ofset2);




    }
}
