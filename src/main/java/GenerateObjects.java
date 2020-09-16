import java.util.Random;

public class GenerateObjects {
    Person person;
    Person[] name;

    public Person[] generatePersons() {
        int nameLength = (int) (10000 + Math.random() * 10);
        name = new Person[nameLength];
        Random random = new Random();
        for (int i = 0; i < nameLength; i++) {
            char[] word = new char[random.nextInt(8) + 3];
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }

            person = new Person(new String(word), (byte) (Math.random() * 100), new Sex(generateSex()));
            name[i] = person;

        }
        return name;
    }

    public int generateSex() {
        return (int) Math.round(Math.random());
    }
}