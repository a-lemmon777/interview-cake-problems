package find_a_duplicate_space_edition;

/**
 * Created by a.lemmon777 on 7/27/2016. Original problem: https://www.interviewcake.com/question/java/find-duplicate-optimize-for-space
 */
public class FindDuplicate {
    // Written to use constant space and better than n^2 time.
    public static int findDuplicate(final int[] array) {
        // Turn the array into a min-heap.
        transformToMinHeap(array);
        int previousValue = removeFromMinHeap(array, array.length - 1);
        for (int count = 1; count < array.length; ++count) {
            final int currentValue = removeFromMinHeap(array, array.length - 1 - count);
            if (previousValue == currentValue) {
                return currentValue;
            }
            previousValue = currentValue;
        }
        // No duplicates found.
        return -1;
    }

    private static void transformToMinHeap(final int[] array) {
    }

    private static int removeFromMinHeap(final int[] array, final int lastIndexOfHeap) {
        return -1;
    }
}
