package Model;

import lombok.Data;

@Data

public abstract class Staff extends Person {
    private String staffId;
    private String position;
}
