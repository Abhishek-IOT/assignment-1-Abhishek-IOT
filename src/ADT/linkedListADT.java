package ADT;

public interface linkedListADT<Person> {
    Person add(Person details);

    Person delete(int index);

    void search(String person);

    void viewAllDetails();
}

