class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>l=new ArrayList<>();
        int n=words.length;
        io:
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(!words[j].equals("0")&&!words[i].equals("0")&&isAnagram(i,j,words)){
                    words[j]="0";
                }
                else{
                    continue io;
                }
            }
        }
        for(String i:words){
            if(!i.equals("0"))l.add(i);
        }
        return l;
    }
    boolean isAnagram(int i,int j,String[]words){
        if(words[i].length()!=words[j].length())return false;
        char[]arr1=words[i].toCharArray();
        char[]arr2=words[j].toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int a=0;a<arr1.length;a++){
            if(arr1[a]!=arr2[a])return false;
        }
        return true;
    }
}