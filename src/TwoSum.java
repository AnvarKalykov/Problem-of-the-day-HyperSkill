/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) return new int[]{0, 1};

        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                return new int[]{pairs.get(nums[i]), i};
            }
            pairs.put(target - nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
