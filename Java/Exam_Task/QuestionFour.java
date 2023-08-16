public class QuestionFour {

    public static void main(String[] args) {

        try {
            int number = Integer.parseInt("xyz");
        } catch (NumberFormatException e) {
            System.out.println("No Valid formate");
        }

        String str = "default";
        try {
            str = "Hello";
            char c = str.charAt(16);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("the index is not found");
        }


         System.out.println("Zeroth Index Character is" + str.charAt(2));
    }
}
