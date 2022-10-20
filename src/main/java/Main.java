import Enum.Qualification;
import Model.Applicant;
import Model.Cashier;
import Model.Customer;
import Model.Store;
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

        Cashier cashier1 = new Cashier();
        Cashier cashier2 = new Cashier();
        Cashier cashier3 = new Cashier();

//        Runnable customer1 = new Customer();
        Thread myThread1 = new Thread(cashier1);
        Thread myThread2 = new Thread(cashier2);
        Thread myThread3 = new Thread(cashier3);

//        myThread1.setName("customer 1");
//        myThread2.setName("customer 2");

        myThread1.start();
        myThread2.start();
        myThread3.start();

        System.out.println(customer1.getCart());
        System.out.println(customer2.getCart());

        System.out.println(customer1.getWalletBalance());
        System.out.println(customer2.getWalletBalance());

        System.out.println(store.getCustomersList());
//

//    cashier.sell(store);
        System.out.println(cashier1.sell(store));
        System.out.println(customer1.buy(store, "rice", 3));

    Applicant applicant = new Applicant();
    applicant.setFirstName("Abraham");
    applicant.setLastName("Demilade");
    applicant.setPosition("Cashier");
    applicant.setQualification(Qualification.BSC);
    System.out.println(applicant.applyPosition(applicant));
    }
}
