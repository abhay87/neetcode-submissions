class Solution {
    public void reverseString(char[] s) {
        int i =0;
        int j =s.length-1;

        for(;i<j;i++)
        {
        var temp = s[j];
        s[j]= s[i];
        s[i]=temp;
        j--;
        }
        for(var ch :s){
            System.out.print(""+ch);
        }
    }
}