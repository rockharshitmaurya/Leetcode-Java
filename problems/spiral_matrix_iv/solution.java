/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][]=new int[m][n];
        // if(matrix.length == 0 || matrix[0].length == 0) return res;
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int set=-1;
        if(head==null) set=-1;
                else{
                    set=head.val;
                    head=head.next;
                }
        while(true){
            
            for(int i = left; i <= right; i++){
                matrix[top][i]=set;
                if(head==null) set=-1;
                else{
                    set=head.val;
                    head=head.next;
                }
            } 
            top++;
            if(left > right || top > bottom) break;
            
            for(int i = top; i <= bottom; i++){
                matrix[i][right]=set;
                if(head==null) set=-1;
                else{
                    set=head.val;
                    head=head.next;
                }
            } 
            right--;
            if(left > right || top > bottom) break;
            
            for(int i = right; i >= left; i--) {
                matrix[bottom][i]=set;
                if(head==null) set=-1;
                else{
                    set=head.val;
                    head=head.next;
                }
            }
            bottom--;
            if(left > right || top > bottom) break;
           
            for(int i = bottom; i >= top; i--){
               matrix[i][left]=set;
                 if(head==null) set=-1;
                    else{
                        set=head.val;
                        head=head.next;
                    }
            } 
            left++;
            if(left > right || top > bottom) break;
        }
        
        return matrix;
    }
}