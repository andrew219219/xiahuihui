package org.xiahuihui.problem._45;

import org.apache.commons.lang3.ArrayUtils;

public class Solution {

    private static final int UNREACHABLE = -1;

    public int jump(int[] nums) {
        int[] dp = buildDp(nums);
        System.out.println(ArrayUtils.toString(nums));
        System.out.println(ArrayUtils.toString(dp));
        return dp[0];
    }

    private int[] buildDp(int[] nums) {
        int[] dp = new int[nums.length];

        // build dp from end to start
        for (int i = nums.length - 1; i >= 0; i--) {

            int value = nums[i];
            if (i == nums.length - 1) {
                dp[i] = 0;
            } else if (value <= 0) {
                dp[i] = UNREACHABLE;
            } else {

                Integer minDpi = null;
                for (int j = 0; j < value; j++) {
                    int nexti = i + j + 1;
                    if (nexti >= nums.length) {
                        break;
                    }

                    if (dp[nexti] == UNREACHABLE) {
                        continue;
                    }
                    if (minDpi == null || minDpi > dp[nexti]) {
                        minDpi = dp[nexti];
                    }
                }

                if (minDpi == null) {
                    dp[i] = UNREACHABLE;
                } else {
                    dp[i] = minDpi + 1;
                }

            }
        }

        return dp;
    }
}
