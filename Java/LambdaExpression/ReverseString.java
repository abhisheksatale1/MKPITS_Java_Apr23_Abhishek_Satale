public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Abhishek";
        String reversedStr = reverseString(str);

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}

