public class BuddyInfo {

    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {
        this.name = name;
    }

    private String name, address, phone_number;

    public static void main(String[] args) {
        BuddyInfo Homer = new BuddyInfo("Homer");
        System.out.println("Hello" + " " + Homer.getName());
    }
}
