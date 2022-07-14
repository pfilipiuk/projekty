public class Person {

    private String name;
    private String lastName;
    private int age;
    private float efficacy;

    public Person(String name, String lastName, int age, float efficacy) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.efficacy = efficacy;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public float getEfficacy() {
        return efficacy;
    }
}
