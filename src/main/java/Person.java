public class Person {
    private String name;
    private byte age;
    private Sex sex;

    public Person(String name, byte age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public byte getAge() {
        return age;
    }


    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex.getSex()  +
                '}';
    }
}