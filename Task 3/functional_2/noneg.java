package functional_2;

import java.util.List;

public class noneg {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n<0);
        return nums;
    }
}
