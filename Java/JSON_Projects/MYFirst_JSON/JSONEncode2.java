import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONEncode2 {
    public static void main (String args[]){
        String s=   "{\"name\":\"sonu\",\"salary\":60000.0,\"age\":27}";
        Object obj = JSONValue.parse(s);
        JSONObject jsonObject =(JSONObject) obj;

        String name = (String) jsonObject.get("name");

    }
}
