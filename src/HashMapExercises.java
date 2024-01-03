package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercises {
    public static void main(String[] args) {
        addValue();
        keyCount();
        copyMap();
        clearMap();
        containsKeyValue();
        shallowCopy();
        hasKey();
        hasValue();
        getEntries();
        getValue();
        getKeys();
        getValues();
    }

    private static void getValues() {
        System.out.println("Write a Java program to get a collection view of the values contained in this map.");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        System.out.println("values : " + pows.values());
        printSep();
    }

    private static void getKeys() {
        System.out.println("11. Write a Java program to get a set view of the keys contained in this map.");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        Set<Integer> keys = pows.keySet();
        System.out.println("keys : " + keys);
        printSep();
    }

    private static void getValue() {
        System.out.println("10. Write a Java program to get the value of a specified key in a map.");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        int key = 4;
        System.out.println("value at " + key + " = " + pows.get(key));
        printSep();
    }

    private static void getEntries() {
        System.out.println("9. Write a Java program to create a set view of the mappings contained in a map.");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        Set<Map.Entry<Integer, Integer>> entries = pows.entrySet();
        System.out.println(entries);
        printSep();
    }

    private static void hasValue() {
        System.out.println("8. Write a Java program to test if a map contains a mapping for the specified value.");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        int value = 16;
        System.out.println("contains value : " + value + "-> " + pows.containsValue(value));
        value = 3;
        System.out.println("contains value : " + value + "-> " + pows.containsValue(value));
        printSep();
    }

    private static void hasKey() {
        System.out.println("7. Write a Java program to test if a map contains a mapping for the specified key.");
        HashMap<Integer, Integer> pows = getPows();
        int key = 5;
        System.out.println(pows);
        System.out.println("contains : " + key + " ->" + pows.containsKey(key));
        key = 55;
        System.out.println("contains : " + key + " ->" + pows.containsKey(key));
        printSep();
    }

    private static void shallowCopy() {
        System.out.println("6. Write a Java program to get a shallow copy of a HashMap instance.");
        HashMap<Integer, Integer> pows = getPows();
        HashMap<Integer, Integer> sCopy = (HashMap<Integer, Integer>) pows.<HashMap<Integer, Integer>>clone();

        System.out.println(pows + " : " + sCopy);
        printSep();
    }

    private static void containsKeyValue() {
        System.out.println("5. Write a Java program to check whether a map contains key-value mappings (empty) or not.");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        String toCheck = "2=4 ->";
        boolean contains = pows.containsKey(2) && pows.get(2) == 4;
        System.out.println(pows + "contains :" + toCheck + contains);
        toCheck = "3=5 ->";
        contains = pows.containsKey(3) && pows.get(2) == 5;
        System.out.println(pows + "contains :" + toCheck + contains);
        printSep();
    }

    private static void clearMap() {
        System.out.println("4. Write a Java program to remove all mappings from a map");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        pows.clear();
        System.out.println(pows);
        printSep();
    }

    private static void copyMap() {
        System.out.println("3. Write a Java program to copy all mappings from the specified map to another map");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        HashMap<Integer, Integer> copy = new HashMap<>(pows);
        System.out.println("pows : " + pows);
        System.out.println("copy : " + copy);
        pows.put(6, (int) Math.pow(2, 6));
        System.out.println("pows : " + pows);
        System.out.println("copy : " + copy);
        printSep();
    }

    private static void keyCount() {
        System.out.println("2. Write a Java program to count the number of key-value (size) mappings in a map.");
        HashMap<Integer, Integer> pows = getPows();
        System.out.println(pows);
        System.out.println(pows.keySet().size());
        printSep();
    }

    private static void addValue() {
        System.out.println("1. Write a Java program to associate the specified value with the specified key in a HashMap");
        HashMap<Integer, String> entry = new HashMap<>();
        entry.put(0, "hello");
        entry.put(1, "world");

        System.out.println(entry);
        printSep();
    }

    private static HashMap<Integer, Integer> getPows() {
        HashMap<Integer, Integer> pows = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            pows.put(i, (int) Math.pow(2, i));
        }
        return pows;
    }

    private static void printSep() {
        System.out.println("===============");
    }
}
