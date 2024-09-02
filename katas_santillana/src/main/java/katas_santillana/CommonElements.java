package katas_santillana;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements:");
        for (int element : commonElements) {
            System.out.println(element);
        }
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> commonElements = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        int[] result = new int[commonElements.size()];
        int i = 0;
        for (int num : commonElements) {
            result[i++] = num;
        }

        return result;
    }
}
