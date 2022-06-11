class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length,m=potions.length;
        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            int l=0,r=m-1;
            long count=0;
            while(l<r){
                int mid=(l+r)/2;
                long a1=spells[i],b1=potions[mid];
                if(a1*b1<success){
                    l=mid+1;
                }else{
                    r=mid;
                }
            }
            long a1=spells[i],b1=potions[r];
                if(a1*b1<success){
                    count=0;
                }else{
                    count=(m-r);
                }
            
            spells[i]=(int)count;
        }
        return spells;
    }
     int lower(int array[], int key)
    {
        int lowerBound = 0;
 
        // Traversing the array using length function
        while (lowerBound < array.length) {
 
            // If key is lesser than current value
            if (key > array[lowerBound])
                lowerBound++;
 
            // This is either the first occurrence of key
            // or value just greater than key
            else
                return lowerBound;
        }
 
        return lowerBound;
    }
}