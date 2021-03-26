class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> list=new ArrayList<String>();
        
        
        int count[]=new int[26],temp[];
		for(String str:B){
            temp=new int[26];
            for (char c : str.toCharArray()){
              temp[c - 'a']++;  
                count[c - 'a']=Math.max(count[c - 'a'],temp[c - 'a']);
            } 
        }
        
        for(String str:A){
           temp=Afreq(str);
            if(compare(temp,count)){
                list.add(str);
            }
        }
       
        return list;
    }
     int[] Afreq(String str){
        int arr[]=new int[26];
        for(char c:str.toCharArray()){
		    arr[c-'a']++;
		}
        return arr;
    }
    boolean compare(int arr[],int[] bfrq){
        for(int i=0; i<26; i++){
            if(arr[i]<bfrq[i]) return false;
        }
       
        
        return true;
    }
}