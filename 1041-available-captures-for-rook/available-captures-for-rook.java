class Solution {
    public int numRookCaptures(char[][] board) {
        int attack=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    for(int ind=i+1;ind<8;ind++){
                        if(board[ind][j]=='p'){
                            attack++;
                            break;
                        }
                        else if(board[ind][j]=='B')break;
                    }
                    for(int ind=i-1;ind>=0;ind--){
                        if(board[ind][j]=='p'){
                            attack++;
                            break;
                        }
                        else if(board[ind][j]=='B')break;
                    }
                    for(int ind=j+1;ind<8;ind++){
                        if(board[i][ind]=='p'){
                            attack++;
                            break;
                        }
                        else if(board[i][ind]=='B')break;
                    }
                    for(int ind=j-1;ind>=0;ind--){
                        if(board[i][ind]=='p'){
                            attack++;
                            break;
                        }
                        else if(board[i][ind]=='B')break;
                    }
                    break;
                }
            }
        }
        return attack;
    }
}