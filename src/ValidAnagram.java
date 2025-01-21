import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        String s = "racecar";
        String t = "carrace";

        System.out.println("isAnagram == " + isAnagram(s, t));

        String a = "jar";
        String b = "jam";

        System.out.println("isAnagram == " + isAnagram(a, b));

    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> mapOccurencesS = new HashMap<>();
        HashMap<Character, Integer> mapOccurencesT = new HashMap<>();

        for (char character: s.toCharArray()){
            if(!mapOccurencesS.containsKey(character)){
                mapOccurencesS.put(character, 1);
            } else {
                mapOccurencesS.put(character, mapOccurencesS.get(character)+1); //update map
            }
        }

        for (char character: t.toCharArray()){
            if(!mapOccurencesT.containsKey(character)){
                mapOccurencesT.put(character, 1);
            } else {
                mapOccurencesT.put(character, mapOccurencesT.get(character)+1); //update map
            }
        }

        return (mapOccurencesS.equals(mapOccurencesT));
    }
}