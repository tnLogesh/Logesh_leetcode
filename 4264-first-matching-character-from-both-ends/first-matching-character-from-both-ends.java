class Solution {
    public int firstMatchingIndex(String s) {
        int result=-1;
        int ind1=0;
        int ind2=s.length()-1;
        while(ind1<=ind2){
            if(s.charAt(ind1)==s.charAt(ind2))return ind1;
            ind1++;
            ind2--;
        }
        return result;
    }
}