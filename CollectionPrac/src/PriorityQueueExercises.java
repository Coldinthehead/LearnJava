import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExercises {
    public static void main(String[] args) {
        createColors();
        iterateQueue();
        addMultiple();
        insert();
        removeAll();
        countElements();
        compereQues();
        retrieveElement();
        dequeue();
        covertToArray();
        queueToString();
        reversePriority();
    }

    private static void reversePriority() {
        System.out.println("12. Write a Java program to change priorityQueue to maximum priority queue.");
        PriorityQueue<String> words = getWords();
        System.out.println(words);
        PriorityQueue<String> reversed = new PriorityQueue<>((x, y) -> -x.compareTo(y));
        reversed.addAll(words);
        System.out.println(reversed);
        printSep();
    }

    private static void queueToString() {
        System.out.println("11. Write a Java program to convert a Priority Queue element to string representations.");
        System.out.println();
        PriorityQueue<Integer> words = getNumbers();
        System.out.println(words);
        String item = words.toString();
        System.out.println(item);
        printSep();
    }

    private static void covertToArray() {
        System.out.println("10. Write a Java program to convert a priority queue to an array containing all its elements.");
        PriorityQueue<String> words = getWords();
        System.out.println(words);
        String[] elements = words.toArray(new String[0]);
        System.out.println("array : ");
        for (String item : elements) {
            System.out.println(item);
        }

        printSep();
    }

    private static void dequeue() {
        System.out.println("9. Write a Java program to retrieve and remove the first element.");
        PriorityQueue<String> words = getWords();
        System.out.println(words);
        System.out.println("first : " + words.poll());
        System.out.println(words);
        printSep();
    }

    private static void retrieveElement() {
        System.out.println("8. Write a Java program to retrieve the first element of the priority queue.");
        PriorityQueue<Integer> numbers = getNumbers();
        System.out.println(numbers);
        System.out.println("first : " + numbers.peek());

        printSep();
    }

    private static void compereQues() {
        System.out.println("7. Write a Java program to compare two priority queues.");
        PriorityQueue<String> first = getWords();
        PriorityQueue<String> second = getWords();

        String result = compareQues(first, second) ? " == " : " != ";
        System.out.println(first + result + second);
        first.add("yellow");
        result = compareQues(first, second) ? " == " : " != ";
        System.out.println(first + result + second);
        printSep();
    }

    private static boolean compareQues(PriorityQueue<String> first, PriorityQueue<String> second) {
        if (first.size() == second.size()) {
            Iterator<String> firstIter = first.iterator();
            Iterator<String> secondIter = second.iterator();
            while (firstIter.hasNext()) {
                if (!firstIter.next().equals(secondIter.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static void countElements() {
        System.out.println("6. Write a Java program to count the number of elements in a priority queue");
        PriorityQueue<Integer> numbers = getNumbers();
        System.out.println(numbers);
        System.out.println("numbers count : " + numbers.size());
        printSep();
    }

    private static void removeAll() {
        System.out.println("5. Write a Java program to remove all elements from a priority queue.");
        PriorityQueue<String> words = getWords();
        System.out.println(words);
        words.clear();
        System.out.println("cleared " + words);
        printSep();
    }

    private static void insert() {
        System.out.println("4. Write a Java program to insert a given element into a priority queue.");
        PriorityQueue<Integer> numbers = getNumbers();
        System.out.println(numbers);
        int toAdd = 55;
        System.out.println("toAdd " + toAdd);
        numbers.add(toAdd);
        System.out.println(numbers);
        toAdd = -10;
        System.out.println("toAdd " + toAdd);
        numbers.add(toAdd);
        System.out.println(numbers);
        printSep();
    }

    private static void addMultiple() {
        System.out.println("Write a Java program to add all the elements of a priority queue to another priority queue.");
        PriorityQueue<String> words = getWords();
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("red");
        colors.add("Green");
        colors.add("Black");
        System.out.println(colors + "" + words);
        words.addAll(colors);
        System.out.println(words);
        printSep();
    }

    private static void iterateQueue() {
        System.out.println("2. Write a Java program to iterate through all elements in the priority queue.");
        PriorityQueue<String> words = getWords();

        System.out.println(words);
        for (String word : words) {
            System.out.println(word);
        }

        printSep();
    }

    private static void createColors() {
        System.out.println("1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.");
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");

        System.out.println(colors);
        printSep();
    }


    private static PriorityQueue<Integer> getNumbers() {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    private static PriorityQueue<String> getWords() {
        PriorityQueue<String> words = new PriorityQueue<>();
        words.add("foo");
        words.add("bar");
        words.add("Fizz");
        words.add("Buzz");
        return words;
    }

    private static void printSep() {
        System.out.println("================");
    }
}
