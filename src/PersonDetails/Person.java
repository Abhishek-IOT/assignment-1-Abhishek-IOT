package PersonDetails;



public class Person {
    private String firstName = "";
    private String lastName = "";
    private String[] contactList;
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



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("-------- * -------- * -------- * --------\n");
        sb.append("firstName=").append(firstName).append('\n');
        sb.append("lastName=").append(lastName).append('\n');
        sb.append("contactList=").append(contactList);
        sb.append("[");
        for (int i = 0; i < contactList.length; i++) {
            sb.append((contactList[i] != null && i != contactList.length ? contactList[i] : ""));
            sb.append("]");
        }
        sb.append("\nemail='").append(email).append('\n');
        sb.append("-------- * -------- * -------- * --------");
        return sb.toString();
    }
    public Person(String firstName, String lastName, String[] contactList, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactList = contactList;
        this.email = email;
    }

    public String[] getContactList() {
        return contactList;
    }

    public void setContactList(String[] contactList) {
        this.contactList = contactList;
    }
}
