/**
 * @param {number} n
 * @return {number}
 */
var tribonacci = function(n) {
    let f=0,s=1,t=1,sum;
    if(n==0) return 0;
    if(n==1 || n==2) return 1;
    for(let i=3; i<=n; i++){
        sum=t+s+f;
        f=s;
        s=t;
        t=sum;
    }
    return t;
};