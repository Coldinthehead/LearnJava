
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void colorsArray()
    {
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
        array.remove(3);
    }

    public static int searchArray(ArrayList<String> array,String element) {
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

    private static ArrayList<Integer> qSort(ArrayList<Integer> arr)
    {
        if (arr.size() == 1 || arr.size() == 0) {
            return arr;
        }
        if (arr.size() == 2)
        {
            ArrayList<Integer> sorted = new ArrayList<>();
            sorted.add(Integer.min(arr.get(0), arr.get(1)));
            sorted.add(Integer.max(arr.get(0), arr.get(1)));
            return sorted;
        }
        else
        {
            final int pivot = (int) (Math.random() * arr.size());
            final int pivotItem = arr.get(pivot);

            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
            for (int i = 0; i < pivot; i++)
            {
                Integer item = arr.get(i);
                if (item > pivotItem)
                    right.add(item);
                else
                    left.add(item);
            }
            for (int i = pivot + 1; i < arr.size(); i++)
            {
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
}
