class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length() % 2 != 0){
            return false;
        }
        int ud = 0;
        int lr = 0;
        for(int i = 0; i < moves.length(); i++){
            char a = moves.charAt(i);
            if(a == 'L'){
                lr++;
            }
            if(a == 'R'){
                lr--;
            }
            if(a == 'U'){
                ud++;
            }
            if(a == 'D'){
                ud--;
            }
        }
        return (ud == 0 && lr == 0) ? true : false;
    }
}