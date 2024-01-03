package src;

import java.util.*;

public class LinkedListExercises {
    public static void main(String[] args) {
        addToEnd();
        iterate();
        iterateFromIndex();
        iterateInReversedOrder();
        insertAt();
        insertFirstAndLast();
        insertAtFront();
        insertAtBack();
        insertMultipleAt();
        findFirstAndLast();
        printWithPositions();
        removeItemAt();
        removeFirstAndLast();
        removeAll();
        swapElements();
        shuffleElements();
        joinLists();
        copyList();
        dequeList();
        retrieveFirst();
        retrieveLast();
        listContains();
        toArrayList();
        compareLists();
        isListEmpty();
        replaceElement();
    }

    private static void replaceElement() {
        System.out.println("26. Write a Java program to replace an element in a linked list.");
        LinkedList<String> words = getWords();
        System.out.println(words);
        String item = "fizzbuzz";
        int index = words.size() / 2;
        System.out.println(item + " at " + index);
        words.set(index, item);
        System.out.println(words);
        printSep();
    }

    private static void isListEmpty() {
        System.out.println("25. Write a Java program to check if a linked list is empty or not.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers + " is empty : " + numbers.isEmpty());
        numbers.clear();
        System.out.println(numbers +  " is empty : " + numbers.isEmpty());
        printSep();
    }

    private static void compareLists() {
        System.out.println("24. Write a Java program to compare two linked lists.");
        LinkedList<String> words = getWords();
        LinkedList<String> anotherWords = getWords();

        String result = compare(words, anotherWords) ? " == " : " != ";
        System.out.println(words + result + anotherWords);

        anotherWords.add("fizzbuzz");
        result = compare(words, anotherWords) ? " == " : " != ";
        System.out.println(words + result + anotherWords);
        printSep();
    }

    private static boolean compare(LinkedList<String> first , LinkedList<String> second) {
        if (first.size() == second.size()) {
            Iterator<String> wordsIter = first.iterator();
            Iterator<String> anotherWordsIter = second.iterator();
            for (int i = 0; i < first.size(); i++) {
                if (!wordsIter.next().equals(anotherWordsIter.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static void toArrayList() {
        System.out.println("23. Write a Java program to convert a linked list to an array list.");
        LinkedList<String> words = getWords();
        System.out.println(words);
        ArrayList<String> wordsArr = new ArrayList<>(words);
        System.out.println("arr : " + wordsArr);
        printSep();
    }

    private static void listContains() {
        System.out.println("22. Write a Java program to check if a particular element exists in a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        int toCheck = 10;
        System.out.println(numbers);
        System.out.println("contains " + toCheck + " : " +numbers.contains(toCheck));
        toCheck = 2;
        System.out.println("contains " + toCheck + " : " +numbers.contains(toCheck));
        printSep();
    }

    private static void retrieveLast() {
        System.out.println("21. Write a Java program to retrieve, but not remove, the last element of a linked list.");
        LinkedList<String> words = getWords();
        System.out.println(words);
        String last = words.getLast();
        System.out.println("after");
        System.out.println(words);
        System.out.println(last);
        printSep();
    }

    private static void retrieveFirst() {
        System.out.println("20. Write a Java program to retrieve, but not remove, the first element of a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        int first = numbers.getFirst();
        System.out.println("after");
        System.out.println(numbers);
        System.out.println(first);
        printSep();
    }

    private static void dequeList() {
        System.out.println("19. Write a Java program to remove and return the first element of a linked list.");
        LinkedList<String> words =getWords();
        System.out.println(words);
        System.out.println("after remove");
        String element = words.removeFirst();
        System.out.println(words);
        System.out.println(element);
        printSep();
    }

    private static void copyList() {
        System.out.println("18. Write a Java program to copy a linked list to another linked list.");
        LinkedList<String> words = getWords();
        LinkedList<String> wordsCopy = new LinkedList<>();
        System.out.println(words);
        for (String word : words) {
            wordsCopy.add(word);
        }
        System.out.println(wordsCopy);
        words.add("Buzz");
        System.out.println("after add");
        System.out.println(words);
        System.out.println(wordsCopy);
        printSep();
    }

    private static void joinLists() {
        System.out.println("17. Write a Java program to join two linked lists.");
        LinkedList<String> words = getWords();
        LinkedList<String> anotherWords = getWords();
        System.out.println(words + " " + anotherWords);
        LinkedList<String> result = new LinkedList<>(words);
        result.addAll(anotherWords);
        System.out.println(result);
        printSep();
    }

    private static void shuffleElements() {
        System.out.println("16. Write a Java program to shuffle elements in a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        printSep();
    }

    private static void swapElements() {
        System.out.println("15. Write a Java program that swaps two elements in a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        int firstIndex = 1;
        int lastIndex = 3;
        System.out.println("first index : " + firstIndex);
        System.out.println("last index : " + lastIndex);
        int firstElement = numbers.get(firstIndex);
        numbers.set(firstIndex, numbers.get(lastIndex));
        numbers.set(lastIndex, firstElement);
        System.out.println(numbers);
        printSep();
    }

    private static void removeAll() {
        System.out.println("14. Write a Java program to remove all elements from a linked list.");
        LinkedList<String> words = getWords();
        System.out.println(words);
        words.clear();
        System.out.println("words after clear : " + words);

        printSep();
    }

    private static void removeFirstAndLast() {
        System.out.println("13. Write a Java program to remove the first and last elements from a linked list.");
        LinkedList<String> words = getWords();
        System.out.println(words);
        words.removeFirst();
        words.removeLast();
        System.out.println(words);
        printSep();
    }

    private static void removeItemAt() {
        System.out.println("12. Write a Java program to remove a specified element from a linked list.");
        LinkedList<String> words = getWords();
        System.out.println(words);
        int position = words.size() /2 ;
        System.out.println("position : " + position);
        words.remove(position);
        System.out.println(words);
        printSep();
    }

    private static void printWithPositions() {
        System.out.println("11. Write a Java program to display elements and their positions in a linked list.");
        LinkedList<String> words = getWords();
        System.out.println(words);
        ListIterator<String> iter = words.listIterator();
        for (int i = 0; i < words.size(); i++) {
            System.out.println(i + " " + iter.next());
        }
        printSep();
    }

    private static void findFirstAndLast() {
        System.out.println("10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        numbers.addAll(getIntegers());
        numbers.addAll(getIntegers());
        System.out.println(numbers);
        int valueToFind = 3;
        System.out.println(valueToFind);
        int first = numbers.indexOf(valueToFind);
        int last = numbers.lastIndexOf(valueToFind);
        System.out.println("first : " + first);
        System.out.println("last : " + last);
        printSep();
    }

    private static void insertMultipleAt() {
        System.out.println("9. Write a Java program to insert the specified element at the end of a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        LinkedList<Integer> toAdd = getIntegers();
        System.out.println("to add : " + toAdd);
        int position = 4;
        System.out.println("position to add : " + position);
        numbers.addAll(position, toAdd);
        System.out.println(numbers);
        printSep();
    }

    private static void insertAtBack() {
        System.out.println("8. Write a Java program to insert the specified element at the end of a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        int valueToAdd = 9254;
        System.out.println("value to add " + valueToAdd);
        numbers.addLast(valueToAdd);
        System.out.println(numbers);
        printSep();
    }

    private static void insertAtFront() {
        System.out.println("7. Write a Java program to insert the specified element at the front of a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        int valueToAdd = 10;
        System.out.println("value to add : " + valueToAdd);
        numbers.addFirst(valueToAdd);
        System.out.println(numbers);
        printSep();
    }

    private static void insertFirstAndLast() {
        System.out.println("6. Write a Java program to insert elements into the linked list at the first and last positions.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        int valueToAdd = 25;
        System.out.println("value to add : " + valueToAdd);
        numbers.addFirst(valueToAdd);
        numbers.addLast(valueToAdd);
        System.out.println(numbers);
        printSep();
    }

    private static void insertAt() {
        System.out.println("5. Write a Java program to insert the specified element at the specified position in the linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        int position = numbers.size() / 2;
        System.out.println("position : " + position);
        numbers.add(position, 55);
        System.out.println(numbers);
        printSep();
    }

    private static void iterateInReversedOrder() {
        System.out.println("4. Write a Java program to iterate a linked list in reverse order.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println("Iterative");
        System.out.println(numbers);
        Iterator<Integer> iter = numbers.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Recursive");
        printRec(numbers.listIterator());
        printSep();
    }

    private static void printRec(ListIterator<Integer> node) {
        if (node.hasNext()) {
            int element = node.next();
            printRec(node);
            System.out.println(element);
        }
    }


    private static void iterateFromIndex() {
        System.out.println("3. Write a Java program to iterate through all elements in a linked list starting at the specified position.");
        LinkedList<Integer> numbers = getIntegers();
        int startIndex = numbers.size() / 2;
        System.out.println(numbers);
        System.out.println("start index : " + startIndex);
        Iterator<Integer> iter = numbers.listIterator(startIndex);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        printSep();
    }

    private static void iterate() {
        System.out.println("2. Write a Java program to iterate through all elements in a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        System.out.println("with for");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("with iterator");
        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        printSep();
    }

    private static void addToEnd() {
        System.out.println("1. Write a Java program to append the specified element to the end of a linked list.");
        LinkedList<Integer> numbers = getIntegers();
        System.out.println(numbers);
        numbers.addLast(50);
        System.out.println(numbers);
        printSep();
    }

    private static LinkedList<Integer> getIntegers() {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            numbers.add(i);
        return numbers;
    }


    private static LinkedList<String> getWords() {
        LinkedList<String> words = new LinkedList<String>();
        words.add("foo");
        words.add("bar");
        words.add("fizz");
        words.add("buzz");
        return words;
    }


    private static void printSep() {
        System.out.println("====================");
    }
}
