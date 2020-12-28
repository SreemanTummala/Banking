   /** 
    * Main class used to test the Accountand Customer classes
    * Created by Sreeman Tummala 
    * To test the Account and Customer classes
    * Due Date: 05-18-2020
    */
   import java.util.*;
   import java.io.*;

   public class Main {
		   	/** 
		    *
		    * This is the main method where I testthe account class
		    * which uses Customers.
		    */
  
       public static void main(String[] args) {
           System.out.println("Before!");
           Customer bed = new Customer("G", 60, 31, 6, false);
           Customer beds = new Customer("Goo", 60, 30, 6, false);
           Account test = new Account();
           List < Customer > use = loadCustomerData(test, "dataFile.txt");
           for (Customer cust: use) {
               test.addCustomer(cust);
           }
           // prints out the Queue
           System.out.println(test.getCQueue());
           // Customer bo=use.get(0);
           //System.out.println(bo.toString());
           //tests addCustomer
           test.addCustomer(bed);
           test.addCustomer(beds);
           // test modify age and name
           test.modifyAge(bed, 300);
           test.modifyName(bed, "I Like Food");
           //prints out the set
           System.out.println("Set   " + test.getSet());
           //System.out.println(test.remove(bed));
           // prints out altered Queue
           System.out.println("Queue hi " + test.getCQueue() + " hi");
           //tests investMoney
           test.investMoney(use.get(0));
           System.out.println("After!");
           // Customer gone= test.remove(bed);
           System.out.println("Set   " + test.getSet());
           //System.out.println(test.remove(bed));

           System.out.println("Queue " + test.getCQueue());
           
           
            System.out.println("Queue hi " + test.getCQueue() + " hi");
            // tests bankFraud
            test.bankFraud(6);
            System.out.println("Queue   " + test.getCQueue());
            // tests Bankruptcy and lucky
            test.Bankruptcy(use.get(3));
            test.lucky(use.get(7));
            System.out.println("Set   " + test.getSet());
           
       }
    /** 
    * 
    * Creates a list of Customers to use for testing from the file
    * which comes from Forbes
    * @param fileName name of file containing Customer data
    * @return list of Customer objects from the fileName
    */
       private static List < Customer > loadCustomerData(Account test, String fileName) {
           List < Customer > list = new LinkedList < > ();
           try {
               Scanner input = new Scanner(new File(fileName));
               while (input.hasNextLine()) {


                   int age = input.nextInt();
                   double balance = input.nextDouble();

                   int charitable = input.nextInt();
                   String name = input.nextLine().trim();





                   Customer cust = new Customer(name, balance, age, charitable, false);
                   list.add(cust);
               }
               input.close();
           } catch (Exception exc) {
               System.out.println("Error reading " + fileName + "\n" +
                   exc.getMessage());
               exc.printStackTrace();
               System.exit(0);
           }
           return list;
       }
   }