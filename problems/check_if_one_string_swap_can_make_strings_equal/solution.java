class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
     if(s1.equals(s2)) return true;
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        if(!Arrays.equals(arr1,arr2)) return false; 
        //System.out.println(Arrays.toString(arr2));
        int count=0;
        for(int i=0; i<arr1.length; i++){
           if(s1.charAt(i)!=s2.charAt(i)) count++;
            if(count>2) return false;
        }
        return true;
    }
}