package second_task_test;

import second_task.TwoSumSolution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumSolutionTest {

    @Test
    public void testExampleOne() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[] {0, 1}, result);
    }

    @Test
    public void testExampleTwo() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[] {1, 2}, result);
    }

    @Test
    public void testExampleThree() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[] {0, 1}, result);
    }

    @Test
    public void testNoSolution() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[] {-1, -1}, result);
    }

    @Test
    public void testNegativeNumbers() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[] {0, 2}, result);
    }
}
