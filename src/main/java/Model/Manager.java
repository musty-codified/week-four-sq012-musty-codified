package Model;

import Interface.ManagerInterface;
import Enum.Qualification;

public class Manager extends Staff implements ManagerInterface {
    public Manager() {
    }

//    public Manager(String firstName, String lastName, String gender, String age, String email, long contactNo, String position, String staffId) {
//            super(firstName, lastName, gender, age, email, contactNo, position, staffId);
//    }
   @Override
    public String hireCashier(Applicant applicant) {
        if ((applicant.getQualification().equals(Qualification.MSC))) {
            return "Congratulations.";
        } else {
            return "Sorry,we are unable to hire you at this time";
        }
    }

}

