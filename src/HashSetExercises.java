import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExercises {
    public static void main(String[] args) {
        appendElement();
        iterateSet();
        getSetSize();
        clearSet();
        isSetEmpty();
        cloneSet();
        convertToArray();
        convertToTreeSet();
        findInTreeSet();
        compareTwoSets();
        getCommonElements();
        removeAll();
    }

    private static void removeAll() {
        System.out.println("12. Write a Java program to remove all elements from a hash set.");
        HashSet<Integer> numbers = getNumbers();
        System.out.println(numbers);
        numbers.clear();
        System.out.println("after" + numbers);
        printSep();
    }

    private static void getCommonElements() {
        System.out.println("11. Write a Java program to compare two sets and retain elements that are the same.");
        HashSet<Integer> first = getNumbers();
        HashSet<Integer> seconds = getNumbers();
        for (int i = 1; i < 5; i++) {
            first.add(i * -3);
            seconds.add(i *  3);
        }
        HashSet<Integer> in = new HashSet<>(first);
        in.retainAll(seconds);
        System.out.println(first + "" + seconds);
        System.out.println("common : " + in);
        printSep();
    }

    private static void compareTwoSets() {
        System.out.println("10. Write a Java program to compare two hash set.");
        HashSet<Integer> first = getNumbers();
        HashSet<Integer> second = getNumbers();

        String result = compareSets(first, second) ? " == "  : " != ";
        System.out.println(first + result + second);

        second.remove(3);
        result = compareSets(first,second) ?  " == "  : " != ";
        System.out.println(first + result + second);

        first.remove(1);
        result = compareSets(first,second) ?  " == "  : " != ";
        System.out.println(first + result + second);

        printSep();
    }

    private static boolean compareSets(HashSet<Integer> first, HashSet<Integer> second) {
        if (first.size() == second.size()) {
            HashSet<Integer> in = new HashSet<>(first);
            in.removeAll(second);

            return in.size() == 0;
        }
        return false;
    }

    private static void findInTreeSet() {
        System.out.println("9. Write a Java program to find numbers less than 7 in a tree set.");
    }

    private static void convertToTreeSet() {
        System.out.println("8. Write a Java program to convert a hash set to a tree set.");
    }

    private static void convertToArray() {
        System.out.println("7. Write a Java program to convert a hash set to an array.");
        HashSet<Integer> numbers = getNumbers();
        System.out.println(numbers);
        ArrayList<Integer>  numbersArr = new ArrayList<>(numbers);
        System.out.println("array " + numbersArr);
        printSep();
    }

    private static void cloneSet() {
        System.out.println("6. Write a Java program to clone a hash set to another hash set.");
        HashSet<Integer> numbers = getNumbers();
        HashSet<Integer> clone = new HashSet<>(numbers);
        System.out.println(numbers + " " + clone);
        numbers.add(241);
        System.out.println(numbers + " " + clone);
        printSep();
    }
    private static void isSetEmpty() {
        System.out.println("5. Write a Java program to test if a hash set is empty or not.");
        HashSet<Integer> numbers = getNumbers();
        System.out.println(numbers + " is empty : " + numbers.isEmpty());
        numbers.clear();
        System.out.println(numbers + " is empty : " + numbers.isEmpty());
        printSep();
    }

    private static void clearSet() {
        System.out.println("4. Write a Java program to empty an hash set.");
        HashSet<Integer> numbers = getNumbers();
        System.out.println(numbers);
        numbers.clear();
        System.out.println("after clear : " + numbers);
        printSep();
    }

    private static void getSetSize() {
        System.out.println("3. Write a Java program to get the number of elements in a hash set.");
        HashSet<Integer> numbers = getNumbers();
        System.out.println(numbers);
        System.out.println("size : " + numbers.size());
        printSep();
    }

    private static void iterateSet() {
        System.out.println("2. Write a Java program to iterate through all elements in a hash list.");
        HashSet<Integer> numbers = getNumbers();
        System.out.println(numbers);
        for (Integer element : numbers)  {
            System.out.println(element);
        }
        printSep();
    }

    private static void appendElement() {
        System.out.println("1. Write a Java program to append the specified element to the end of a hash set.");
        HashSet<Integer> numbers = getNumbers();
        int valueToAdd = 50;
        System.out.println(numbers);
        System.out.println("value to add : " + valueToAdd);
        numbers.add(valueToAdd);
        System.out.println(numbers);
        printSep();
    }


    private static HashSet<Integer> getNumbers() {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0 ; i < 5; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    private static void printSep() {
        System.out.println("================");
    }

}
