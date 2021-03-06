public class SelectionSort extends SortedAlgorithm {

    Person[] persons;

    public SelectionSort(Person[] persons) {
        this.persons = persons;
    }

    @Override
    public void sort() {
        sortBySex();
        sortByAge();
        sortByName();
        try {
            exception();
        } catch (NameAndAgeException e) {
            e.printStackTrace();
        }
    }

    private void sortBySex() {
        for (int left = 0; left < persons.length; left++) {
            int minInd = left;
            for (int i = left; i < persons.length; i++) {
                if (persons[i].getSex().compareTo(persons[minInd].getSex()) < 0) {
                    minInd = i;
                }
            }
            swap(persons, left, minInd);
        }
    }

    private void sortByAge() {
        for (int left = 0; left < persons.length; left++) {
            int minInd = left;
            for (int i = left; i < persons.length; i++) {
                if (persons[i].getSex().compareTo(persons[minInd].getSex()) == 0 &&
                        persons[i].getAge() > persons[minInd].getAge()) {
                    minInd = i;
                }
            }
            swap(persons, left, minInd);
        }
    }

    private void sortByName() {
        for (int left = 0; left < persons.length; left++) {
            int minInd = left;
            for (int i = left; i < persons.length; i++) {
                if (persons[i].getSex().compareTo(persons[minInd].getSex()) == 0 &&
                        persons[i].getAge() == persons[minInd].getAge() &&
                        persons[i].getName().compareToIgnoreCase(persons[minInd].getName()) < 0) {
                    minInd = i;
                }
            }
            swap(persons, left, minInd);
        }
    }

    private void exception() throws NameAndAgeException {
        String[] array = new String[persons.length];
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getName().compareToIgnoreCase(persons[i + 1].getName()) == 0 &&
                    persons[i].getAge() == persons[i + 1].getAge()) {
                throw new NameAndAgeException();
            }
        }
    }
}
