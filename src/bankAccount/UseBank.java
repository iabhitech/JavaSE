
package bankAccount;


import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Abhineet Verma
 */
public class UseBank {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        Account a1 = new Account(100, "Abhi", 50000.0);
        Account a2 = new Account(101, "Nitin", 32000.0);
        Account a3 = new Account(102, "Shivam", 40000.0);
        Account a4 = new Account(103, "Akash", 75000.0);
        Account a5 = new Account(103, "Akash", 75000.0);
        
        Bank bank = new Bank();
        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        bank.addAccount(a4);
        bank.addAccount(a5);
        
        System.out.println("All Bank Accounts Details:");
        Set<Map.Entry<Long,Account>> records = bank.getAllAccounts();
        Iterator<Map.Entry<Long,Account>> it = records.iterator();
        while(it.hasNext()){
            Map.Entry<Long, Account> entry = it.next();
            System.out.println("Account details: "+entry.getValue());
        }
        
        System.out.println("\nPlease enter a account no to search: ");
        long key = kb.nextLong();
        Account account = bank.getAccount(key);
        System.out.println("The bank details: "+account);
        
        System.out.println("\nPlease enter a account no to remove: ");
        key = kb.nextLong();
        System.out.println("Account Removed: "+bank.removeAccount(key));
        
        System.out.println("\nTotal Account in the Bank: "+bank.getCount());

    }
}
