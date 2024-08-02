import java.util.*;

class Solution{
    public static void reverseArray(int[] arr, int k){
        for(int i=0;i<arr.length;i+=k){
            int left=i;
            int right = Math.min(i+k-1, arr.length-1);//2 //5
            if((right+1)-left==k){
                while(left<right){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int k=3;
        reverseArray(arr, k);
        System.out.print(Arrays.toString(arr));
    }
}


//output ; [3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11]