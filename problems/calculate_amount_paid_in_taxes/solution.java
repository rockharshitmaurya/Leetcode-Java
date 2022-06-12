class Solution {
    public double calculateTax(int[][] br, int inc) {
        if(br[0][0]>inc){
                br[0][0]=inc;
        }
        double ans=(Math.min(br[0][0],inc)*br[0][1]*1.0)/100;
        System.out.println(br[0][0]+" "+br[0][1]);
        for(int i=1; i<br.length; i++){
            if(inc==0) break;
            if(br[i][0]>inc){
                br[i][0]=inc;
            }
            int val=(br[i][0]-br[i-1][0]);
            System.out.println(val+" "+br[i][1]);
            // val=Math.min(val,inc);
            // inc-=val;
            ans+=((val*br[i][1]*1.0)/100);
            System.out.println("% :"+ans);
        }
        return ans;
    }
}