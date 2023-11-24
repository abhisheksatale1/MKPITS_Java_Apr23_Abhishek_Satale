import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class pratice_class {

    public void example_first(){
        String word="a straight set of points that extend a in a opposite directions";

        String []words=word.split(" ");
        List list = new ArrayList();
        for(int counter=0;counter<words.length;counter++){
            list.add(words[counter]);

        }
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        int collections= Collections.frequency(list,word);
        for (int counter1=0;counter1<collections;collections++){
//            if(collections){

            }
        System.out.println();
        }


    }



}
