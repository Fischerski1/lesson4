public class Sex {
    private final String sex;

    public Sex(int num) {

        if (num == 1) {
            sex = "man";
        } else {
            sex = "woman";
        }
    }

    public String getSex() {
        return sex;
    }

    public int compareTo(Sex o) {
        return this.sex.compareTo(o.sex);
    }

    @Override
    public String toString() {
        return sex;
    }
}
