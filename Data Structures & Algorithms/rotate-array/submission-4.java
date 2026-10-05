class Solution {
    public void rotate(int[] nums, int k) {
        if(k>0 && k<=100000){
        if(k>nums.length){
            k = k % nums.length;
        }
       
        reverseArray(nums,0,nums.length);
        reverseArray(nums,0,k);
        reverseArray(nums,k,nums.length);
    }}
    public void reverseArray(int[] s,int starting, int limit) {
        int i =starting;
        int j =limit-1;

        for(;i<j;i++)
        {
        var temp = s[j];
        s[j]= s[i];
        s[i]=temp;
        j--;
        }
        
    }
}