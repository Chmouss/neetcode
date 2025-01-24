package BinarySearch;

import LinkedLists.ReverseLinkedList;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int [] nums = {-1,0,2,4,6,8};
        int target = 4;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;

        while(l <= r){
            int middle = (l+r) / 2;
            if(nums[middle] == target){
                return middle;
            } else if(target < nums[middle]){
                r = middle - 1;
            } else { // if target > middle
                l = middle + 1;
            }
        }

        return -1;
    }

}
