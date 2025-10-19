import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Integer[] initialData = {3, 52, 7, 25, 90, 38, 71};

        System.out.println("Initial Array:");
        System.out.println(Arrays.toString(initialData));
        System.out.println("---------------------------------");

        MaxHeap<Integer> heap = new MaxHeap<>(initialData);

        System.out.println("\nMax: " + heap.getMax());

        System.out.println("\nElements of Heap:");
        while (!heap.isEmpty()) {
            System.out.print(heap.removeMax() + " ");
        }
        System.out.println();
    }
}
