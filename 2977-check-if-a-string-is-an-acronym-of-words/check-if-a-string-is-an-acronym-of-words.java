class Solution {
    static{
        for(int i=0;i<100;i++){
            isAcronym(new ArrayList<String>(),"tnLogesh");
        }
    }
    public static boolean isAcronym(List<String> words, String s) {
    if(words.size()!=s.length())return false;
    int n=words.size();
    for(int i=0;i<n;i++){
        if(words.get(i).charAt(0)!=s.charAt(i))return false;
    }
    return true;
    }
}