import java.util.Scanner;

public class StarPatternDiamond1 {
    public void hollowStarPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter odd number for hollow star pattern: ");
        int size = scanner.nextInt();
        int middle = size / 2;

        //char[][] pattern = new char[size][size];

        // Initialize the pattern array with spaces
        for (int innercounter = 0; innercounter < size; innercounter++) {
            for (int outercounter = 0; outercounter < size; outercounter++) {
                pattern[innercounter][outercounter] = ' ';
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
        for (int innercounter = 0; innercounter < size; innercounter++) {
            for (int outercounter = 0; outercounter < size; outercounter++) {
                System.out.print(pattern[innercounter][outercounter]);
            }
            System.out.println();
        }
    }
}

    