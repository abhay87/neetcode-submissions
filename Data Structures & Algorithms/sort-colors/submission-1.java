class Solution {
    public void sortColors(int[] nums) {
        
          if(nums.length<300||nums.length>1){
        quickSort(nums,0,nums.length-1);
        }

    }
    public static void quickSort(int [] nums,int low, int high){
        if(low<high){
                    int pi = partitioned(nums,low,high);
                    quickSort(nums,low,pi-1);
                    quickSort(nums,pi+1,high);
        }
       

    }
    public static int  partitioned(int[] arr, int low,int high){
        int i = low-1;
        int pivot =arr[high];
        for(int j=low;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;

    }
    static void swap(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
    
