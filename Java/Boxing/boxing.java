package Boxing;

public class boxing {
    public static void main(String args[]){
        String str ="123";
        int a =1234;
        Integer x= Integer.valueOf(str);
        System.out.println("Boxing"+x);

        Integer b=a;
        System.out.println("autoboxing"+b);
    }
}
