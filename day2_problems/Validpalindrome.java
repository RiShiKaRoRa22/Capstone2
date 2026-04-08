class Validpalindrome {
    public boolean isPalindrome(String s) {
        int len=s.length()-1;
        return pal(s,0,len);

    }
    public boolean pal(String s,int st,int len){
        if(st==len){
            return true;
        }
        else if(s.charAt(st)!=s.charAt(len)){
            return false;
        }
        return pal(s,++st,--len);

    }
}