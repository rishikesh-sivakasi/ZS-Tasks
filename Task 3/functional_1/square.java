package functional_1;

import java.util.List;

public class square {
    public List<Integer> Square(List<Integer> nums) {
        nums.replaceAll(n -> n*n);
        return nums;
    }
}
