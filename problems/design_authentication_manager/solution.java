class AuthenticationManager {
    int ttl;
    HashMap<String,Integer> map=new HashMap<>();
    public AuthenticationManager(int timeToLive) {
        ttl=timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        map.put(tokenId,currentTime);
    }
    
    public void renew(String tokenId, int currentTime) {
        if(map.containsKey(tokenId) && map.get(tokenId)+ttl>currentTime)
            map.put(tokenId,currentTime);
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int res=0;
        for(int v:map.values()){
            if(v+ttl>currentTime) res++;
        }
        return res;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */