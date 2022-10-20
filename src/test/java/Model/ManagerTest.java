package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Enum.Qualification;
@DisplayName("test applicants qualification for hiring")
class ManagerTest {
//    Manager manager = new Manager();
    @DisplayName("Applicant hired")
    @Test
    void hireCashier_WhenManagerHire_ApplicantSuccessful(){
        Applicant applicant = new Applicant();
        applicant.setFirstName("Abraham");
        applicant.setLastName("Demilade");
        applicant.setPosition("Cashier");
        applicant.setQualification(Qualification.BSC);
//        Applicant applicant = new Applicant();
        String result= applicant.applyPosition(applicant);
        Assertions.assertEquals(result, "Congratulations, you've been hired!", ()->"Applicant did not get hired");

    }

}