import java.util.ArrayList;

public class SortingAlgorithms {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Generate 100 random numbers using Math.random()
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 201) - 100; // Generates numbers between -100 and 100
            list1.add(randomNumber);
            list2.add(randomNumber);
        }

        // Selection Sort
        int selectionSortIterations = 0;
        ArrayList<Integer> sortedList1 = new ArrayList<>(list1); // Create a copy to sort
        selectionSortIterations = selectionSort(sortedList1);

        // Insertion Sort
        int insertionSortIterations = 0;
        ArrayList<Integer> sortedList2 = new ArrayList<>(list2); // Create a copy to sort
        insertionSortIterations = insertionSort(sortedList2);

        // Store the sorted list from insertion sort in a new ArrayList
        ArrayList<Integer> sortedList2Copy = new ArrayList<>(sortedList2);

        // Run insertion sort on the already sorted list
        int insertionSortOnSortedIterations = insertionSort(sortedList2Copy);

        System.out.println("Original List 1: " + list1);
        System.out.println("Sorted List 1 (Selection Sort): " + sortedList1);
        System.out.println("Selection Sort Iterations: " + selectionSortIterations);

        System.out.println("\nOriginal List 2: " + list2);
        System.out.println("Sorted List 2 (Insertion Sort): " + sortedList2);
        System.out.println("Insertion Sort Iterations: " + insertionSortIterations);

        System.out.println("\nSorted List 2 Copy (Already Sorted): " + sortedList2Copy);
        System.out.println("Insertion Sort on Sorted Iterations: " + insertionSortOnSortedIterations);

    }

    public static int selectionSort(ArrayList<Integer> list) {
        int iterations = 0;
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                iterations++; // Increment for each comparison
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return iterations;
    }

    public static int insertionSort(ArrayList<Integer> list) {
        int iterations = 0;
        int n = list.size();
        for (int i = 1; i < n; ++i) {
            int key = list.get(i);
            int j = i - 1;

            /* Move elements of list[0..i-1], that are greater than key,
               to one position ahead of their current position */
            while (j >= 0 && list.get(j) > key) {
                iterations++; // Increment for each comparison and shift
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
        return iterations;
    }
}