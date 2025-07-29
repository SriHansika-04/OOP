package mypackage; // Keep your package if needed

import java.util.Arrays; // ✅ This import is necessary!

public class array {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
