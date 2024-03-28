public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPension() {
        if (this.age > 80) {
            System.out.println("Your age is " + this.age + ", you need to go pension");
        } else {
            System.out.println("Your age is " + this.age + ", you not need to go pension");
        }
    }
}