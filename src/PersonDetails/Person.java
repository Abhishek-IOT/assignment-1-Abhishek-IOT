package PersonDetails;

import java.util.ArrayList;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private ArrayList<String> arrayList = new ArrayList<>();
    private String email = "";

    public Person(String firstName, String lastName, ArrayList<String> arrayList, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.arrayList = arrayList;
        this.email = email;
    }
}
