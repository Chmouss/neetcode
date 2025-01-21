import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

        String [] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println("Hello world!");
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        //map that contains the index of the string as a value
        //the key is a map with the character and the number of occurences of that character in the string
        HashMap<Integer, HashMap<Character, Integer>> mapIndexCharacterOccurences = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] tab = strs[i].toCharArray();
            HashMap <Character, Integer> mapToAdd = new HashMap<>();

            for (char character: tab){
                //HashMap <Character, Integer> mapToAdd = new HashMap<>();
                //mapToAdd.put(character, 1);
                //mapIndexCharacterOccurences.put(i, mapToAdd);
                mapToAdd.merge(character, 1, Integer::sum);
            }

            mapIndexCharacterOccurences.put(i, mapToAdd);

        }

        return null;
    }

}