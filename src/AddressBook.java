import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> addressB;

    public void addBuddy(BuddyInfo buddy){
        addressB.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        addressB.remove(buddy);
    }

    public static void main(String args[]){
        System.out.println("Address Book");
        BuddyInfo budInfo = new BuddyInfo("Homer", "123 Sesame Street", "0987654321");
        AddressBook addressBk = new AddressBook();
        addressBk.addBuddy(budInfo);
        addressBk.removeBuddy(budInfo);

    }
}
