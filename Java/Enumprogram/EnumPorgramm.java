package Enumprogram;

public class EnumPorgramm {
    enum cities{WARDHA, NAGPUR, PUNE, MUMBAI}
    public static void main(String []args){
//        cities c=cities.MUMBAI;
        System.out.println(cities.valueOf("NAGPUR"));
//        System.out.println(c);
        for( cities c:cities.values())
            System.out.println(c);
    }
}
