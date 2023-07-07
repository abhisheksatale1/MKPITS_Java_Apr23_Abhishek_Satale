

import java.sql.Array;

public class ImplimentsOfAbstractClassOfTwoDimentionArray extends AbstractClassOfTwoDimentionArray{

    @Override
    public void firstPatternOfTwoDimentionArray() {

        String array[][]={{"*","*","*","*","*"},
                {"*","*","*","*","*"},
                {"*","*","*","*","*"},
                {"*","*","*","*","*"},
                {"*","*","*","*","*"} };

        for(int row=0;row<5;row++){
            if(row==0){
            for(int column=0;column<5;column++){

                    System.out.print(array[row][column]);

                }
                System.out.println();

            }
            if(row==1){
                System.out.print(" ");
                for(int column=0;column<5;column++){
                    if(column==1||column==2||column==3){
                        System.out.print(array[row][column]);
                    }
                }
                System.out.println();
            }

            if(row==2){
                System.out.print("  ");
                for(int column=0;column<5;column++){
                    if(column==2){
                        System.out.print(array[row][column]);
                    }
                }
            }
            if(row==3){
                System.out.print(" ");
                for(int column=0;column<5;column++){
                    if(column==1&&column==2&&column==3){
                        System.out.print(array[row][column]);
                    }
                }
                System.out.println();
            }

            if(row==3){
                System.out.print(" ");
                for(int column=0;column<5;column++){
                    if(column==1||column==2||column==3){
                        System.out.print(array[row][column]);
                    }
                }
                System.out.println();
            }

            if(row==4){
                for(int column=0;column<5;column++){

                    System.out.print(array[row][column]);

                }
                System.out.println();

            }


        }



    }

    @Override
    public void SecondPatternOfTwoDimentionArray(){

        String array[][]={{"*","*","*","*","*"},
                {"*","*","*","*","*"},
                {"*","*","*","*","*"},
                {"*","*","*","*","*"},
                {"*","*","*","*","*"} };

        for(int row=0;row<5;row++){
            if(row==0){

                for(int column=0;column<5;column++){

                    if(column==2){System.out.print(array[row][column]);}else {System.out.print(" ");}
                }
                System.out.println();
            }
            if(row==1){
                for(int column=0;column<5;column++){
                    if(column==1||column==3){System.out.print(array[row][column]);}else {System.out.print(" ");}
                }
                System.out.println();
            }
            if(row==2){
                for(int column=0;column<5;column++){
                    if(column==0||column==4){System.out.print(array[row][column]);}else {System.out.print(" ");}
                }
                System.out.println();
            }
            if(row==3){
                for(int column=0;column<5;column++){
                    if(column==1||column==3){System.out.print(array[row][column]);}else {System.out.print(" ");}
                }
                System.out.println();
            }

            if(row==4){

                for(int column=0;column<5;column++){

                    if(column==2){System.out.print(array[row][column]);}else {System.out.print(" ");}
                }
                System.out.println();
            }
 }

}
}