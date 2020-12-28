/** 
 *This class tests a variety of methods which manipulate
 * the custpmers. Some of these include add, remove ,and modifier methods of customers.
 * There are also other methods like investMoney,  bankFraud, and Bankruptcy which do a variety of 
 * things to the customers attributes.
 * 
 * @author Sreeman Tummala
 * Due Date- 5/18/20
 * Teacher- Mrs.Ishman
 * Collaborators: None
 * Period:3
 */
import java.util.*;
import java.io.*;

public class Account {
    private Queue < Customer > CustomerList;
    private Set < Customer > CustomerSet;
    public Account() {
        CustomerList = new LinkedList < Customer > ();
        CustomerSet = new HashSet < Customer > ();
    }
     /** 
    * This method adds to the queue
    * and Set.
    * @param t is the Customer to add
    * 
    */
    public void addCustomer(Customer t) {
        // Complete this method...
        CustomerList.offer(t);
        CustomerSet.add(t);

    }
     /** 
    * This method removes a Customer from
    * the queue or set.
    *  @param t is the Customer to remove
    *  @return t is the removed customer
    * 
    * 
    */
    public Customer remove(Customer t) {
        // Complete this method...
        if (CustomerList.size() == 0) {
            return null;
        }
        Iterator < Customer > check = CustomerSet.iterator();

        boolean b = false;
        while (check.hasNext()) {
            Customer p = check.next();
            if (p.equals(t)) {
                b = true;
                check.remove();
            }
        }
        Queue < Customer > temp = new LinkedList < > ();
        int i = 0;
        while (CustomerList.size() != 0) {
            if (CustomerList.peek().equals(t)) {
                CustomerList.poll();

            }
            temp.add(CustomerList.poll());
        }
        while (temp.size() != 0) {
            CustomerList.add(temp.poll());
        }

        if (b == true) {
            return t;
        } else {
            return null;
        }

    }
     /** 
    * 
    *  This method changes the customers age
    *  @param p is the Customer to change age
    *  @param int num is the age to change to
    * 
    */
    public void modifyAge(Customer p, int num) {
        Iterator < Customer > check2 = CustomerSet.iterator();
        int i = 0;

        while (check2.hasNext() && !p.equals(check2)) {
            p = check2.next();
        }
        //p.getCharitablity()=p.getCharitablity()+1;
        p.changeAge(num);


    }
     /** 
    * This method changes the customers name
    * @param Customer p is the customer to change the name
    * @param String name is the name to change to 
    * 
    */
    public void modifyName(Customer p, String name) {
        Iterator < Customer > check2 = CustomerSet.iterator();

        /*
        	while(check2.hasNext()&&!p.equals(check2))
        	{
        		 p= check2.next();
        	}
        	*/
        //p.getCharitablity()=p.getCharitablity()+1;
        p.changeName(name);


    }
     /** 
    * This rating changes the charitability of 
    * the given Customer
    * @param Customer p
    * @param int num
    * 
    */
    public void modifyCharitability(Customer p, int num) {
        Iterator < Customer > check2 = CustomerSet.iterator();
        int i = 0;

        while (check2.hasNext() && !p.equals(check2)) {
            p = check2.next();
        }
        //p.getCharitablity()=p.getCharitablity()+1;
        p.changeCharitability(num);


    }
     /** 
    * 
    * This method changes the balance of the Customer
    * @param Customer p
    * @param int num
    * 
    */
    public void modifyBalance(Customer p, int num) {
        Iterator < Customer > check2 = CustomerSet.iterator();
        int i = 0;

        while (check2.hasNext() && !p.equals(check2)) {
            p = check2.next();
        }
        //p.getCharitablity()=p.getCharitablity()+1;
        p.changeBalance(num);


    }
     /** 
    * This method increases the persons money depending on 
    * how close they are to the front of the Queue.
    * @param Customer p
    * 
    * 
    */
    public void investMoney(Customer p) {
        int l = p.getCharitablity();
        int count = CustomerList.size();
        Queue < Customer > tem = new LinkedList < > (CustomerList);
        //int g=count;


        while (!tem.isEmpty()) {
            tem.poll();
            count--;
        }
        double moneyIncrease = (CustomerList.size() - count) * l;
        p.changeBalance(p.getBalance() + moneyIncrease);


    }
     /** 
    * This method goes to a given number in the queue 
    * and changes their balance and then goes through the set and increases
    * the balances after the num
    * @param int num
    * 
    * 
    * 
    */
    public void bankFraud(int q) {
        int i = 0;
        Iterator < Customer > check6 = CustomerSet.iterator();
        int total = 0;
        int amount = 0;
        while (check6.hasNext()) {
            Customer z = check6.next();
            if (i < q) {

                total += z.getBalance() / 2;
                z.changeBalance(z.getBalance() / 2);
            } else {
                amount = total / (CustomerSet.size() - q);
                z.changeBalance(z.getBalance() + amount);

            }
        }



    }
     /** 
    * 
    * 
    * 
    */
    public void Bankruptcy(Customer g) {

        double z = g.getBalance() / 2;
        g.changeBalance(z);
        Iterator < Customer > check7 = CustomerSet.iterator();
        while (check7.hasNext()) {
            Customer p = check7.next();
            if (p.equals(g)) {
                p = check7.next();
            }
            p.changeBalance(p.getBalance() + (z / CustomerSet.size()));
        }
    }
     /** 
    * If a person gets lucky their Charitability score
    * goes up and they get more money
    * @param Customer p
    * 
    */
    public void lucky(Customer p) {
        p.changeBalance(p.getBalance() + 10);
        p.changeCharitability(p.getCharitablity() + 1);
    }
      /** 
    * THis method returns the Customer list- the queue
    * 
    * 
    */
    public Queue < Customer > getCQueue() {
        return CustomerList;
    }
     /** 
    * 
    * This method returns the CustomerSet- the set
    * 
    */
    public Set < Customer > getSet() {
        return CustomerSet;
    }


}