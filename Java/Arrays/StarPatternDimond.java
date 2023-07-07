// use for loop for a row 
// for loop for a column
// take the size of 
// for a middle star middle = size/2
// use if for row<=middle-row || column = middle +row
// use if for col = middle -size-1-row




import java.util.Scanner;
public class StarPatternDimond {
    public void hollowStarPattern() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter odd number for hollow star pattern : ");
        int size = scanner.nextInt(); 
        int middle = size / 2;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row <= middle) {
                    if (col == middle - row || col == middle + row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == middle - (size - 1 - row) || col == middle + (size - 1 - row)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
