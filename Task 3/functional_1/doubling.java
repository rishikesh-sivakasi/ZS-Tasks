package functional_1;

import java.util.List;

public class doubling {
    public List<Integer> Doubling(List<Integer> nums) {
        nums.replaceAll(n -> n*2);
        return nums;
    }
}
