import java.util.Scanner;

public class StarPatternDiamond1 {
    public void hollowStarPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter odd number for hollow star pattern: ");
        int size = scanner.nextInt();
        int middle = size / 2;

        char[][] pattern = new char[size][size];

        // Initialize the pattern array with spaces
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = ' ';
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row <= middle) {
                    if (col == middle - row || col == middle + row) {
                        pattern[row][col] = '*';
                    }
                } else {
                    if (col == middle - (size - 1 - row) || col == middle + (size - 1 - row)) {
                        pattern[row][col] = '*';
                    }
                }
            }
        }

        // Print the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}

    