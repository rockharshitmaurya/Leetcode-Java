class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String arr[]=text.split(" ");
        int len=arr.length;
        ArrayList<String> list=new ArrayList<>();
        for(int i=0; i<len-2; i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)) list.add(arr[i+2]);
        }
        // System.out.println(arr[len-3]);
        return list.toArray(new String[0]);
    }
}