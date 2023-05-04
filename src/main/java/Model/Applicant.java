package Model;
import Enum.Qualification;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Applicant extends Person {
    private String position;

    private Qualification qualification;
    public String applyPosition(Applicant applicant) {
        if (applicant.getPosition().equalsIgnoreCase("Cashier")) {
            if (applicant.getQualification().equals(Qualification.BSC)) {
                return "Congratulations,you've been hired!";
            }
        }
        else {
            return "You do not meet the requirements";
        }

        return "you are ineligible for this position";
    }


    }



