package ConsumerPackage;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerClassPrintName {
    public static void main(String[] args) {
        Consumer <String> printconsumer =t-> System.out.println(t);
        Stream<String> cities = Stream.of("Sunday","Monday","Tuesday","Thesday","Friday","Saturday","Sunday");
        cities.forEach(printconsumer);


    }
}
