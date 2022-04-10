class Solution {
    public int largestInteger(int num) {
         char arr[]=String.valueOf(num).toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>i; j--){
                int i_num=arr[i]-'0';
                int j_num=arr[j]-'0';
                if(i_num%2!=0 && j_num%2!=0 && j_num>i_num){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } 
            }            
        }
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>i; j--){
                int i_num=arr[i]-'0';
                int j_num=arr[j]-'0';
                if(i_num%2==0 && j_num%2==0 && j_num>i_num){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } 
            }            
        }
        
        // System.out.println(Arrays.toString(arr));
        return Integer.parseInt(new String(arr));
    }
}