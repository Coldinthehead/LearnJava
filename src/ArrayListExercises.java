package src;

import java.util.ArrayList;

public class ArrayListExercises {
    public static void main(String[] args) {
        colorsArray();
        iterateArray();
        insertAtFirst();
        retrieveElement();
        updateElement();
        removeThird();
        searchArray();
        sortArray();
        createCopy();
        shuffleArray();
        reverseArray();
        sliceArray();
        compareArrays();
        swapElements();
        concatArrays();
        cloneArray();
        clearArray();
        empty();
        trim();
        increaseSize();
        replaceSecond();
        printArray();
    }

    public static void colorsArray() {
        System.out.println("1. Write a Java program to create an array list, add some colors (strings) and print out the collection");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println(colors);
        printSep();
    }

    public static void iterateArray() {
        System.out.println("2. Write a Java program to iterate through all elements in an array list.");
        ArrayList<Integer> numbers = getNumbersArray();

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("item at " + i + " " + numbers.get(i));
        }

        printSep();
    }

    public static void insertAtFirst() {
        System.out.println("3. Write a Java program to insert an element into the array list at the first position.");
        ArrayList<Integer> numbers = getNumbersArray();
        System.out.println(numbers);
        numbers.add(0, 50);
        System.out.println(numbers);
        printSep();
    }

    public static void retrieveElement() {
        System.out.println("4. Write a Java program to retrieve an element (at a specified index) from a given array list.");
        ArrayList<String> words = getWordsArray();
        System.out.println(words);
        System.out.println(words.remove(1) +  "at index : " + 1);
        System.out.println(words);
        printSep();
    }

    public static void updateElement() {
        System.out.println("5. Write a Java program to update an array element by the given element.");
        ArrayList<String> words = getWordsArray();
        System.out.println(words);
        System.out.println("Fizz at 1");
        words.set(1, "Fizz");
        System.out.println(words);
        printSep();
    }

    public static void removeThird() {
        System.out.println("6. Write a Java program to remove the third element from an array list.");
        ArrayList<Integer> numbers = getNumbersArray();
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        printSep();
    }

    public static void searchArray() {
        System.out.println("7. Write a Java program to search for an element in an array list.");
        ArrayList<Integer> numbers = getNumbersArray();
        System.out.println(numbers);
        int searchItem = 5;
        int index = numbers.indexOf(searchItem);
        System.out.println("index of 5 : " + index);
        printSep();
    }

    public static void sortArray() {
        System.out.println("8. Write a Java program to sort a given array list.");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(getNumbersArray());
        System.out.println(numbers);
        ArrayList<Integer> sorted = qSort(numbers);
        System.out.println(sorted);
        printSep();
    }

    private static ArrayList<Integer> qSort(ArrayList<Integer> arr) {
        if (arr.size() == 1 || arr.size() == 0) {
            return arr;
        } else {
            final int pivot = (int) (Math.random() * arr.size());
            final int pivotItem = arr.get(pivot);

            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
            for (int i = 0; i < pivot; i++) {
                Integer item = arr.get(i);
                if (item > pivotItem)
                    right.add(item);
                else
                    left.add(item);
            }
            for (int i = pivot + 1; i < arr.size(); i++) {
                Integer item = arr.get(i);
                if (item > pivotItem)
                    right.add(item);
                else
                    left.add(item);
            }

            ArrayList<Integer> sorted = new ArrayList<>();
            sorted.addAll(qSort(left));
            sorted.add(pivotItem);
            sorted.addAll(qSort(right));
            return sorted;
        }
    }

    public static void createCopy() {
        System.out.println("9. Write a Java program to copy one array list into another.");
        ArrayList<String> words = getWordsArray();
        System.out.println(words);
        ArrayList<String> wordsCopy = new ArrayList<>(words);
        System.out.println(wordsCopy);
        printSep();
    }

    public static void shuffleArray() {
        System.out.println("10. Write a Java program to shuffle elements in an array list.");
        ArrayList<Integer> arr = getNumbersArray();
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            int shuffleIndex = (int) (Math.random() * arr.size());
            arr.set(i, arr.get(shuffleIndex));
            arr.set(shuffleIndex, current);
        }
        System.out.println(arr);
        printSep();
    }

    public static void reverseArray() {
        System.out.println("11. Write a Java program to reverse elements in an array list.");
        ArrayList<Integer> arr = getNumbersArray();
        System.out.println(arr);
        for (int i = 0; i < arr.size() / 2; i++) {
            int left = arr.get(i);
            int rightIndex = arr.size() - i - 1;
            int right = arr.get(rightIndex);
            arr.set(rightIndex, left);
            arr.set(i, right);
        }
        System.out.println(arr);
        printSep();
    }

    public static void sliceArray() {
        System.out.println("12. Write a Java program to extract a portion of an array list.");
        ArrayList<Integer> numbers = getNumbersArray();
        int start = 2;
        int stop = 5;
        System.out.println(numbers);
        System.out.println("start : 2 , stop : 5");
        ArrayList<Integer> slice = new ArrayList<>();
        for (int i = start; i < stop; i++) {
            slice.add(numbers.get(i));
        }
        System.out.println(slice);
        printSep();
    }

    public static void compareArrays() {
        System.out.println("13. Write a Java program to compare two array lists.");
        ArrayList<String> first = getWordsArray();
        ArrayList<String> second = getWordsArray();
        System.out.println(first + " " + second);
        boolean same = compareArrs(first, second);
        System.out.println(same ? "same" : "not same");
        second.add("Hello");
        second.add("World");
        same = compareArrs(first, second);
        System.out.println(first + " " + second);
        System.out.println(same ? "same" : "not same");
        printSep();
    }

    private static boolean compareArrs(ArrayList<String> first, ArrayList<String> second) {
        if (first.size() != second.size()) {
            return false;
        } else {
            for (int i = 0; i < first.size(); i++) {
                if (!first.get(i).equals(second.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void swapElements() {
        System.out.println("14. Write a Java program that swaps two elements in an array list.");
        ArrayList<String> arr = getWordsArray();
        arr.add("Fizz");
        arr.add("Buzz");
        System.out.println(arr);
        int first = 0;
        int second = arr.size() - 1;
        String temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
        System.out.println(arr);
        printSep();
    }

    public static void concatArrays() {
        System.out.println("15. Write a Java program to join two array lists.");
        ArrayList<String> first = getWordsArray();
        ArrayList<String> second = getWordsArray();
        ArrayList<String> result = new ArrayList<>(first);
        result.addAll(second);
        System.out.println(first);
        System.out.println(second);
        System.out.println(result);
        printSep();
    }

    public static void cloneArray() {
        System.out.println("16. Write a Java program to clone an array list to another array list.");
        ArrayList<Integer> arr = getNumbersArray();
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
        printSep();
    }

    private static void clearArray()
    {
        System.out.println("17. Write a Java program to empty an array list.");
        ArrayList<String> work = getWordsArray();
        System.out.println(work);
        work.clear();
        System.out.println(work);
        printSep();
    }

    public static void empty() {
        System.out.println("18. Write a Java program to test whether an array list is empty or not.");
        ArrayList<String> arr = getWordsArray();
        boolean isEmpty = arr.size() == 0;
        System.out.println(arr);
        System.out.println(isEmpty ? "empty" : "not empty");
        printSep();
    }

    public static void trim() {
        System.out.println("19. Write a Java program for trimming the capacity of an array list.\n");
        ArrayList<String> arr = getWordsArray();
        arr.trimToSize();
        System.out.println(arr);
    }

    public static void increaseSize() {
        System.out.println("20. Write a Java program to increase an array list size.");
        ArrayList<String> arr = getWordsArray();
        int newSize = 10;
        arr.ensureCapacity(newSize);
        System.out.println(arr);
        printSep();
    }

    public static void replaceSecond() {
        System.out.println("21. Write a Java program to replace the second element of an ArrayList with the specified element.");
        ArrayList<String> arr = getWordsArray();
        System.out.println(arr);
        System.out.println("replace at 1");
        arr.set(1, "world");
        System.out.println(arr);
        printSep();
    }

    public static void printArray() {
        System.out.println("22. Write a Java program to print all the elements of an ArrayList using the elements' position.");
        ArrayList<String> arr = getWordsArray();
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        printSep();
    }

    private static ArrayList<Integer> getNumbersArray() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            numbers.add(i);
        }
        return numbers;
    }

    private static ArrayList<String> getWordsArray() {
        ArrayList<String> words = new ArrayList<>();
        for (int i =0; i < 4; i++) {
            words.add("Foo");
            words.add("Bar");
        }
        return words;
    }

    private static void printSep() {
        System.out.println("=======================================");
    }
}
