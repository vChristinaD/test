import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> addressB;

    public AddressBook(){
        addressB = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            addressB.add(buddy);
        }
    }

    public void removeBuddy(int index){
        if(index >= 0 && index < addressB.size()){
            addressB.remove(index);
        }
    }

    public void newMethod(){

    }

    public static void main(String args[]){
        System.out.println("Address Book");
        BuddyInfo budInfo = new BuddyInfo("Homer", "123 Sesame Street", "0987654321");
        AddressBook addressBk = new AddressBook();
        addressBk.addBuddy(budInfo);
        addressBk.removeBuddy(0);

    }
}
