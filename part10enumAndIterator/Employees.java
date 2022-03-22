import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List <Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        iterator.forEachRemaining(person -> people.add(person));
    }

    public void print() {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();

        while(iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }

    }

}
