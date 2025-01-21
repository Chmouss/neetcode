import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsV2 {

    public static void main(String[] args) {

        String [] strs = {"act","pots","tops","cat","stop","hat"};
        //String [] strs = {"ddddddddddg","dgggggggggg"};
        System.out.println(Arrays.toString(strs));

        System.out.println(groupAnagrams(strs));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, List<String>> mapUniqueKeyAndWordsList = new HashMap<>();

        for (String string: strs){
            HashMap<Character, Integer> mapOccurences = new HashMap<>();
            for (char character: string.toCharArray()){
                mapOccurences.merge(character, 1, Integer::sum); //fills the key for the hashmap
            }

            if(mapUniqueKeyAndWordsList.containsKey(mapOccurences)){ //if the key already exists we add the word to the list
                mapUniqueKeyAndWordsList.get(mapOccurences).add(string);
            } else { //if it doesn't exist yet, we create a new one
                List<String> list = new ArrayList<>();
                list.add(string);
                mapUniqueKeyAndWordsList.put(mapOccurences, list);
            }

        }

        return new ArrayList<>(mapUniqueKeyAndWordsList.values());
    }

}
