package 练习题;

import org.junit.Test;

import java.util.Arrays;

public class 数组排序 {

    @Test
    public void test1(){
        int[] nums = {2,3,5,1,3,5};
        Arrays.sort(nums);
        System.out.println(nums.toString());

        for (int i: nums){
            System.out.print(i);
        }
    }
}
