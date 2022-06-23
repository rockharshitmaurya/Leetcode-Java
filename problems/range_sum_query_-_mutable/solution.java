class NumArray {
    int seg[],num[];
    int n=0;
    public NumArray(int[] nums) {
        seg=new int[nums.length*4];
        num=nums;
        build(0,0,nums.length-1,nums);
        n=nums.length;
    }
    
    public void update(int index, int val) {
        // num[index]=val-num[index];
        updateSeg(0,index,val,0,num.length-1);
    }
    
    public int sumRange(int left, int right) {
        return query(0,0,n-1,left,right);
    }
    void updateSeg(int idx,int i,int diff,int start,int end){
        if (i<start || i>end){
            return;
        }
        // seg[idx]+=diff;
        // if(start==end) return;
        if(start==end){
            if(start==i)
                seg[idx]=diff;
            return;
        }
        int mid=(start+end)>>1;
        updateSeg(2*idx+1,i,diff,start,mid);
        updateSeg(2*idx+2,i,diff,mid+1,end);
        seg[idx]=seg[2*idx+1]+seg[2*idx+2];
    }
    int query(int idx,int start,int end,int l,int r){
        if (l <= start && r>= end){ 
            return seg[idx];
        }
        if (l>end || r<start) {
            return 0;
        }
        int mid=(start+end)>>1;
        return query(2*idx+1,start,mid,l,r)+query(2*idx+2,mid+1,end,l,r);
    }
    void build(int idx,int start,int end,int arr[]){
        if(start==end){
           seg[idx]=arr[start];
            return;
        }
        int mid=(start+end)>>1;
        build(2*idx+1,start,mid,arr);
        build(2*idx+2,mid+1,end,arr);
        seg[idx]=seg[2*idx+1]+seg[2*idx+2];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */