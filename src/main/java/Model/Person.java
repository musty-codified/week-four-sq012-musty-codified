package Model;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String age;
    private String email;
    private long contactNo;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

//    public Person(String firstName, String lastName, String gender, String age, String email, long contactNo) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.age = age;
//        this.email = email;
//        this.contactNo = contactNo;
//    }
}

