class Solution {
    public int subtractProductAndSum(int n) {
     int product=1;
        int n1=n;
     int sum=0;
         while (n != 0 && n1!=0) {
            sum = sum + n % 10;
             n = n / 10;
             product*=n1%10;
             n1=n1/10;
        }
 
        return product-sum;  
    }
}