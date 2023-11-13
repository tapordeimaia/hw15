import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        Person person1 = new Person("Ion", 61);
        Person person2 = new Person("Maia", 18);
        people.add(person1);
        people.add(person2);
        for (Person person: people){
            if (person.getAge()>60){
                System.out.println(person.toString());
            }
        }
    }
}