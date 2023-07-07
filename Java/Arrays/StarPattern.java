public class StarPattern {
    public static void main(String[] args) {
        int size = 9; // Size of the diamond pattern

        char[][] pattern = new char[size][size];

        // Fill the array with spaces
        for (int row = 0; row < size; row++) {
            for (int  column = 0; j < size; j++) {
                //pattern[i][j]='';
            }
        }

        // Fill the array to form the diamond pattern
        int mid = size / 2;
        //pattern[mid][mid] = '*'; // Center element

        for (int i = 0; i < mid; i++) {
            pattern[i][mid - i] = '*'; // Upper left diagonal
            pattern[i][mid + i] = '*'; // Upper right diagonal
            pattern[size - 3 - i][mid - i] = '*'; // Lower left diagonal
			pattern[size - 3 - i][mid + i] = '*'; // Lower right diagonal
        }

		// Print the diamond pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
