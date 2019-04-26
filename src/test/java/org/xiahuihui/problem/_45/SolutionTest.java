package org.xiahuihui.problem._45;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SolutionTest {

    public Solution solution = new Solution();

    @Test
    public void test01() {

        int[] nums = new int[]{2, 3, 0, 1, 4};
        int a = solution.jump(nums);
        Assert.assertEquals(2, a);

    }

//    @Test
//    public void test03() {
//
//        int[] nums = new int[]{
//        int a = solution.jump(nums);
//        Assert.assertEquals(2, a);
//
//    }

    @Test
    public void test02() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(Integer.MAX_VALUE);
        }
        int a = solution.jump(nums);
        System.out.println(a);
    }
}