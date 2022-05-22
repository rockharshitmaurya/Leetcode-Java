class Solution {
  public int minimumLines(int[][] A) {
        int n = A.length, res = n - 1;
        Arrays.sort(A, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i < n - 1; ++i)
            if (1L * (A[i][0] - A[i - 1][0]) * (A[i + 1][1] - A[i][1]) == 1L * (A[i + 1][0] - A[i][0]) * (A[i][1] - A[i - 1][1]))
                res--;
        return res;
    }
}