package Smoothstack;
import java.util.List;

/**
 * @author Brendon
 * 
 * This program is for Java Basics Week 1 Assignments 2-5.
 */
public class JBWK1_A2_A5 {

    /* Assignment 2. This method takes a list of non-negative integers and returns an 
    integer list of the rightmost digits. */
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    /* Assignment 3. This method takes a list of list of integers and returns a list where
    each  integer is multiplied by '2'. */
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    /* Assignment 4. This method takes a list of strings and returns a list where each string 
    has all of its 'x' characters removed. */
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }

    /* Assignment 5. This method takes an array of ints and looks for a possible combination that
    will sum up to a specified number. However, the summation has a constraint where numbers which
    are adjacent and identical must either all be chosen or all be ignored. */
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            } 
            return false;
        }
        int i = start + 1;
        for(; i< nums.length && nums[start] == nums[i]; i++);
            if (groupSumClump(i, nums, target - ((i - start) * nums[start])))
                return true;

        return groupSumClump(i, nums, target);
    }
}
