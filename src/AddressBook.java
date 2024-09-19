import java.sql.Array;
import java.util.*;
public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfoArrayList = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy){
        buddyInfoArrayList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyInfoArrayList.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }//comment added on github
}
