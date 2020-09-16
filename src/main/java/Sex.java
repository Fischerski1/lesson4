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
}
