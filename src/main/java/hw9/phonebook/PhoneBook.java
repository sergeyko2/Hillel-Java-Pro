package hw9.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> phoneBook = new ArrayList<>();

    public void add(Record record) {
        phoneBook.add(record);
    }

    public Record find(String nameFind) {
        for (Record record : phoneBook) {
            if (record.getName().equals(nameFind)) return record;
        }
        return null;
    }
}
