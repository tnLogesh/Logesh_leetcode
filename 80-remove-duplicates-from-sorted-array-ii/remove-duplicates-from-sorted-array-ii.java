class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new LinkedHashSet<>();
        List<Integer>l=new ArrayList<>();
        for(int i:nums){
            set.add(i);
        }
        int count=0;
        for(int i:set){
            int c=0;
            System.out.print(i+" ");
            for(int j:nums){
                if(i==j)c++;
            }
            if(c==1){
                l.add(i);
                count++;
            }
            else if(c>=2){
                l.add(i);
                l.add(i);
                count+=2;
            }
        }
        int a=0;
        for(int i:l){
            nums[a]=i;a++;//System.out.print(i+" ");
        }
        //Arrays.sort(nums);
        return count;
    }
}