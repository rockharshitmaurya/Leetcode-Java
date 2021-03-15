public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        char arr[]=longUrl.toCharArray();
        String str="";
        for(char c:arr){
            str+=(char)++c;
        }
        return str;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String str2="";
        char arr2[]=shortUrl.toCharArray();
        for(int c:arr2){
            str2+=(char)--c;
        }
        return str2;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));