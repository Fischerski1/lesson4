public class Main {
    public static void main(String[] args) {
        /*GenerateObjects generateObjects = new GenerateObjects();
        String[] array = generateObjects.generatePersons();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        BubbleSorted bubbleSorted = new BubbleSorted();
        //bubbleSorted.sort();

        Person[] array = bubbleSorted.sort();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
