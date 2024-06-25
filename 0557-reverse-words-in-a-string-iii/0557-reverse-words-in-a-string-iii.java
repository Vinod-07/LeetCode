class Solution {
       public static String rev(String s){
        int i=0,j=s.length()-1;
        char[] c=s.toCharArray();
        while(i<j){
            char ch=c[i];
            c[i]=c[j];
            c[j]=ch;
            i++; j--;
        }
        return new String(c);
    }
        

    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        for(String st:s.split(" ")){
            sb.append(rev(st)).append(" ");

        }
        return sb.toString().trim();
    }
    
}