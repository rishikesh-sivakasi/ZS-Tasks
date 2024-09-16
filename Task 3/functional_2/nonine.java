package functional_2;

import java.util.List;

public class nonine {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n%10==9);
        return nums;
    }
}
