class Solution {
    static int sod(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=sod(i);
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        int max=0;
        for(int i:m.keySet()){
            if(m.get(i)>max)max=m.get(i);
        }
        int c=0;
        for(int i:m.values()){
            if(max==i)c++;
        }
        return c;
    }
}