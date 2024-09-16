package array_2;

import java.util.Arrays;

public class post4element {
    public int[] post4(int[] nums) {
    int t = 0;
    for(int i=nums.length-1;i>=0;i--)
    {
        if(nums[i]==4)
        {
            t = i+1;
            break;
        }
    }
    return Arrays.copyOfRange(nums, t , nums.length);
    }

}
