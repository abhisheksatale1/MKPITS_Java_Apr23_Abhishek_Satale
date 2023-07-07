public class Main3 {
    /**
     * This is the main class were we called our class which contain two methods
     * 1.firstPatternOfTwoDimentionArray()
     * 2.secondPatternOfTwoDimentionArray()
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("The first pattern of the given example is=>");
        AbstractClassOfTwoDimentionArray abstractClassOfTwoDimentionArray=new ImplimentsOfAbstractClassOfTwoDimentionArray();
        abstractClassOfTwoDimentionArray.firstPatternOfTwoDimentionArray();
        System.out.println();
        System.out.println("The second pattern of the given example is =>");
        abstractClassOfTwoDimentionArray.SecondPatternOfTwoDimentionArray();
}
}