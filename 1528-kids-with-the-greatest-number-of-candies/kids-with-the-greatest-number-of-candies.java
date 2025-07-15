class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=0;
        for(int i:candies){
            if(max<i){
                max=i;
            }
        }
        for(int i:candies){
            l.add(i+extraCandies>=max);
        }
        return l;
    }
}