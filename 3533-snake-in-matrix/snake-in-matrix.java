class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][]arr=new int[n][n];
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=a++;
            }
        }
        int r=0,c=0;
        for(String i:commands){
            if(i.equals("DOWN"))r++;
            else if(i.equals("UP"))r--;
            else if(i.equals("RIGHT"))c++;
            else if(i.equals("LEFT"))c--;
        }
        return arr[r][c];
    }
}