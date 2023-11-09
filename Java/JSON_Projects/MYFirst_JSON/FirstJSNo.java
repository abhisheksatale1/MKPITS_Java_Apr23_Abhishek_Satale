import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class FirstJSNo {
public static void main (String args[]){
    JSONArray arr= new JSONArray();
    arr.add("abhi");
    arr.add(1,"ram");
    arr.add(2,34);
    arr.add(3, 4.5);
    String jsonText = JSONValue.toJSONString(arr);
    System.out.println(jsonText);
    }

}
