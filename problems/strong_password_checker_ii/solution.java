class Solution {
    public boolean strongPasswordCheckerII(String pwd) {
        boolean len=false,digit=false,upper=false,lower=false,spchar=false,adj=true;
        if(pwd.length()>=8) len=true;
        for(int i=0; i<pwd.length(); i++){
            if(Character.isLowerCase(pwd.charAt(i))) lower=true;
            if(Character.isUpperCase(pwd.charAt(i))) upper=true;
            if(Character.isDigit(pwd.charAt(i))) digit=true;
            if("!@#$%^&*()-+".indexOf(pwd.charAt(i))!=-1) spchar=true;
            if(i<pwd.length()-1) if(pwd.charAt(i)==pwd.charAt(i+1)) adj=false;
        }
        return (len && digit && upper && lower && spchar && adj);
    }
}