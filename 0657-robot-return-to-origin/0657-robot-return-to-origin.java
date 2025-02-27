class Solution {
    public boolean judgeCircle(String moves) {
        // if(moves.length() % 2 != 0){
        //     return false;
        // }
        // int ud = 0;
        // int lr = 0;
        // for(int i = 0; i < moves.length(); i++){
        //     char a = moves.charAt(i);
        //     if(a == 'L'){
        //         lr++;
        //     }
        //     else if(a == 'R'){
        //         lr--;
        //     }
        //     else if(a == 'U'){
        //         ud++;
        //     }
        //     else{
        //         ud--;
        //     }
        // }
        // return (ud == 0 && lr == 0) ? true : false;


        int UpDown = 0;
        int LeftRight = 0;

        for (char c : moves.toCharArray() )
        {
            switch (c){
                case 'U':
                    UpDown++;
                    break;
                case 'D':
                    UpDown--;
                    break;
                case 'L':
                    LeftRight++;
                    break;
                case 'R':
                    LeftRight--;
                    break;
            }
        }
        return (LeftRight == 0 && UpDown == 0); 
    }
}