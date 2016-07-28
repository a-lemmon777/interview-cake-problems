package find_a_duplicate_space_edition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by a.lemmon777 on 7/27/2016. Original problem: https://www.interviewcake.com/question/java/find-duplicate-optimize-for-space
 */
public class FindDuplicateTest {
    @Test
    public void testSingleNumber() {
        final int[] array = {1, 1};
        assertEquals(1, FindDuplicate.findDuplicate(array));
    }

    @Test
    public void testDuplicateOnes() {
        final int[] array = {1, 2, 1};
        assertEquals(1, FindDuplicate.findDuplicate(array));
    }

    @Test
    public void testDuplicateTwos() {
        final int[] array = {1, 2, 2};
        assertEquals(2, FindDuplicate.findDuplicate(array));
    }

    @Test
    public void testMultipleDuplicates() {
        final int[] array = {1, 1, 3, 3};
        final int result = FindDuplicate.findDuplicate(array);
        assertTrue(result == 1 || result == 3);
    }

    @Test
    public void testAllDuplicates() {
        final int[] array = {3, 3, 3, 3};
        assertEquals(3, FindDuplicate.findDuplicate(array));
    }

    @Test
    public void testLargeArray() {
        final int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 9};
        assertEquals(9, FindDuplicate.findDuplicate(array));
    }
}
