class Solution {
    public int maxProfit(int[] P, int fee) {
      // int obsp=-arr[0]; //old bougth state profit
      //   int ossp=0; //old sold state profit
      //   for(int i=1; i<arr.length; i++){
      //       int nbsp=0;
      //       int nssp=0;
      //       if(ossp-arr[i]>obsp){
      //           nbsp=ossp-arr[i];
      //       }else{
      //           nbsp=obsp;
      //       }
      //       if(obsp+arr[i]-fee>ossp){
      //        nssp=obsp+arr[i]-fee;   
      //       }else{
      //           nssp=ossp;
      //       }
      //       obsp=nbsp;
      //       ossp=nssp;
      //   }
      //   return ossp;
        
       
        int len = P.length, buying = -P[0], selling = 0;
        for (int i = 1; i < len; i++) {
            buying = Math.max(buying, selling - P[i]);
            selling = Math.max(selling, (buying+P[i] - fee));
        }
        return selling;
    

    }
}