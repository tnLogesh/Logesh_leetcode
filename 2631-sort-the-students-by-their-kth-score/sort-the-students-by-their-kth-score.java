class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int[][]result=new int[n][score[0].length];
        Map<Integer,int[]>map=new TreeMap<>(Collections.reverseOrder());
        for(int[] i:score){
            map.put(i[k],i);
        }
        int ind=0;
        for(Map.Entry<Integer,int[]>m:map.entrySet()){
            result[ind++]=m.getValue();
        }
        return result;
    }
}