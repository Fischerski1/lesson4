public abstract class SortedAlgorithm implements Sorted {
    Person[] persons;

    @Override
    public void swap(Person[] array, int i1, int i2) {
        Person tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}
