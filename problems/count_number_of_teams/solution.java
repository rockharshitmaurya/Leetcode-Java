class Solution {
    public int numTeams(int[] rating) {
       // int n=rating.length,res=0;
       //  for(int j=0; j<n-2; j++){
       //      int max=rating[j];
       //      lable:
       //      for(int i=j; i<n; i++){
       //         if(rating[i]>max){
       //            int nmax=rating[i];
       //             for(int k=i; k<n; k++){
       //                if(rating[k]>nmax){
       //                    res++;
       //                    // break lable;
       //                }
       //            } 
       //         } 
       //      }
       //  }
       //      for(int j=n-1; j>=2; j--){
       //      int max=rating[j];
       //      lable:
       //      for(int i=j; i>=0; i--){
       //         if(rating[i]>max){
       //            int nmax=rating[i];
       //             for(int k=i; k>=0; k--){
       //                if(rating[k]>nmax){
       //                    res++;
       //                    // break lable;
       //                }
       //            } 
       //         } 
       //      }
       //  }
       //  return res;
        if (rating.length < 3) return 0;
        
int N = rating.length;

TreeSet<Integer> leftSet = new TreeSet<>();
TreeSet<Integer> rightSet = new TreeSet<>();

for (int i = N - 1; i >= 0; --i) rightSet.add(rating[i]);

int res = 0;
for (int i = 0; i < N; ++i) {
	int r = rating[i];
	
	rightSet.remove(r);
	res += (leftSet.headSet(r).size() * rightSet.tailSet(r).size());  	// count increase
	res += (leftSet.tailSet(r).size() * rightSet.headSet(r).size());  	// count decrease
	leftSet.add(r);
}

return res;
    }
}














//         int right[]=new int[n];
//         int left[]=new int[n];
//         int max=n-1;
//         right[n-1]=-1;
//         int res=0;
//         for(int i=n-2; i>=0; i--){
//             right[i]=rating[max]>rating[i]?max:-1;
//             max=rating[i]>rating[max]?i:max;
//         }
//         max=0;
//         left[0]=-1;
//          for(int i=1; i<n; i++){
            
//              left[i]=rating[max]>rating[i]?max:-1;
//                 max=rating[i]>rating[max]?i:max;
//         }
//         for(int i=0; i<n-3; i++){
//            if(right[i]!=-1 &&  right[right[i]]!=-1){
//               res++;
//            } 
//         }
//         System.out.println(Arrays.toString(right)+" "+rating[n-3]);
//         return res;