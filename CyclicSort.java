import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 3, 2 };
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

// class Solution {
// public int missingNumber(int[] nums) {
// int i=0;
// while(i<nums.length){
// if(nums[i]!=i && nums[i]<nums.lenght){
// int temp = nums[i];
// nums[i] = nums[temp];
// nums[temp] = temp;

// }else{
// i++;
// }
// }

// for(i=0;i<nums.length;i++){
// if(nums[i]!=i){
// return i;
// }
// }
// return -1;
// }

// }