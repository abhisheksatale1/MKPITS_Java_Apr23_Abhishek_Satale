package MapingClassTask;

import MapInterface.Hash_mapclass;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String args[]){
        DistrictNameandPin districtNameandPin = new DistrictNameandPin();
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        DistrictNameandPin districtNameandPin1;
       while (true){

           System.out.println(" \n 1. Add the District \n 2. Display all the District \n 3. Find the District \n 4. Delete the district \n 5. Replace the district \n 6. Clear All the data \n 7. Exit");
           System.out.println("Enter the one of the following \n");
           int chose = scanner.nextInt();

           switch (chose){

               case 1:
                   System.out.println("Enter the name of the District");
                   String name = scanner.next();
                   System.out.println("Enter the pin of the District");
                   int pin = scanner.nextInt();
                   hashMap.put(pin, name);
                    break;
               case 2:


                   System.out.println("Display All the District with its pin");
                   System.out.println(hashMap);
                   break;

               case 3:
                   System.out.println("Enter the Pin of city");
                   int key = scanner.nextInt();
                   System.out.println("Name of the city is"+ hashMap.get(key));
                    break;

               case 4:
                   System.out.println("Enter the pin of city for delete");
                   int delete = scanner.nextInt();
                   hashMap.remove(delete);
                   break;
               case 5:
                   System.out.println("Replace the pin and Name of District");
                   System.out.println("Enter the pin of the district that have to change");
                   int Newpin = scanner.nextInt();
                   System.out.println("Enter the name of the new district");
                   String NewnameofDistrict = scanner.next();
                   System.out.println(hashMap.replace(Newpin, NewnameofDistrict));
                    break;
               case 6:

                   hashMap.clear();
                   System.out.println("Clear all the values");
                    break;

               case 7:
                   System.out.println("You are exit from the program");
                   return;
               }



           }
       }


    }

