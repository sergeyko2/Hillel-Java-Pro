package hw9.phonebook;

public class MainAppPhoneBook {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new RecordEntry("Serhii", "0963899779"));
        phoneBook.add(new RecordEntry("Olya", "09635642779"));
        phoneBook.add(new RecordEntry("Irina", "0503815579"));
        phoneBook.add(new RecordEntry("Irina", "0503556659"));
        phoneBook.add(new RecordEntry("Yaroslav", "0625532779"));

        System.out.println(phoneBook.find("Irina"));
    }
}
