
package bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Abhineet Verma
 */
public class Bank {
    HashMap<Long, Account> hashmap = new HashMap<>();
    
    public Account addAccount(Account account){
        return hashmap.put(account.getAccountNo() ,account);
    }
    public Account getAccount(long accountNo){
        return hashmap.get(accountNo);
    }
    public Account removeAccount(long accountNo){
        return hashmap.remove(accountNo);
    }
    public int getCount(){
        return hashmap.size();
    }
    public Set<Map.Entry<Long, Account>> getAllAccounts(){
        return hashmap.entrySet();
    }
}