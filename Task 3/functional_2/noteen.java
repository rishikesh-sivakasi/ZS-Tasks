package functional_2;

import java.util.List;

public class noteen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n>=13 && n<=19);
        return nums;
    }
}
