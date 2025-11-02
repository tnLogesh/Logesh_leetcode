class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(a==e){
            if(c!=a||(d-b)*(d-f)>0)return 1;
        }
        if(b==f){
            if(d!=b||(c-a)*(c-e)>0)return 1;
        }
        if(c-d==e-f){
            if((a-b)!=(e-f)||(a-c)*(a-e)>0){
                return 1;
            }
        }
        if(c+d==e+f){
            if((a+b)!=(e+f)||(a-c)*(a-e)>0){
                return 1;
            }
        }
        return 2;
    }
}