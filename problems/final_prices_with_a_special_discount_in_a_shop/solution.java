class Solution {
    public int[] finalPrices(int[] prices) {
        int len=prices.length,dis=0;
        int arr[]=new int[len];
        boolean flag=false;
        for(int i=0; i<len; i++){
            flag=false;
            dis=0;
            for(int j=i+1; j<len; j++){
                if(prices[i]>=prices[j]){
                    flag=true;
                    dis=prices[j];
                    break;
                }
            }
            arr[i]=flag?prices[i]-dis:prices[i];
        }
        return arr;
    }
}