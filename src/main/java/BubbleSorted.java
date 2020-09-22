public class BubbleSorted extends SortedAlgorithm {

    Person[] persons;

    public BubbleSorted(Person[] persons) {
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
        for (int out = persons.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (persons[in].getSex().compareTo(persons[in + 1].getSex()) > 0) {
                    swap(persons, in, in + 1);
                }
            }
        }
    }

    private void sortByAge() {
        for (int out = persons.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (persons[in].getSex().compareTo(persons[in + 1].getSex()) == 0 &&
                        persons[in].getAge() < persons[in + 1].getAge()) {
                    swap(persons, in, in + 1);
                }
            }
        }
    }

    private void sortByName() {
        for (int out = persons.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (persons[in].getSex().compareTo(persons[in + 1].getSex()) == 0 &&
                        persons[in].getAge() == persons[in + 1].getAge() &&
                        persons[in].getName().compareToIgnoreCase(persons[in + 1].getName()) > 0) {
                    swap(persons, in, in + 1);
                }
            }
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

