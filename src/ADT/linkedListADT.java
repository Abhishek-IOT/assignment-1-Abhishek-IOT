package ADT;

public interface linkedListADT<Person> {
    boolean add(Person details);

    Person delete(int index);

    void search(String person);

    void viewAllDetails();
}

