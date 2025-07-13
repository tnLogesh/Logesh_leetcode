class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int maxc=0;
        int ptr1=0;
        int ptr2=0;
        while(ptr1<players.length&&ptr2<trainers.length){
            if(players[ptr1]<=trainers[ptr2]){
            maxc++;
            ptr1++;
            ptr2++;
        }
            else{
                ptr2++;
            }
        }
        return maxc;
    }
}