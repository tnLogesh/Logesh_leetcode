class Solution {
    public int totalNumbers(int[] digits) {
        int[]m=new int[10];
        for(int i:digits){
            m[i]++;
        }
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<10;i++){
            if(m[i]==0)continue;
            m[i]--;
            for(int j=0;j<10;j++){
                if(m[j]==0)continue;
                m[j]--;
                for(int k=0;k<9;k+=2){
                    if(m[k]==0)continue;
                    l.add(i*100+j*10+k);
                }
                m[j]++;
            }
            m[i]++;
        }
        return l.size();
    }
}