package Model;

import Interface.ManagerInterface;
import Enum.Qualification;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Manager extends Staff implements ManagerInterface {
   @Override
    public String hireCashier(Applicant applicant) {
        if ((applicant.getQualification().equals(Qualification.MSC))) {
            return "Congratulations.";
        } else {
            return "Sorry,we are unable to hire you at this time";
        }
    }

}

