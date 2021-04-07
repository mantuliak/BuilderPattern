import java.util.Set;

public class Person {
    public Set<Person> parents;
    public String surname;
    public String name;
    public int age;
    public int height;
    public int weight;


    Person (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person (String name, String surname, int age, int height){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }
}

