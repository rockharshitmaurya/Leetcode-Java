class Solution {
    private boolean[][] visited;
    
    public boolean isInterleave(String s1, String s2, String s3) {
        if (visited == null) visited = new boolean[s1.length() + 1][s2.length() + 1];
        if (s3.isEmpty()) return s1.isEmpty() && s2.isEmpty();
        if (visited[s1.length()][s2.length()]) return false; // must be false!
        
        if (!s1.isEmpty() && s1.charAt(0) == s3.charAt(0) 
            && isInterleave(s1.substring(1), s2, s3.substring(1))) return true;
        if (!s2.isEmpty() && s2.charAt(0) == s3.charAt(0)
            && isInterleave(s1, s2.substring(1), s3.substring(1))) return true;
        visited[s1.length()][s2.length()] = true;
        return false;
    }
}