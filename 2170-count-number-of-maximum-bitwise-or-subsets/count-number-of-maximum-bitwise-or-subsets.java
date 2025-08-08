class Solution {
    public int countMaxOrSubsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        possibleSubset(0,nums,new ArrayList<>(),l);
        int max=0;
        int last=0;
        for(int i:nums){
            last|=i;
        }
        for(List<Integer>l1:l){
            int sum=0;
            for(int j:l1){
                sum|=j;
            }
            if(last==sum)max++;
        }
        return max;
    }
    static void possibleSubset(int index,int[]arr,List<Integer>current,List<List<Integer>>result){
        result.add(new ArrayList<>(current));
        for(int i=index;i<arr.length;i++){
            current.add(arr[i]);
            possibleSubset(i+1,arr,current,result);
            current.remove(current.size()-1);
        }
    }
}