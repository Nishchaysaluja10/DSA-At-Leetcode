import java.util.ArrayList;
import java.util.Collections;

public class method {
    public static int find(int n, ArrayList<Integer> ar) {
        int ans = 0;
        for (int k = 0; k < ar.size() - 1; k++) { 
            if (ar.get(k) <= n && ar.get(k + 1) > n) { 
                ans = k;
            }
        }
        return ar.get(ans);
    }

    public static ArrayList<Integer> binarys(int n, ArrayList<Integer> ar2) {
        ArrayList<Integer> ar = new ArrayList<>();
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
        int[] a1 = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int c = queries[i][0];
            int b = queries[i][1];
            long val = 1; 
            for (int z = c; z <= b; z++) {
                val = (val * ar2.get(z)) % MOD;
            }
            a1[i] = (int) val; 
        }
        return a1;
    }
}
