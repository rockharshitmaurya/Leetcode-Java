class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int i=0,j=0;
        
        while(i>=0 && i<n && j>=0 && j<m){
            if(matrix[i][j]==target) return true;
            // System.out.println(i+" "+j);
            if((j+1)<m && matrix[i][j+1]<=target) j++;
            else if((i+1)<n && matrix[i+1][j]<=target) i++;
            else {
                i++;
                j=0;
            }
            // System.out.println(i+" "+j);
        }
        
        return false;
    }
    int binarySearch(int arr[],int target,int l ,int r){
       if(l<=r){  
            int mid=(l+r)>>1;
           
            if(arr[mid]==target) return mid;

            if(arr[mid]<target) return binarySearch(arr,target,mid+1,r);
            return binarySearch(arr,target,l,mid-1);
       }
        return -1;
    }
}