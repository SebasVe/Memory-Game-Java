import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("John", 25, "Male"));
        personList.add(new Person("Emily", 30, "Female"));
        personList.add(new Person("Michael", 40, "Male"));
        for (Person person : personList) 
        {
            System.out.println(person);
        }
    }
}

class Person 
{
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Person(String name, int age, String gender) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() 
    {
        return "Person{" + "name = '" + name + '\'' + ", age = " + age + ", gender = '" + gender + '\'' + '}';
    }
}
