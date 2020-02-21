package ADT;

import PersonDetails.Person;

public interface linkedListADT {
    Person add(Person details);

    Person delete(int index);

    void search(String person);

    void viewAllDetails();
}

