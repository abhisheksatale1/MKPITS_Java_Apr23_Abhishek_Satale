


 class Main{

    public static void main(String args[]) {
        PrimitiveToWrapperLong primitiveToWrapper = new PrimitiveToWrapperLong();
        System.out.println("Long value is: " + primitiveToWrapper.getLongWrapperFromPrimitive());
        System.out.println("Bit count of Long: " + primitiveToWrapper.getLongBitCountFromPrimitive());
        System.out.println("Long from string value: " + primitiveToWrapper.getLongBFromStringValue());
        System.out.println("Convert back to String from Long from string value: " + String.valueOf(primitiveToWrapper.getLongBFromStringValue()));
    }
}
