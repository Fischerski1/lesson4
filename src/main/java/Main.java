public class Main {
    public static void main(String[] args) {

        BubbleSorted bubbleSorted = new BubbleSorted();

        Person[] array = bubbleSorted.sort();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
