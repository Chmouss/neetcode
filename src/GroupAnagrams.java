import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String [] strs = {"ddddddddddg","dgggggggggg"};
        System.out.println(Arrays.toString(strs));

        System.out.println(groupAnagrams(strs));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        //map that contains the index of the string as a value
        //the key is a map with the character and the number of occurences of that character in the string
        HashMap<Integer, HashMap<Character, Integer>> mapIndexCharacterOccurences = new HashMap<>();

        //iterate on each string from the array of string given in parameter
        for (int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> mapOccurences = new HashMap<>();

            //we iterate on each character from each string
            for (char character: strs[i].toCharArray()){
                mapOccurences.merge(character, 1, Integer::sum); // might not work, change with merge if no workies
            }
            mapIndexCharacterOccurences.put(i, mapOccurences);

        }

        //group all anagrams together
        //List<String> stringsList = new ArrayList<>();
        List<List<String>> listOfStringLists = new ArrayList<>();
        Set<String> set = new HashSet<>();

        //parcourir la map, on cherche tout ceux qui ont une valeur egale, on fait un tableau avec toutes ces strings
        //a la fin, si le tableau ne contient pas notre liste de strings, on l'ajoute
        for (int i = 0; i < mapIndexCharacterOccurences.size(); i++) {
            if(set.contains(strs[i])) continue;
            //Set<String> set = new HashSet<>();
            List<String> stringsList = new ArrayList<>();
            stringsList.add(strs[i]);
            set.add(strs[i]);
            for (int j = 0; j < mapIndexCharacterOccurences.size(); j++) {
                if(mapIndexCharacterOccurences.get(i).equals(mapIndexCharacterOccurences.get(j)) && (i != j) ){
                    stringsList.add(strs[j]);
                    set.add(strs[j]);
                }
            }
            //soit sort la liste avant de l'ajouter , soit trouver une autre solution ?
            if(!listOfStringLists.contains(stringsList))
                listOfStringLists.add(stringsList);

        }

        return listOfStringLists;
    }

}