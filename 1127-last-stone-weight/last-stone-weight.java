class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:stones){
            pq.offer(i);
        }
        int s1=0;
        int s2=0;
        while(pq.size()>1){
            s1=pq.poll();
            s2=0;
            if(!pq.isEmpty()){
                s2=pq.poll();
            }
            pq.offer(s1-s2);
        }
        return pq.remove();
    }
}