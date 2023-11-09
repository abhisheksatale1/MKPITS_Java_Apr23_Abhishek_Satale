import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.List;

public class JSONEncode {
    public static void main (String args[]){
        List list = new ArrayList();
        list.add("Abhi");
        list.add(2,45);
        list.add(new double[3]);
        String text= JSONValue.toJSONString(list);
        System.out.println(text);
    }
}
