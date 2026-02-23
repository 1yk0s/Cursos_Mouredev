package ejerciciosmodificadoresdeacceso;

public class Person {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age= setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }
}
