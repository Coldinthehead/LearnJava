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
        shuffleArray();
        reverseArray();
        createCopy();
        sliceArray();
        compareArrays();
        swapElements();
        concatArrays();
        clearArray();
        empty();
        trim();
        increaseSize();
        replaceSecond();
        printArray();
    }

    public static void colorsArray() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println(colors);
        printSep();
    }

    public static void iterateArray() {
        ArrayList<Integer> numbers = getNumbersArray();

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("item at " + i + " " + numbers.get(i));
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
        printSep();
    }

    public static void insertAtFirst() {
        ArrayList<Integer> numbers = getNumbersArray();
        System.out.println(numbers);
        int number = 50;
        numbers.set(0, number);
        System.out.println(number);
        printSep();
    }

    public static void retrieveElement() {
        ArrayList<String> words = getWordsArray();
        String word = words.get(1);
        words.remove(1);
        printSep();
    }

    public static void updateElement() {
        ArrayList<String> words = getWordsArray();
        System.out.println(words);
        words.set(1, "Fizz");
        System.out.println(words);
        printSep();
    }

    public static void removeThird() {
        ArrayList<Integer> numbers = getNumbersArray();
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        printSep();
    }

    public static void searchArray() {
        ArrayList<Integer> numbers = getNumbersArray();
        System.out.println(numbers);
        int searchIndex = 5;
        int index = numbers.indexOf(searchIndex);
        System.out.println(index);
        printSep();
    }

    public static void sortArray() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(getNumbersArray().reversed());
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
        ArrayList<String> words = new ArrayList<>();
        System.out.println(words);
        ArrayList<String> wordsCopy = new ArrayList<>();
        System.out.println(wordsCopy);
        printSep();
    }

    public static void shuffleArray() {
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
        ArrayList<Integer> numbers = getNumbersArray();
        int start = 2;
        int stop = 5;
        ArrayList<Integer> slice = new ArrayList<>();
        for (int i = start; i < stop; i++) {
            slice.add(numbers.get(i));
        }
        System.out.println(slice);
        printSep();
    }

    public static void compareArrays() {

        ArrayList<String> first = getWordsArray();
        ArrayList<String> second = new ArrayList<String>();
        second.add("Hello");
        second.add("World");
        boolean same = false;
        if (first.size() != second.size()) {
            same = false;
        } else {
            for (int i = 0; i < first.size(); i++) {
                if (!first.get(i).equals(second.get(i))) {
                    same = true;
                    break;
                }
            }
        }
        System.out.println(same ? "same" : "not same");
        printSep();
    }

    public static void swapElements() {
        ArrayList<String> arr = getWordsArray();
        arr.add("Fizz");
        arr.add("Buzz");
        System.out.println(arr);
        int first = 0;
        int second = 2;
        String temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
        System.out.println(arr);
        printSep();
    }

    public static void concatArrays() {
        ArrayList<String> first = getWordsArray();
        ArrayList<String> second = getWordsArray();
        ArrayList<String> result = new ArrayList<>(first);
        result.addAll(second);
        System.out.println(first);
        System.out.println(second);
        System.out.println(result);
        printSep();
    }

    public static void clearArray() {
        ArrayList<Integer> arr = getNumbersArray();
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
        printSep();
    }

    public static void empty() {
        ArrayList<String> arr = getWordsArray();
        boolean isEmpty = arr.size() == 0;
        System.out.println(arr);
        System.out.println(isEmpty ? "empty" : "not empty");
        printSep();
    }

    public static void trim() {
        ArrayList<String> arr = getWordsArray();
        arr.trimToSize();
        System.out.println(arr);
    }

    public static void increaseSize() {
        ArrayList<String> arr = getWordsArray();
        int newSize = 10;
        arr.ensureCapacity(newSize);
        System.out.println(arr);
        printSep();
    }

    public static void replaceSecond() {
        ArrayList<String> arr = getWordsArray();
        arr.set(1, "world");
        System.out.println(arr);
        printSep();
    }

    public static void printArray() {
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
        for (int i =0; i < 10; i++) {
            words.add("Foo");
            words.add("Bar");
        }
        return words;
    }

    private static void printSep() {
        System.out.println("=======================================");
    }
}
