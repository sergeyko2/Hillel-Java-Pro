package hw9.phonebook;

public class MainAppPhoneBook {

    public static void main(String[] args) {

        PhoneBook myBook = new PhoneBook();
        myBook.add(new Record("Serhii", "0963899779"));
        myBook.add(new Record("Olya", "09635642779"));
        myBook.add(new Record("Irina", "0503815579"));
        myBook.add(new Record("Irina", "0503556659"));
        myBook.add(new Record("Yaroslav", "0625532779"));

        System.out.println(myBook.find("Irina"));
    }
}
