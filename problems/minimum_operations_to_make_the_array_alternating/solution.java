class Solution {
    public int minimumOperations(int[] nums) {
        int even[]=new int[100001];
        int odd[]=new int[100001];
        int len=nums.length;
        int maxlimit=0;
        for(int i=0; i<len; i++){
            if(i%2==0){
                even[nums[i]]++;
            }else{
            odd[nums[i]]++;
            }
            maxlimit=Math.max(maxlimit,nums[i]);
        }
        
        int firstMaxEven=0,frqFirstMaxEven=0;
        int firstMaxOdd=0,frqFirstMaxOdd=0; 
        
        int secondMaxEven=0,frqSecondMaxEven=0;
        int secondMaxOdd=0,frqSecondMaxOdd=0;
        
        for(int i=1; i<=maxlimit; i++){
            
            if(frqFirstMaxEven<=even[i]){
                secondMaxEven=firstMaxEven;
                frqSecondMaxEven=frqFirstMaxEven;                   
                    
                frqFirstMaxEven=even[i];
                firstMaxEven=i;
                
            }else if(even[i]>frqSecondMaxEven){
                frqSecondMaxEven=even[i];
                secondMaxEven=i;
            }
            
            if(frqFirstMaxOdd<=odd[i]){
                secondMaxOdd=firstMaxOdd;
                frqSecondMaxOdd=frqFirstMaxOdd;                   
                    
                frqFirstMaxOdd=odd[i];
                firstMaxOdd=i;
                
            }else if(odd[i]>frqSecondMaxOdd){
                frqSecondMaxOdd=odd[i];
                secondMaxOdd=i;
            }
            
            
        }
        
        if(firstMaxEven!=firstMaxOdd){
            return len-frqFirstMaxEven-frqFirstMaxOdd;
        }
         System.out.println(even+" "+odd);
        return Math.min((len-frqFirstMaxEven-frqSecondMaxOdd),(len-frqFirstMaxOdd-frqSecondMaxEven));
        
        // System.out.println(even+" "+odd);
        // return 0;
    }
}