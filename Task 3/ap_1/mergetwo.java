package ap_1;

import java.util.HashSet;
import java.util.Set;

public class mergetwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int f = 0, s = 0, i = 0;
        Set<String> seen = new HashSet<>();
        while (i < n && (f < a.length || s < b.length)) {
            String next = null;
            if (f < a.length && (s >= b.length || a[f].compareTo(b[s]) < 0)) {
            next = a[f++];
            } else if (s < b.length) {
                next = b[s++];
            }
            if (next != null && !seen.contains(next)) {
            seen.add(next);
            result[i++] = next;
            }
        }
        return result;
    }
}
