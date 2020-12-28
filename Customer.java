/** 
 * This customer class creates the objects that will be in the 
 * account class data structures. This class provides methods
 * to access and mutate the Customers information.
 * @author Sreeman Tummala
 * Due Date: 05-18-2020
 */


public class Customer {
    private String name;
    private int age;
    private double balance;
    private boolean k;
    private int charitable;
    //private String company;
    public Customer(String name, double balance, int age, int charitable, boolean k) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        // this.company=company;
        this.k = k;
        this.charitable = charitable;
    }
     /*@return name
       acessor method that retrieves name
     */
    public String getName() {
        return name;
    }
   /** 
    * This is a mutator method which
    * changes the name
    * @param String names
    * 
    * 
    */
    
    public void changeName(String names) {
        name = names;
    }
    /** 
    * This is a accesor method which gets status
    * @return boolean k
    * 
    */
    public boolean getStatus() {
        return k;
    }
    /** 
    * This is a mutator method which changes status
    * 
    * 
    * 
    */
    public void changeStatus() {
        if (k) {
            k = false;
        } else {
            k = true;
        }

    }

    /** 
    * 
    * This is a acessor method whuch gets age
    * @return int age
    * 
    */
    public int getAge() {
        return age;
    }
    /** 
    * This is a mutator method which changes
    * age.
    * @param int num
    * 
    */
    public void changeAge(int num) {
        age = num;
    }
    /** 
    * This is a accesor method which gets
    * balance.
    * @return double balance
    * 
    * 
    */
    public double getBalance() {
        return balance;
    }
     /** 
    * This is a mutator method
    * which changes the balance to num
    * @param double num
    * 
    * 
    */
    public void changeBalance(double num) {
        balance = num;
    }
     /** 
    * 
    * This is a accesor method which
    * gets charitablity
    * @return int charitable score
    * 
    */
    public int getCharitablity() {
        return charitable;
    }
     /** 
    * This is a mutator method
    * which changes charitablity
    * @param int charitablity score
    * 
    */
    public void changeCharitability(int num) {
        charitable = num;
    }
     /** 
    * This is the Customer .equals method.
    * This determines if the Customer is a
    * Customer and then compares the names to
    * see if they are equal.
    * @param Object other
    * 
    * 
    */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Customer))
            return false;

        Customer cust = (Customer) other;
        return name.equals(cust.name) &&
            age == cust.age;
    }
      /** 
    * This provides a method to be able to
    * print out the Customers in a understandable
    * format.
    * 
    * 
    */
    @Override
    public String toString() {
        return "Name- " + name + " Age- " + age + " Balance= " + balance+" B";
    }


}