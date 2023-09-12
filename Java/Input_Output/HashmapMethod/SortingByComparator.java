//package HashmapMethod;
//import java.util.*;
//public class SortingByComparator {
//
//
//
//        public void hashmapmethod() {
//            HashMap<Integer, String> hashMap = new HashMap<>();
//            hashMap.put(73, "abhi");
//            hashMap.put(92, "pranay");
//            hashMap.put(11, "kedar");
//            hashMap.put(74, "suresh");
//            hashMap.put(90, "dhoni");
//            System.out.println("Original HashMap: " + hashMap);
//
//
//            TreeMap<Integer, String> tree = new TreeMap<>(hashMap);
//
//            System.out.println("Sorted TreeMap by Keys: " + tree);
//
//
//            List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hashMap.entrySet());
//            entryList.sort(Comparator.comparing(Map.Entry::getValue));
//
//
//            LinkedHashMap<Integer, String> sortedByValue = new LinkedHashMap<>();
//            for (Map.Entry<Integer, String> entry : entryList) {
//                sortedByValue.put(entry.getKey(), entry.getValue());
//            }
//
//            System.out.println("Sorted TreeMap by Values: " + sortedByValue);
//        }
//
//        public static void main(String[] args) {
//            Hashmapclass has = new Hashmapclass();
//            has.hashmapmethod();
//        }
//    }
//
//}
