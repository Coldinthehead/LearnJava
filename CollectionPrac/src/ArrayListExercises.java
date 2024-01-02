import java.util.ArrayList;

public class ArrayListExercises {
    public static void main(String[] args) {
        colorsArray();
        iterateArray();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            numbers.add(i);
        }
        insertAtFirst(numbers);
        System.out.println(numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("Foo");
        words.add("Bar");
        System.out.println(getItemFrom(words, 0));

        updateElementAt(words, 1, "Fizz");
        System.out.println(words);

        words.clear();
        words.add("Foo");
        words.add("Bar");
        words.add("Fizz");
        removeThird(words);
        System.out.println(words);

        int fooIndex = searchArray(words, "Foo");
        System.out.println(fooIndex);

        ArrayList<Integer> sortedNumbers = sortArray(numbers);
        System.out.println(sortedNumbers);

        ArrayList<String> wordsCopy = createCopy(words);
        System.out.println(wordsCopy);

        shuffleArrayInPlace(numbers);
        System.out.println(numbers);

        System.out.println(numbers);
        reverseArrayInPlace(numbers);
        System.out.println(numbers);

        System.out.println(numbers);
        ArrayList<Integer> sliced = sliceArray(numbers, 2, 5);
        System.out.println(sliced);

        System.out.println(compareArrays(words, wordsCopy));
        ArrayList<String> anotherWords = new ArrayList<>();
        anotherWords.add("Fizz");
        System.out.println(compareArrays(words, anotherWords));


        System.out.println(words);
        swapElements(words, 0, 1);
        System.out.println(words);

        System.out.println(concatArrays(words, anotherWords));

        System.out.println(anotherWords);
        clearInPlace(anotherWords);
        System.out.println(anotherWords);

        System.out.println(isEmpty(numbers));

        trim(words);

        increaseSizeTo(numbers,numbers.size() + 10);

        System.out.println(numbers);
        replaceSecond(numbers, 255);
        System.out.println(numbers);

        printArray(numbers);
    }

    public static void colorsArray() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        for (String color : colors) {
            System.out.println(color);
        }
    }

    public static void iterateArray() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(98);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("item at " + i + " " + numbers.get(i));
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void insertAtFirst(ArrayList<Integer> array) {
        int number = 50;
        array.set(0, number);
    }

    public static String getItemFrom(ArrayList<String> array, int index) {
        return array.get(index);
    }

    public static void updateElementAt(ArrayList<String> array, int index, String element) {
        array.set(index, element);
    }

    public static void removeThird(ArrayList<String> array) {
        array.remove(2);
    }

    public static int searchArray(ArrayList<String> array, String element) {
        for (int i = 0; i < array.size(); i++) {
            String toCheck = array.get(i);
            if (toCheck.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> sortArray(ArrayList<Integer> array) {
        return qSort(array);
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

    public static ArrayList<String> createCopy(ArrayList<String> arr) {
        ArrayList<String> copy = new ArrayList<>(arr.size());
        for (String element : arr) {
            copy.add(element);
        }
        return copy;
    }

    public static void shuffleArrayInPlace(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            int shuffleIndex = (int) (Math.random() * arr.size());
            arr.set(i, arr.get(shuffleIndex));
            arr.set(shuffleIndex, current);
        }
    }

    public static void reverseArrayInPlace(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            int left = arr.get(i);
            int rightIndex = arr.size() - i - 1;
            int right = arr.get(rightIndex);
            arr.set(rightIndex, left);
            arr.set(i, right);
        }
    }

    public static ArrayList<Integer> sliceArray(ArrayList<Integer> arr, int start, int stop) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i < stop; i++) {
            result.add(arr.get(i));
        }
        return result;
    }

    public static boolean compareArrays(ArrayList<String> first, ArrayList<String> second) {

        if (first.size() != second.size()) {
            return false;
        } else {
            for (int i = 0; i < first.size(); i++) {
                if (!first.get(i).equals(second.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void swapElements(ArrayList<String> arr, int first, int second) {
        String temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }

    public static ArrayList<String> concatArrays(ArrayList<String> first, ArrayList<String> second) {
        ArrayList<String> result = new ArrayList<>(first);
        result.addAll(second);
        return result;
    }

    public static void clearInPlace(ArrayList<String> arr) {
        arr.clear();
    }

    public static boolean isEmpty(ArrayList<Integer> arr) {
        return arr.size() == 0;
    }

    public static void trim(ArrayList<String> arr) {
        arr.trimToSize();
    }

    public static void increaseSizeTo(ArrayList<Integer> arr, int newSize) {
        arr.ensureCapacity(newSize);
    }

    public static void replaceSecond(ArrayList<Integer> arr, int newElement) {
        arr.set(1, newElement);
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int i = 0 ; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
