import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = {3,4,5,6,6};
        int target = 7;


        System.out.println(Arrays.toString(twoSum(nums, target)));

    }


    /// !! TODO: do this one again
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int indexes[] = new int[2];

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);//fill the map with (number, index) values
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference) != i){
                indexes[0] = i;
                indexes[1] = map.get(difference);
                return indexes;
            }
        }

        return new int [0];
    }
}