class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list=new ArrayList<>();
        String arr[]=s.split(":");
        // for(char c=arr[0].charAt(0); c)
        int num1=arr[0].charAt(1)-'0';
        int num2=arr[1].charAt(1)-'0';
        if(num1<num2){
              char start=s.charAt(0);
                 char end=s.charAt(3);
            for(char c=start; c<=end; c++){
                
                
                for(int i=num1; i<=num2; i++){
                    // char add=;
                    list.add(c+""+i);
                }
            }
        }else{
             // for(String st:arr){
                char start=s.charAt(0);
            char end=s.charAt(3);
            int num=s.charAt(4)-'0';
            for(char c=start; c<=end; c++){
                list.add(c+""+num);
            }
                // for(; i<=num2; i++){
                //     // char add=;
                //     list.add(c+""+i);
                // }
            // }
        }
        return list;
        
    }
}