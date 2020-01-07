package 待理解的问题;

import org.junit.Test;

import java.util.Arrays;

public class 估算众人到同一点的最省的数字 {
    /**https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements-ii/
     *  给定一个非空整数数组，找到使所有数组元素相等所需的最小移动数，其中每次移动可将选定的一个元素加1或减1。 您可以假设数组的长度最多为10000。
     *
     * 找到平均数，权衡平均数左右两边的数量。这个我想多了，除非题目对最终目标点也有要求，不然不需要这个
     *
     * 中位数
    * */

    @Test
    public void test1(){
        int[] nums = {100,99,22,44,55,2321};
//        int[] nums = {2,5,8,20};
        int sum = 0;
        for (int i : nums){
            sum += i;
        }
        double avg = sum/nums.length;
        int re = 0;
        for (int i : nums){
            re += Math.abs(i-avg);
        }
        System.out.println(re);
        System.out.println(avg);

    }

    @Test
    public void test(){
//        int[] nums = {2,5,8,20};
        int[] nums = {100,99,22,44,55,2321};
        Arrays.sort(nums);
        int i = 0,j = nums.length - 1, res = 0;
        while (i < j) {
            res += nums[j--] - nums[i++];
        }
        System.out.println(res);
    }
}
