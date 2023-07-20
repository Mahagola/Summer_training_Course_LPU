// sliding windows
// https://leetcode.com/problems/maximum-subarray/
import java.util.List;
class Solution {
    public int maxSubArray(List<Integer> nums) {
        int curr_sum = 0;
        int maxSum = nums.get(0);
        for (int i : nums) {
            curr_sum = Math.max(curr_sum, 0); // reset to zero if it becomes negative
            curr_sum += i;
            maxSum = Math.max(maxSum, curr_sum);
        }
        return maxSum;
    }
}
