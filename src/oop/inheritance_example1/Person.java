package oop.inheritance_example1;

public abstract class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void introduce() {
        String genderEmoji = (this.gender == "M") ? "👦" : "👧";
        System.out.println(String.format("%s Hello, I am %s and %d years old.",
                genderEmoji, this.name, this.age
        ));
    }
}
