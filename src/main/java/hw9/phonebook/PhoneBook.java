package hw9.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<RecordEntry> phoneBook = new ArrayList<>();

    public void add(RecordEntry recordEntry) {
        phoneBook.add(recordEntry);
    }

    public RecordEntry find(String nameFind) {
        for (RecordEntry recordEntry : phoneBook) {
            if (recordEntry.getName().equals(nameFind)) return recordEntry;
        }
        return null;
    }
}
