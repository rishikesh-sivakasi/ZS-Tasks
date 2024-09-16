package array_2;

import java.util.Arrays;

public class pre4element {
    public int[] pre4(int[] nums) {
    int t = 0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==4)
        {
            t = i;
            break;
        }
    }
    return Arrays.copyOfRange(nums,0,t);
    }

}
