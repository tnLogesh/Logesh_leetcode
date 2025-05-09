class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        float[]average=new float[n/2];
        int c=0;
        int a=0;
        while(c<n/2){
            int min=Integer.MAX_VALUE;
            int max=-1;
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    min=Math.min(min,nums[i]);
                    max=Math.max(max,nums[i]);
                }

            }
            int cm=0;
            int cmi=0;
            for(int i=0;i<n;i++){
                if(nums[i]==min&&cmi==0){nums[i]=0;cmi++;}
                if(nums[i]==max&&cm==0){nums[i]=0;cm++;}
            }
            //System.out.println(min+" "+max+" "+(min+max)/2);
            average[a++]=(float)(max+min)/2;
            c++;
        }
        float min=51f;
        for(float i:average){
            if(i<min)min=i;
            //System.out.print(i+" ");
        }
        return min;
    }
}