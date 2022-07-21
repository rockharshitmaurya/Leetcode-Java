class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0,cur[]=new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==0){
                    cur[j]=matrix[i][j]=='1'?1:0;
                }else{
                    cur[j]=matrix[i][j]=='0'?0:(cur[j]+1);
                }   
            }
            ans=Math.max(ans,largestRectangleArea(cur));
        }
        return ans;
    }
        public int largestRectangleArea(int[] heights) {
        int ans=0;
        int right[]=rightSmallest(heights);
        int left[]=leftSmallest(heights);
        // System.out.println(Arrays.toString(right));
        // System.out.println(Arrays.toString(left));
        
        for(int i=0; i<heights.length; i++){
            ans=Math.max(ans,((right[i]-left[i]-1) * heights[i]));
        }
        
        return ans;
    }
    int[] leftSmallest(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                left[i]=-1;
            }else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        return left;
    }
    int[] rightSmallest(int arr[]){
        int n=arr.length;
        int right[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                right[i]=n;
            }else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        return right;
    }
}