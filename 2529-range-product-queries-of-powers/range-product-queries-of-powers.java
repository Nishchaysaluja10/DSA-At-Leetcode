import java.util.ArrayList;
import java.util.Collections;

public class method {
    public static int find(int n, ArrayList<Integer> ar) {
        int ans = 0;
        for (int k = 0; k < ar.size() - 1; k++) { // fix bounds
            if (ar.get(k) <= n && ar.get(k + 1) > n) { // allow exact match
                ans = k;
            }
        }
        return ar.get(ans);
    }

    public static ArrayList<Integer> binarys(int n, ArrayList<Integer> ar2) {
        ArrayList<Integer> ar = new ArrayList<>();
        // integer-safe power of two
        for (int i = 0; (1 << i) <= n; i++) {
            ar.add(1 << i);
        }
        int x = ar.get(ar.size() - 1);
        ar2.add(x);
        n -= x;
        while (n > 0) {
            int val = find(n, ar);
            ar2.add(val);
            n -= val;
        }
        return ar2;
    }
}

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2 = method.binarys(n, ar2);
        Collections.reverse(ar2);

        int MOD = 1_000_000_007;
        int[] a1 = new int[queries.length]; // final int[] result

        for (int i = 0; i < queries.length; i++) {
            int c = queries[i][0];
            int b = queries[i][1];
            long val = 1; // do multiplication in long to avoid overflow
            for (int z = c; z <= b; z++) {
                val = (val * ar2.get(z)) % MOD; // mod to keep value in range
            }
            a1[i] = (int) val; // safe to cast now
        }
        return a1;
    }
}
