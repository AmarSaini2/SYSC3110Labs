import java.sql.Array;
import java.util.*;
public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfoArrayList = new ArrayList<>();

    public void addBuddy(String name){
        buddyInfoArrayList.add(new BuddyInfo(name));
    }

    public void removeBuddy(String name){
        for(BuddyInfo buddy: buddyInfoArrayList){
            if (buddy.getName().equals(name)){
                buddyInfoArrayList.remove(buddy);
                break;
            }
        }
        //buddy to remove not found.
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
