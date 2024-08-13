class Solution {
    public String[] findWords(String[] words) {
        String q = "qwertyuiop";
        String a = "asdfghjkl";
        String z = "zxcvbnm";
        List<String> list = new LinkedList<>();
        for(String word : words){
            int[] row = new int[3];
            for(char ch : word.toLowerCase().toCharArray()){
                if(q.indexOf(ch) != -1){
                    row[0] = 1;
                }
                else if(a.indexOf(ch) != -1){
                    row[1] = 1;
                }
                else if(z.indexOf(ch) != -1){
                    row[2] = 1;
                }
            }
                int sum = row[0] + row[1] + row[2];
                if(sum == 1){
                    list.add(word);
                }
        }
        String[] ans = new String[list.size()];
        int i = 0;
        for(String str : list){
            ans[i++] = str;
        }
        return ans;
    }
}