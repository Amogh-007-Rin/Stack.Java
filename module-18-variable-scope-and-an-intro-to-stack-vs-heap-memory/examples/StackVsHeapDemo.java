public class StackVsHeapDemo {

    public static void main(String[] args) {
        int localPrimitive = 42;
        int[] localRef = new int[3];
        localRef[0] = 10;
        localRef[1] = 20;
        localRef[2] = 30;

        System.out.println("localPrimitive (stack): " + localPrimitive);
        System.out.println("localRef (stack ref -> heap array): " + java.util.Arrays.toString(localRef));

        processArray(localRef);
        System.out.println("After processArray: " + java.util.Arrays.toString(localRef));
    }

    public static void processArray(int[] arr) {
        arr[0] = 99;
        arr = new int[]{5, 5, 5};
        System.out.println("Inside method, new arr: " + java.util.Arrays.toString(arr));
    }
}
