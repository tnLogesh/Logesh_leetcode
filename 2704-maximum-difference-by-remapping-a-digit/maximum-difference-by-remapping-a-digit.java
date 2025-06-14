class Solution {
    public int minMaxDifference(int num1) {
        String str="";
        int num=num1;
        while(num>0){
            int rem=num%10;
            str+=rem;
            num/=10;
        }
        str=new StringBuilder(str).reverse().toString();
        //System.out.println(str);
        int sum=0;
        int max=num1;
        int min=num1;
        char ch=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<'9'){
                ch=str.charAt(i);
                break;
            }
        }
        String bb="";
        String cc="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                bb+="9";
            }
            else{
                bb+=str.charAt(i);
            }
        }
        ch=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                cc+="0";
            }
            else{
                cc+=str.charAt(i);
            }
        }
        //System.out.println(bb+" "+cc);
        int a=Integer.parseInt(bb)-Integer.parseInt(cc);
        return a;
    }
}