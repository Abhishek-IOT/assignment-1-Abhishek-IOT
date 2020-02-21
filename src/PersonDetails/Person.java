package PersonDetails;

import java.util.ArrayList;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private ArrayList<String> arrayList = new ArrayList<>();
    private String email = "";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String firstName, String lastName, ArrayList<String> arrayList, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.arrayList = arrayList;
        this.email = email;
    }
}
