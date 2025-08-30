class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            String str="";
            Set<Character>set=new HashSet<>();
            String str1="";
            Set<Character>ch=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    str+=board[i][j];
                    set.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                    str1+=board[j][i];
                    ch.add(board[j][i]);
                }
            }
            if(str.length()!=set.size()){
                //System.out.println("in row");
                return false;
            }
            if(str1.length()!=ch.size()){
                //System.out.println("in column");
                return false;
            }
        }
        // for(int i=0;i<9;i+=3){
        //     String str1="",str2="",str3="";
        //     Set<Character>s1=new HashSet<>();
        //     Set<Character>s2=new HashSet<>();
        //     Set<Character>s3=new HashSet<>();
        //     for(int j=i;j<i+3;j++){
        //         for(int k=0;k<3;k++){
        //             str1+=board[j][k];
        //             s1.add(board[j][k]);
        //         }
        //         for(int k=3;k<6;k++){
        //             str2+=board[j][k];
        //             s2.add(board[j][k]);
        //         }
        //         for(int k=6;k<9;k++){
        //             str3+=board[j][k];
        //             s3.add(board[j][k]);
        //         }
        //     }
        //     if(str1==""||str2==""||str3=="")return false;
        //     if(str1.length()!=s1.size())return false;
        //     if(str2.length()!=s2.size())return false;
        //     if(str3.length()!=s3.size())return false;
        // }
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                Set<Character> s1 = new HashSet<>();
                for(int k_row = i; k_row < i + 3; k_row++){
                    for(int k_col = j; k_col < j + 3; k_col++){
                        char num = board[k_row][k_col];
                        if(num != '.'){
                            if(!s1.add(num)){
                                return false; 
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}