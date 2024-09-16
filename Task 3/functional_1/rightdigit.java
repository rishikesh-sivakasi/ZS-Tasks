package functional_1;

import java.util.List;

public class rightdigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n->n%10);
        return nums;
    }
}
