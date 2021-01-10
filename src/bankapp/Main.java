package bankapp;

/**
 *
 * @author Mustafa Shubbar <codingbox@outlook.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank("TD Bank");
        
        if(bank.addBranch("Toronto")) {
            System.out.println("Totonto branch created.");
        }
        
        bank.addCustomer("Toronto", "Jack", 50.05);
        bank.addCustomer("Toronto", "Mike", 175.34);
        bank.addCustomer("Toronto", "John", 220.12);
        
        bank.addBranch("Ottawa");
        
        bank.addCustomer("Ottawa", "Tid", 150.54);
        
        bank.addCustomerTransaction("Toronto", "Mike", 44.2);
        bank.addCustomerTransaction("Toronto", "Mike", 120.45);
        bank.addCustomerTransaction("Toronto", "Jack", 1.65);
        
        bank.listCustomers("Toronto", true);
        
        System.out.println("");
        bank.listCustomers("Ottawa", true);
        
        bank.addBranch("Vancouver");
        System.out.println("");
        if(!bank.addCustomer("Vancouver", "Sam", 145.77)) {
            System.out.println("Error: Vancouver branch is not exists");
        }
        bank.listCustomers("Vancouver", true);
        
        System.out.println("");
        if(!bank.addBranch("Ottawa")) {
            System.out.println("Error: Ottawa branch already exists");
        }
        
        System.out.println("");
        if(!bank.addCustomerTransaction("Toronto", "Mark", 250.00)) {
            System.out.println("Customer Mark does not exist on file");
        }
        
        if(!bank.addCustomer("Toronto", "Mike", 4.55)) {
            System.out.println("Customer Mike is already exists.");
        }
        
        
        
        
    }
    
}
