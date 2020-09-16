public class BubbleSorted extends SortedAlgorithm {

    GenerateObjects generateObjects = new GenerateObjects();

    @Override
    public Person[] sort(/*Object[] array*/) {
        Person[] persons = new Person[generateObjects.generatePersons().length];
        persons = generateObjects.generatePersons();

        for (int out = persons.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (persons[in].getSex().toString() == "woman" && persons[in + 1].getSex().toString() == "man") {
                    swap(persons, in, in + 1);
                }
            }
        }
        return persons;
    }
}
