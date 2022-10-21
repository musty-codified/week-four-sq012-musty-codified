package Model;

public abstract class Staff extends Person {
    private String staffId;
    private String position;

    public Staff() {
    }

    public String getId() {
        return staffId;
    }

    public void setId(String staffId) {
        this.staffId = staffId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

//    public Staff(String firstName, String lastName, String gender, String age, String email, long contactNo, String position, String StaffId) {
//        super(firstName, lastName, gender, age, email, contactNo);
//        this.staffId=StaffId;
//        this.position=position;
//    }

}
