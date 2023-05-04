import Enum.Qualification;
import Model.*;

public class Main {
    public static void main(String[] args) {
    String path = "/Users/decagon/IdeaProjects/week-four-sq012-musty-codified/src/main/resources/Product Data - Sheet1.csv";
    Store store = new Store();
    store.fileReader(path);

    Customer customer1 = new Customer();
    customer1.setFirstName("Gideon");
    customer1.setLastName("abel");
    customer1.setWalletBalance(2000000);

    Customer customer2 = new Customer();
    customer2.setFirstName("Mustapha");
    customer2.setLastName("Musa");
    customer2.setWalletBalance(500000);

    customer1.buy(store, "rice", 3);
    customer2.buy(store,"rice", 2);
    customer1.buy();

    Cashier cashier1 = new Cashier(store);
    Thread myThread1 = new Thread(cashier1);
    Thread myThread2 = new Thread(cashier1);

    myThread1.start();

    System.out.println(customer1.getCart());
    System.out.println(customer2.getCart());

    for(Customer customer: store.getCustomersList()){
        System.out.println(customer);
    }

    Applicant applicant = new Applicant();
    applicant.setFirstName("Abraham");
    applicant.setLastName("Ade");
    applicant.setPosition("Cashier");
    applicant.setQualification(Qualification.BSC);
//    System.out.println(applicant.applyPosition(applicant));

    Manager manager = new Manager();
    manager.hireCashier(applicant);
    }
}
