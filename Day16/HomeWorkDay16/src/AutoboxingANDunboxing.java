public class AutoboxingANDunboxing {
    public static void main(String[] args) {
        //  Autoboxing
        int primitiveInt = 100;
        Integer wrapperInt = primitiveInt;
        System.out.println("Autoboxing: primitive " + primitiveInt + " -> wrapper " + wrapperInt);

        //Unboxing
        Integer anotherWrapper = Integer.valueOf(200);
        int anotherPrimitive = anotherWrapper;
        System.out.println("Unboxing: wrapper " + anotherWrapper + " -> primitive " + anotherPrimitive);
    }
}