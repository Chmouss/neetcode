import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicate {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int arrayContainingDuplicates[] = {1,5,3,4,5,1,7,8,10,8};
        int arrayWithoutDuplicates[] = {1,5,7,8,10,4,3};
        //System.out.println(Arrays.toString(arrayContainingDuplicates));
        //System.out.println(Arrays.toString(arrayWithoutDuplicates));
        //boolean duplicates = hasDuplicate(arrayContainingDuplicates);
        //boolean noDuplicates = hasDuplicate(arrayWithoutDuplicates);

        System.out.println("duplicates == " + hasDuplicate(arrayContainingDuplicates));
        System.out.println("noDuplicates == " + hasDuplicate(arrayWithoutDuplicates));

    }

    public static boolean hasDuplicate(int[] nums) {

        //hashmap version
        /*
        HashMap<Integer, Integer> mapOccurences = new HashMap<>();

        for (int i = 0; i < nums.length; i ++){
            if(!mapOccurences.containsKey(nums[i])){
                mapOccurences.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
        */

        //Set version (better than hashmap in this case and way more simple)
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if(!set.add(nums[i]))
                return true;
        }

        return false;
    }

}