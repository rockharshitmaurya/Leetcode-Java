class Solution {
    public boolean reorderedPowerOf2(int N) {
//         char[] a1 = String.valueOf(N).toCharArray();
//         Arrays.sort(a1);
//         String s1 = new String(a1);
        
//         for (int i = 0; i < 31; i++) {
//             char[] a2 = String.valueOf((int)(1 << i)).toCharArray();
//             Arrays.sort(a2);
//             String s2 = new String(a2);
//             System.out.println(s1+"\n"+s2);
//             if (s1.equals(s2)) return true;
//         }
        
//         return false;
         int[] A = count(N);
        for (int i = 0; i < 31; ++i)
            if (Arrays.equals(A, count(1 << i)))
                return true;
        return false;
    }

    // Returns the count of digits of N
    // Eg. N = 112223334, returns [0,2,3,3,1,0,0,0,0,0]
    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }
}