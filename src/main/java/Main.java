public class Main {
    public static void main(String[] args) throws NameAndAgeException {
        Person[] persons1;
        Person[] persons2;

        GenerateObjects objects1 = new GenerateObjects();
        GenerateObjects objects2 = new GenerateObjects();
        persons1 = objects1.generatePersons();
        persons2 = objects2.generatePersons();

        BubbleSorted bubbleSorted = new BubbleSorted(persons1);
        SelectionSort selectionSort = new SelectionSort(persons2);

        double startTime1 = System.currentTimeMillis();
        bubbleSorted.sort();
        double finishTime1 = System.currentTimeMillis();
        finishTime1 = (finishTime1 - startTime1) / 1000;
        System.out.println("Время исполнения сортировки пузырьком: " + finishTime1);

        double startTime2 = System.currentTimeMillis();
        selectionSort.sort();
        double finishTime2 = System.currentTimeMillis();
        finishTime2 = (finishTime2 - startTime2) / 1000;
        System.out.println("Время исполнения сортировки выбором: " + finishTime2);

        for (int i = 0; i < persons1.length; i++) {
            System.out.println(persons1[i]);
        }

        System.out.println("\n\n===========================================\n " +
                "Начало второго массива \n");

        for (int i = 0; i < persons2.length; i++) {
            System.out.println(persons2[i]);
        }
    }
}