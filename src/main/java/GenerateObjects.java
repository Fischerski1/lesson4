public class GenerateObjects {
    public Person[] generatePersons() {
        int personsLength = (int) (10_000 + Math.random() * 100);
        Person[] persons = new Person[personsLength];
        int indexNamesArray;

        for (int i = 0; i < personsLength; i++) {
            String[] sex = choiseBetweenSex();
            indexNamesArray = (int) (Math.random() * sex.length);
            persons[i] = new Person(sex[indexNamesArray], ageGenerate(), new Sex(sex.equals(MANS) ? 1 : 0));
        }
        return persons;
    }

    private byte ageGenerate() {
        return (byte) (Math.random() * 100 + 1);
    }

    private String[] choiseBetweenSex() {
        boolean bol;
        double percentage = 0.5;
        String[] names;

        bol = (Math.random() < percentage);
        if (bol == true) {
            names = MANS;
        } else {
            names = WOMANS;
        }
        return names;
    }

    private static final String[] MANS = {"Joe", "Ronald", "David", "Irwin", "Michael", "Tom", "Todd", "Peter",
            "Marcelo",  "Rick", "Bruce", "Jaclyn", "Doug", "Steve",  "Waldo", "Scott", "Larry", "Paul", "Sam",
            "Dustin",  "Wayne", "Christian", "Andrew", "Alison", "Tim", "Chris", "Jeremy", "Willy",  "Marcus",
            "Kyle",  "Isaiah", "Eric", "Donald", "Meredith", "Kevin",  "Blake", "Cliff", "Dylan", "Alex", "Nathan",
            "Josh", "Adam", "Michelle", "Carey", "Brian", "Jason", "Jim", "Jamie", "Steven", "Byron",
            "Harry", "Brooke", "Drew", "Gary", "Felipe", "Josie"};

    private static final String[] WOMANS = {"Donna", "Sarah", "Courtney", "Linda", "Cindy", "Rebekah", "Tracy",
            "Nicole", "Jennifer", "Andrea", "Shirley", "Liz", "Theresa", "Colby", "Emily", "Kate", "Beth", "Dianne",
            "Alethea", "Kristina", "Danny", "Breya", "Mary", "Susie", "Jessica", "Kelly", "Stephanie", "Hillary",
            "Julia", "Leslie", "Angela", "Debbie", "Monica", "Erin", "Wendy", "Megan", "Ashley", "Melanie", "Monica",
            "Rhonda", "Perry", "Laura", "Vicki", "Anita"};
}