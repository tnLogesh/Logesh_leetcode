class Solution {
    public List<String> removeSubfolders(String[] arr) {
        Arrays.sort(arr);
        Stack<String>s=new Stack<>();
        s.push(arr[0]);
        int n=arr.length;
        for(int i=1;i<n;i++){
            int sl=s.peek().length();
            int fl=arr[i].length();
            if(arr[i].contains(s.peek())){
                if(sl!=fl&&((arr[i].charAt(sl)!='/')||arr[i].charAt(1)!=s.peek().charAt(1))){
                    s.push(arr[i]);
                }
                
            }
            else{
                s.push(arr[i]);
            }
        }
        List<String>l=new ArrayList<>();
        while(!s.isEmpty()){
            l.add(s.pop());
        }
        List<String>l1=new ArrayList<>();
        for(int i=l.size()-1;i>=0;i--){
            l1.add(l.get(i));
        }
        return l1;
    }
}