package runtrack_java.DAY2.job0;


public class Person {
    public String name;
    public String firstName;
    protected String dateOfBirth;
    protected String placeOfBirth;
    private String address;
    private String phoneNumber;

    Person(String name, String firstName, String dateOfBirth, String placeOfBirth, String address, String phoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

