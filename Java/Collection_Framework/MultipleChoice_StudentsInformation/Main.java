package MultipleChoice_StudentsInformation;


import java.util.LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {


        Studentclass student = new Studentclass();
        LinkedList <Studentclass>list = new <Studentclass>LinkedList();
        Scanner scanner = new Scanner(System.in);
        Studentclass studentclass;

        while (true){
            System.out.println("1.for add the data \n 2. Display all \n 3.find the data \n 4.modify the data \n 5. delete the data \n 6. delete all \n 7.exit form the this");
            System.out.println("Enter the one of above");
            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the name");

                    String sc = scanner.next();
                    System.out.println("enter the marks");

                    int mark = scanner.nextInt();
                    studentclass = new Studentclass(sc, mark);
                    list.add(studentclass);

                    break;
                case 2:
                    for(Studentclass stud:list){
                        System.out.println(stud.getMarks()+" "+stud.getName());
                    }

                    break;
                case 3:
                    int number= scanner.nextInt();
                    System.out.println("Enter the Index No");
                    System.out.println(list.get(number));
                    break;
                case 4:
                    System.out.println("Enter the index");
                    int Modifynumber= scanner.nextInt();
                    System.out.println(list.get(Modifynumber));
                    System.out.println("Enter the Index No for modifying the data");
                    int modifyerIndex=scanner.nextInt();
                    System.out.println("Enter the Modifyer name");
                    String Modifyname=scanner.next();
                    System.out.println("Enter the Modify mark");
                    int Modifiymark=scanner.nextInt();

                    System.out.println(list.set(modifyerIndex,(new Studentclass(Modifyname,Modifiymark)))); //here we call the student object
                    break;
                case 5:
                    System.out.println("Enter the Index of that you have to delete");
                        int DeletingIndex=scanner.nextInt();
                    System.out.println(list.remove(DeletingIndex));
                       break;
                case 6:
                    list.clear();
                    System.out.println("All data is clear");
                    break;
                case 7:
                    return;

            }

        }

    }
}