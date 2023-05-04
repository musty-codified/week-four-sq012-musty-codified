package Model;

import lombok.Data;
@Data
public abstract class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String age;
    private String email;
    private long contactNo;

}

