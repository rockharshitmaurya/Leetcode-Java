class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        long h_max=0,v_max=0;
        Arrays.sort(hc);
        Arrays.sort(vc);
        int mod=(int)1e9 + 7;
        for(int i=1; i<vc.length; i++){
            v_max=Math.max(v_max,vc[i]-vc[i-1]);
        }
        v_max=Math.max(v_max,vc[0]);
        v_max=Math.max(v_max,w-vc[vc.length-1]);
        for(int i=1; i<hc.length; i++){
            h_max=Math.max(h_max,hc[i]-hc[i-1]);
        }
        h_max=Math.max(h_max,hc[0]);
        h_max=Math.max(h_max,h-hc[hc.length-1]);
        return (int)((h_max*v_max)%mod);
    }
}